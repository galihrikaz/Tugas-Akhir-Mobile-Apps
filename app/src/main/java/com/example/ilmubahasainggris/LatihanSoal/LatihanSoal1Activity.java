package com.example.ilmubahasainggris.LatihanSoal;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.ilmubahasainggris.R;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class LatihanSoal1Activity extends AppCompatActivity {

    private TextView pertanyaan,noIndicator;
    private LinearLayout optionsContainer;
    private Button nextBtn;
    private int count = 0;
    private List<LatihanSoal1Model> list;
    private int position =0;
    private int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan_soal1);

        pertanyaan = findViewById(R.id.pertanyaan);
        noIndicator = findViewById(R.id.no_indicator);
        optionsContainer = findViewById(R.id.options_container);
        nextBtn = findViewById(R.id.next);

//

        list = new ArrayList<>();

        list.add(new LatihanSoal1Model("Pertanyaan 1", "a","b","c","d","a"));
        list.add(new LatihanSoal1Model("Pertanyaan 2", "a","b","c","d","c"));
        list.add(new LatihanSoal1Model("Pertanyaan 3", "a","b","c","d","b"));
        list.add(new LatihanSoal1Model("Pertanyaan 4", "a","b","c","d","a"));
        list.add(new LatihanSoal1Model("Pertanyaan 5", "a","b","c","d","d"));
        list.add(new LatihanSoal1Model("Pertanyaan 6", "a","b","c","d","c"));
        list.add(new LatihanSoal1Model("Pertanyaan 7", "a","b","c","d","d"));
        list.add(new LatihanSoal1Model("Pertanyaan 8", "a","b","c","d","a"));
        list.add(new LatihanSoal1Model("Pertanyaan 9", "a","b","c","d","c"));
        list.add(new LatihanSoal1Model("Pertanyaan 10", "a","b","c","d","b"));

        for (int i = 0;i <4;i++){
            optionsContainer.getChildAt(i).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    checkAnswer((Button) v);

                }
            });
        }
        playAnim(pertanyaan, 0,list.get(position).getPertanyaan());
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nextBtn.setEnabled(false);
                nextBtn.setAlpha(0.7f);
                enableOption(true);
                position++;
                if (position == list.size()){
                    Intent scoreIntent = new Intent(LatihanSoal1Activity.this,ScoreActivity.class);
                    scoreIntent.putExtra("score",score);
                    scoreIntent.putExtra("total",list.size());
                    startActivity(scoreIntent);
                    finish();
                    return;
                }
                count = 0;
                playAnim(pertanyaan,0,list.get(position).getPertanyaan());
            }
        });


    }

    private void playAnim(final View view, final int value, final String data){

        view.animate().alpha(value).scaleX(value).scaleY(value).setDuration(500).setStartDelay(100)
                .setInterpolator(new DecelerateInterpolator()).setListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {
                if (value == 0 && count < 4 ){
                    String option = "";
                    if (count == 0){
                        option = list.get(position).getOptionA();
                    }else if (count == 1){
                        option = list.get(position).getOptionB();
                    }else if (count == 2){
                        option = list.get(position).getOptionC();
                    }else if (count == 3 ){
                        option = list.get(position).getOptionD();
                    }
                    playAnim(optionsContainer.getChildAt(count),0,option);
                    count++;
                }
            }
            @Override
            public void onAnimationEnd(Animator animator) {
                if (value ==0){
                    try {
                        ((TextView)view).setText(data);
                        noIndicator.setText(position+1+"/"+list.size());
                    }catch (ClassCastException ex){
                        ((Button)view).setText(data);
                    }
                    view.setTag(data);
                    playAnim(view, 1, data);
                }
            }
            @Override
            public void onAnimationCancel(Animator animator) {

            }

            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        });
    }

    private void checkAnswer(Button selectedOption){
        enableOption(false);
        nextBtn.setEnabled(true);
        nextBtn.setAlpha(1);
        if (selectedOption.getText().toString().equals(list.get(position).getCorrectANS())){
            //correct
                score++;
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                selectedOption.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#4CAF50")));
            }
        }else {
            ///incorrect
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                selectedOption.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#ff0000")));
                Button correctoption = (Button) optionsContainer.findViewWithTag(list.get(position).getCorrectANS());
                correctoption.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#4CAF50")));

            }
        }
    }

    private void enableOption(boolean enable){
        for (int i = 0;i <4;i++) {
            optionsContainer.getChildAt(i).setEnabled(enable);
            if (enable){
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    optionsContainer.getChildAt(i).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FFFFFF")));
                }

            }
        }
    }

}
