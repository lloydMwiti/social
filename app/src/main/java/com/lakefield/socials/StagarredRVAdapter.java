package com.lakefield.socials;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StagarredRVAdapter extends RecyclerView.Adapter<StagarredRVAdapter.ImageViewHolder> {
    Context context;
    List<Row> mdata;

    public StagarredRVAdapter(Context context, List<Row> mdata) {
        this.context = context;
        this.mdata = mdata;
    }

    @NonNull
    @Override
    public StagarredRVAdapter.ImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(context).inflate(R.layout.single_view,parent,false);
        return new ImageViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull StagarredRVAdapter.ImageViewHolder holder, int position) {
        holder.img.setImageResource(mdata.get(position).getImg());
    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }

    public class ImageViewHolder extends RecyclerView.ViewHolder{
        ImageButton img;

        public ImageViewHolder(@NonNull View itemView) {
            super(itemView);
            img=itemView.findViewById(R.id.row_img);
        }
    }

}
