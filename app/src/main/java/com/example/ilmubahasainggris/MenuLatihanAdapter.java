package com.example.ilmubahasainggris;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.ilmubahasainggris.LatihanSoal.LatihanSoal1Activity;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class MenuLatihanAdapter extends RecyclerView.Adapter<MenuLatihanAdapter.viewholder> {

    private List<MenuLatihanModel> menuLatihanModelList;

    public MenuLatihanAdapter(List<MenuLatihanModel> menuLatihanModelList) {
        this.menuLatihanModelList = menuLatihanModelList;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.menu_latihan_item, parent, false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {

        holder.setData(menuLatihanModelList.get(position).getImageUrl(),menuLatihanModelList.get(position).getTitle());

    }

    @Override
    public int getItemCount() {
        return menuLatihanModelList.size();
    }

    class viewholder extends RecyclerView.ViewHolder{

        private CircleImageView imageView;
        private TextView title;

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
                    Intent setIntent = new Intent(itemView.getContext(), LatihanSoal1Activity.class);
                    setIntent.putExtra("title",title );
                    itemView.getContext().startActivity(setIntent);
                }
            });
        }
    }
}
