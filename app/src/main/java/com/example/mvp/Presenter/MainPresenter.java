package com.example.mvp.Presenter;

import android.content.Intent;
import android.view.View;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mvp.Model.MainModel;
import com.example.mvp.R;
import com.example.mvp.View.company;
import com.example.mvp.View.MainActivity;
import com.example.mvp.View.favourites_item;
import com.example.mvp.View.recyclerviewAdapter;

import java.util.ArrayList;

public class MainPresenter {




    public ArrayList<company> onclick_on_Button_faviourt (favourites_item favourites_item) {
        //onclick belong button favipurt

        MainModel mainModel=new MainModel();
        ArrayList<company>array_of_Company=new ArrayList<company>();
        array_of_Company=mainModel.getData_FromDataBase(favourites_item);

return array_of_Company;
    }

}
