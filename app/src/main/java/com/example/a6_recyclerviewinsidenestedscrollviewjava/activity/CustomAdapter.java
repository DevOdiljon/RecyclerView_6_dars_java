package com.example.a6_recyclerviewinsidenestedscrollviewjava.activity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a6_recyclerviewinsidenestedscrollviewjava.R;
import com.example.a6_recyclerviewinsidenestedscrollviewjava.model.Member;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter {
    Context context;
    List<Member> members;

    public CustomAdapter(Context context, List<Member> members) {
        this.context = context;
        this.members = members;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_custom_layout_view, parent, false);
        return new CustomView(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Member member = members.get(position);
    }

    @Override
    public int getItemCount() {
        return members.size();
    }

    private class CustomView extends RecyclerView.ViewHolder {
        public CustomView(View view) {
            super(view);
        }
    }
}
