package com.example.mvp.View;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

public class DataBase extends SQLiteOpenHelper {
    static final String DBNAME="app.dp";
    public DataBase( Context context) {
        super(context,DBNAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table appData(Name text,id_picture number,Manager text ,primary key(Name,id_picture,Manager))");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS appData ");
        onCreate(db);

    }
    boolean insert(String Name,int id ,String Manager)
    {
        SQLiteDatabase sq=this.getWritableDatabase();
        ContentValues content=new ContentValues();
        content.put("Name" ,Name);
        content.put("id_picture" ,id);
        content.put("Manager" ,Manager);
        int val=(int) sq.insert("appData",null,content);
        if(val==-1)
            return false;
        else
            return true;

    }
void remove()
{
    SQLiteDatabase sq=this.getReadableDatabase();
    sq.execSQL("delete from appData");
}
   public ArrayList<company> get_data()
    {
        SQLiteDatabase sq=this.getReadableDatabase();
        ArrayList<company>arr=new ArrayList<>();
        Cursor cur= sq.rawQuery("select * from appData",null);
        while (cur.moveToNext())
        {
            String Name=cur.getString(0);
            int id=cur.getInt(1);
            String Manager=cur.getString(2);
            arr.add(new company(Name,id,Manager));
        }
        return arr;
    }
}
