package com.example.mvp.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ProgressBar;

import com.example.mvp.Presenter.MainPresenter;
import com.example.mvp.R;

import java.util.ArrayList;

public class favourites_item extends AppCompatActivity {
    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourites_item);
       // progressBar=(ProgressBar)findViewById(R.id.Loading);
      //  progressBar.setVisibility(progressBar.VISIBLE);

        RecyclerView recyclerView=findViewById(R.id.res_id);
        MainPresenter mainPresenter=new MainPresenter();
       ArrayList<company>array_of_Company= mainPresenter.onclick_on_Button_faviourt(this);
        recyclerviewAdapter adapter=new recyclerviewAdapter(array_of_Company,this);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
     //   progressBar.setVisibility(progressBar.INVISIBLE);


    }
}