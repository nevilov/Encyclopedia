package com.example.encyclopedia.adapter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

public class DataAdapter extends RecyclerView<DataAdapter.DataHolder> {
    public DataAdapter(@NonNull Context context) {
        super(context);
    }

    public DataAdapter(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DataAdapter(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public class DataHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        public DataHolder(@NonNull View itemView) {
            super(itemView);
        }

        @Override
        public void onClick(View view) {

        }
    }
}
