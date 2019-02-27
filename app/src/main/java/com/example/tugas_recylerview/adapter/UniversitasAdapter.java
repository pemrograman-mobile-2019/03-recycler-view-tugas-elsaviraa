package com.example.tugas_recylerview.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tugas_recylerview.R;
import com.example.tugas_recylerview.models.Universitas;
import com.squareup.picasso.Picasso;

import java.util.List;

public class UniversitasAdapter extends RecyclerView.Adapter<UniversitasAdapter.ViewHolder> {
    private List<Universitas> universitasList;

    public UniversitasAdapter(List<Universitas> universitasList) {

        this.universitasList = universitasList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View filmView = inflater.inflate(R.layout.item_universitas, viewGroup, false);

        return new ViewHolder(filmView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Universitas universitas = universitasList.get(i);

        if (universitas.getImg() != null) {
            Picasso.get().load(universitas.getImg()).into(viewHolder.imageView);
        } else {
            Picasso.get().load(universitas.getImg_local()).into(viewHolder.imageView);
        }

        viewHolder.textView.setText(universitas.getTitle());
    }

    @Override
    public int getItemCount() {
        return universitasList.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView;
        TextView descView;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.item_universitas_img_local);
            textView = itemView.findViewById(R.id.item_universitas_title);
            descView = itemView.findViewById(R.id.item_universitas_desc);
        }
    }

}
