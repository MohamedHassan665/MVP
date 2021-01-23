package com.example.mvp.View;



public class company {
    private String Name;
    private int logo;
    private String Manager;
   public company(String name, int logo, String manager) {
        Name = name;
        this.logo = logo;
        Manager = manager;

    }

    public String getName() {
        return Name;
    }

    public int getLogo() {
        return logo;
    }

    public String getManager() {
        return Manager;
    }
}
