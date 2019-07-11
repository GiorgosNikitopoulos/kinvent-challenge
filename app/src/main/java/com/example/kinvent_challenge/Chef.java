package com.example.kinvent_challenge;

import java.io.Serializable;

public class Chef implements Serializable {
    String chef_name = "Bizd";
    Bacon bacon = new Bacon();
    Onion onion = new Onion();

    public Chef() {
        //Baking_Powder baking_powder = new Baking_Powder();
        //Beef be;
        //Carrot carrot;
        //Celery_Stick celery_stick;
        //Cheese cheese;
        //Chili chili;
        //Chocolate chocolate;
        //Egg egg;
        //Flour flour;
        //Milk milk;
        //Olive_Oil olive_oil;
        //Onion onion;
        //return;
    }
    public int get_bacon(){
        return bacon.getNumber();
    }
    public int add_bacon(){
        return bacon.add(1);
    }
    public int add_onion(){
        return onion.add(1);
    }
    public String get_desc(){
        return chef_name;
    }
}
