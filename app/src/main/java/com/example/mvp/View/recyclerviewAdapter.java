package com.example.mvp.View;


import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mvp.R;

import java.util.ArrayList;

public class recyclerviewAdapter extends RecyclerView.Adapter<recyclerviewAdapter.ViewHolder> {
ArrayList<company>detailsOf_company;
MainActivity mainActivity;
    public recyclerviewAdapter(ArrayList<company> detailsOf_company, MainActivity mainActivity) {
        this.detailsOf_company = detailsOf_company;
        this.mainActivity=mainActivity;
    }
    public recyclerviewAdapter(ArrayList<company> detailsOf_company, favourites_item favourites_item) {
        this.detailsOf_company = detailsOf_company;

    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerlayout,null,false);
        ViewHolder Holder=new ViewHolder(v);
        return Holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.logo.setImageResource(detailsOf_company.get(position).getLogo());
        holder.text_Manager.setText(detailsOf_company.get(position).getManager());
        holder.text_name.setText(detailsOf_company.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return detailsOf_company.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView text_name; ;
        TextView text_Manager;
        ImageView logo;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            text_name=itemView.findViewById(R.id.Name);
            text_Manager=itemView.findViewById(R.id.country);
           logo=itemView.findViewById(R.id.image);
           logo.setOnClickListener(this);

        }


        @Override
        public void onClick(View v) {

            int postion=getAdapterPosition();
            if(detailsOf_company.get(postion).getName()=="Oracle")
            {
                Intent intent =new Intent(mainActivity,OrcalActivity.class);
                DataBase sql=new DataBase(mainActivity.getApplicationContext());
                sql.insert(detailsOf_company.get(postion).getName(),detailsOf_company.get(postion).getLogo(),detailsOf_company.get(postion).getManager());
                mainActivity.startActivity(intent);

            }
            else if(detailsOf_company.get(postion).getName()=="Microsoft")
            {
                Intent intent =new Intent(mainActivity,MicrosoftActivity.class);
                DataBase sql=new DataBase(mainActivity.getApplicationContext());
                sql.insert(detailsOf_company.get(postion).getName(),detailsOf_company.get(postion).getLogo(),detailsOf_company.get(postion).getManager());
                mainActivity.startActivity(intent);
            }
            else if(detailsOf_company.get(postion).getName()=="IBM")
            {
                Intent intent =new Intent(mainActivity,IBMActivity.class);
                DataBase sql=new DataBase(mainActivity.getApplicationContext());
                sql.insert(detailsOf_company.get(postion).getName(),detailsOf_company.get(postion).getLogo(),detailsOf_company.get(postion).getManager());
                mainActivity.startActivity(intent);
            }
            else if(detailsOf_company.get(postion).getName()=="Twitwer")
            {
                Intent intent =new Intent(mainActivity,twitwerActivity.class);
                DataBase sql=new DataBase(mainActivity.getApplicationContext());
                sql.insert(detailsOf_company.get(postion).getName(),detailsOf_company.get(postion).getLogo(),detailsOf_company.get(postion).getManager());
                mainActivity.startActivity(intent);

            }

            else if(detailsOf_company.get(postion).getName()=="Instagram")
            {
                Intent intent =new Intent(mainActivity,InstagramActivity.class);
                DataBase sql=new DataBase(mainActivity.getApplicationContext());
                sql.insert(detailsOf_company.get(postion).getName(),detailsOf_company.get(postion).getLogo(),detailsOf_company.get(postion).getManager());
                mainActivity.startActivity(intent);
            }
            else if(detailsOf_company.get(postion).getName()=="Appple")
            {
                Intent intent =new Intent(mainActivity,ApppleActivity.class);
                DataBase sql=new DataBase(mainActivity.getApplicationContext());
                sql.insert(detailsOf_company.get(postion).getName(),detailsOf_company.get(postion).getLogo(),detailsOf_company.get(postion).getManager());
                mainActivity.startActivity(intent);
            }
            else if(detailsOf_company.get(postion).getName()=="Amazone")
            {
                Intent intent =new Intent(mainActivity,AmazoneActivity.class);
                DataBase sql=new DataBase(mainActivity.getApplicationContext());
                sql.insert(detailsOf_company.get(postion).getName(),detailsOf_company.get(postion).getLogo(),detailsOf_company.get(postion).getManager());
                mainActivity.startActivity(intent);
            }
        }
    }
}
