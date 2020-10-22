package com.lnt.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public class CustomLayout extends RecyclerView.Adapter<CustomLayout.MyViewHolder>{
    ArrayList<String> personNames;
    Context context;
    public CustomLayout(Context context, ArrayList<String> personNames){
        this.context = context;
        this.personNames = personNames;
    }
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout, parent, false);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }
    @Override
    public void onBindViewHolder( MyViewHolder holder, final int position) {
        holder.name.setText(personNames.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, personNames.get(position), Toast.LENGTH_SHORT).show();;
            }
        });
    }
    @Override
    public int getItemCount() {
        return personNames.size();
    }
    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        public MyViewHolder(View itemview) {
            super(itemview);
            name = (TextView) itemview.findViewById(R.id.name);
        }
    }
}