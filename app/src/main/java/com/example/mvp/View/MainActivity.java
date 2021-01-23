package com.example.mvp.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import com.example.mvp.Presenter.MainPresenter;
import com.example.mvp.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
Button button_faviourt;
MainPresenter mainPresenter;

View view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_faviourt=(Button)findViewById(R.id.faviourt);

        button_faviourt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(getApplicationContext(),favourites_item.class);
                startActivity(intent);

            }
        });

        SetDataInRecyclearView setdata=new SetDataInRecyclearView();
        ArrayList<company> array_of_Company=  array_of_Company=setdata.getData();
        RecyclerView recyclerView=findViewById(R.id.res_id);
        recyclerviewAdapter ad=new recyclerviewAdapter(array_of_Company,this);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        Thread th=new Thread();
        recyclerView.setAdapter(ad);
    }

}