package com.example.viajarej2di;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageSwitcher;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemViewHolder> {

    private final Context context;
    private List<Integer> imageList;

    public ItemAdapter(List<Integer> imageList, Context context){
        this.imageList = imageList;
        this.context = context;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, parent, false);
        return new ItemViewHolder(layoutView);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        int imageId = imageList.get(position);


        holder.imagen.setImageResource(imageId);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageSwitcher imageSwitcher = v.getRootView().findViewById(R.id.imageswitcher);
                imageSwitcher.setImageResource(imageId);
            }
        });

    }

    @Override
    public int getItemCount() {
            return imageList != null ? imageList.size() : 0;
    }
}
