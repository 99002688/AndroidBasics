package com.lnt.cardview;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public class CustomLayout extends RecyclerView.Adapter<CustomLayout.MyViewHolder> {
    ArrayList<String> personNames;
    ArrayList<String> personDetails;
    ArrayList<Integer> images;
    Context context;
    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView textViewName;
        public TextView textViewDetail;
        public ImageView images;
        public MyViewHolder(View itemView){
            super(itemView);
            textViewName= (TextView) itemView.findViewById(R.id.textViewName);
            textViewDetail=(TextView) itemView.findViewById(R.id.textViewDetail);
            images = (ImageView) itemView.findViewById(R.id.imageView);
        }
    }

    public CustomLayout(Context context, ArrayList<String> persondata, ArrayList<String> persondetails, ArrayList<Integer> images){
        this.context=context;
        this.personNames=persondata;
        this.personDetails=persondetails;
        this.images=images;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflate item layout
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout,parent,false);
        //set the view size, margins, paddings, layout parameters
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final  MyViewHolder holder,final int position) {
        holder.images.setImageResource(images.get(position));
        holder.textViewName.setText(personNames.get(position));
        holder.textViewDetail.setText(personDetails.get(position));



        holder.itemView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(context, personNames.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }
    @Override
    public int getItemCount() {
        return (personNames.size());
    }
}
