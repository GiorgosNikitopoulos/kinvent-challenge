package com.example.kinvent_challenge;

public class Cheese extends Item {
    String description = "Cheese is a dairy product derived from milk that is produced"+
            "in a wide range of flavors, textures, and"+
            "forms by coagulation of the milk protein casein.";

    public Cheese(){
        super();
    }
    public String get_desc(){
        return description;
    }
}
 