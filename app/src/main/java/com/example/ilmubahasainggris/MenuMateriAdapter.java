package com.example.ilmubahasainggris;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.ilmubahasainggris.Materi.Materi2Activity;
import com.example.ilmubahasainggris.Materi.Materi3Activity;
import com.example.ilmubahasainggris.Materi.Materi4Activity;
import com.example.ilmubahasainggris.Materi.Materi5Activity;
import com.example.ilmubahasainggris.Materi.Materi6Activity;
import com.example.ilmubahasainggris.Materi.Materi7Activity;
import com.example.ilmubahasainggris.Materi.Materi8Activity;
import com.example.ilmubahasainggris.Materi.MateriActivity;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class MenuMateriAdapter extends RecyclerView.Adapter<MenuMateriAdapter.viewholder> {

    private List<MenuMateriModel> menuMateriModelList;

    public MenuMateriAdapter(List<MenuMateriModel> menuMateriModelList) {
        this.menuMateriModelList = menuMateriModelList;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.menu_latihan_item,parent, false);
        return new viewholder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {

        holder.setData(menuMateriModelList.get(position).getImageUrl(), menuMateriModelList.get(position).getTitle());

    }

    @Override
    public int getItemCount() {
        return menuMateriModelList.size();
    }

    class viewholder extends RecyclerView.ViewHolder{

        private CircleImageView imageView;
        private TextView title;
        private TextView Materi1;
        private TextView Materi2;
        private TextView Materi3;
        private TextView Materi4;
        private TextView Materi5;
        private TextView Materi6;
        private TextView Materi7;
        private TextView Materi8;



        public viewholder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.image_view);
            title = itemView.findViewById(R.id.tv_title);
        }

        private void setData (String url, final String title){

            Glide.with(itemView.getContext()).load(url).into(imageView);
            this.title.setText(title);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent setIntent = new Intent(itemView.getContext(), MateriActivity.class);
                    setIntent.putExtra("title",title);
                    itemView.getContext().startActivity(setIntent);
                }
            });

//            itemView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    Intent setIntent = new Intent(itemView.getContext(), Materi2Activity.class);
//                    setIntent.putExtra("title",title);
//                    itemView.getContext().startActivity(setIntent);
//                }
//            });
//
//            itemView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    Intent setIntent = new Intent(itemView.getContext(), Materi3Activity.class);
//                    setIntent.putExtra("title",title);
//                    itemView.getContext().startActivity(setIntent);
//                }
//            });
//
////            itemView.setOnClickListener(new View.OnClickListener() {
////                @Override
////                public void onClick(View view) {
////                    Intent setIntent = new Intent(itemView.getContext(), Materi4Activity.class);
////                    setIntent.putExtra("title",title);
////                    itemView.getContext().startActivity(setIntent);
////                }
////            });
////
////            itemView.setOnClickListener(new View.OnClickListener() {
////                @Override
////                public void onClick(View view) {
////                    Intent setIntent = new Intent(itemView.getContext(), Materi5Activity.class);
////                    setIntent.putExtra("title",title);
////                    itemView.getContext().startActivity(setIntent);
////                }
////            });
////
////            itemView.setOnClickListener(new View.OnClickListener() {
////                @Override
////                public void onClick(View view) {
////                    Intent setIntent = new Intent(itemView.getContext(), Materi6Activity.class);
////                    setIntent.putExtra("title",title);
////                    itemView.getContext().startActivity(setIntent);
////                }
////            });
////
////            itemView.setOnClickListener(new View.OnClickListener() {
////                @Override
////                public void onClick(View view) {
////                    Intent setIntent = new Intent(itemView.getContext(), Materi7Activity.class);
////                    setIntent.putExtra("title",title);
////                    itemView.getContext().startActivity(setIntent);
////                }
////            });
////
////            itemView.setOnClickListener(new View.OnClickListener() {
////                @Override
////                public void onClick(View view) {
////                    Intent setIntent = new Intent(itemView.getContext(), Materi8Activity.class);
////                    setIntent.putExtra("title",title);
////                    itemView.getContext().startActivity(setIntent);
////                }
////            });


        }
    }
}
