package com.example.viajarej2di;

import android.view.View;
import android.widget.ImageSwitcher;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ItemViewHolder extends RecyclerView.ViewHolder {

    protected ImageView imagen;

    public ItemViewHolder(@NonNull View itemView){
        super(itemView);
        imagen = itemView.findViewById(R.id.imagenItem);

    }
}
