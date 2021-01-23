package com.example.mvp.View;

import com.example.mvp.R;

import java.util.ArrayList;

public class SetDataInRecyclearView {
    public ArrayList<company>getData()
    {
        company Instagram=new company("Instagram", R.drawable.instagram,"Mike Krieger");
        company amazone=new company("Amazone",R.drawable.amazon,"Jeffrey Preston Bezos");
        company appple=new company("Appple",R.drawable.apple,"Steve Jobs");
        company oracle=new company("Oracle",R.drawable.oracle,"Lawrence Joseph Ellison");
        company twitwer=new company("Twitwer",R.drawable.twitwer,"Jack Dorsey");
        company IBM=new company("IBM",R.drawable.ibmm,"Ginni Rometty");
        company micro=new company("Microsoft",R.drawable.microsoft,"Bill Gates");
        ArrayList<company> array_of_Company= new ArrayList<>();
        array_of_Company.add(Instagram);
        array_of_Company.add(amazone);
        array_of_Company.add(appple);
        array_of_Company.add(oracle);
        array_of_Company.add(twitwer);
        array_of_Company.add(IBM);
        array_of_Company.add(micro);
        return array_of_Company;
    }
}
