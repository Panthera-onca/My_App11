package com.example.myapplication.myapplication11.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.myapplication11.R;


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private String[] mDataset;

    public MyAdapter(String[] mDataset) {
        this.mDataset = mDataset;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView tvInfo;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvInfo = itemView.findViewById(R.id.tv_info);

        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = (LayoutInflater) parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.presentation_ligne, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tvInfo.setText(mDataset[position]);

    }

    @Override
    public int getItemCount() {

        return mDataset.length;
    }

}
