package com.example.mvp.Model;
import com.example.mvp.View.DataBase;
import com.example.mvp.View.MainActivity;
import com.example.mvp.View.company;
import com.example.mvp.View.favourites_item;

import java.util.ArrayList;
public class MainModel {
   public ArrayList<company> getData_FromDataBase(favourites_item favourites_item)
   {
       DataBase dataBase=new DataBase(favourites_item);
      ArrayList<company>arr= dataBase.get_data();
       return arr;
   }

}
