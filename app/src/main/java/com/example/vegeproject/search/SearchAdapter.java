package com.example.vegeproject.search;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.vegeproject.R;

import java.util.ArrayList;

public class SearchAdapter extends RecyclerView.Adapter<SearchAdapter.ViewHolder> {

    private ArrayList<RecyclerViewItem> arrayList;
    private Context context;

    public SearchAdapter(){}

    public SearchAdapter(Context context, ArrayList<RecyclerViewItem> arrayList) {
        this.arrayList = arrayList;
        this.context = context;
    }

    public void setArrayList(ArrayList<RecyclerViewItem> arrayList){
        this.arrayList = arrayList;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public SearchAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_search_result, parent, false);
        context = parent.getContext();
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SearchAdapter.ViewHolder holder, int position) {
        holder.tv_name.setText(arrayList.get(position).getPrdlstNm());
        Glide.with(context).load(arrayList.get(position).getImgUrl()).into(holder.iv_image);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tv_name;
        ImageView iv_image;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_name = itemView.findViewById(R.id.productname);
            iv_image = itemView.findViewById(R.id.productimage);

            // 아이템 클릭시 화면 전환과 데이터 전달
            itemView.setClickable(true);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int pos = getAdapterPosition();
                    if (pos != RecyclerView.NO_POSITION){
                        Intent intent = new Intent(context, SearchResultClick.class).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        intent.putExtra("prdlstNm", arrayList.get(pos).prdlstNm);
                        intent.putExtra("imgUrl", arrayList.get(pos).imgUrl);
                        context.startActivity(intent);
                    }
                }
            });
        }

    }

}