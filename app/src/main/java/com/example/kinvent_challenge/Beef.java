package com.example.kinvent_challenge;

public class Beef extends Item {
    String description = "Beef is the culinary name for meat from cattle,"+
            "particularly skeletal muscle.";

    public Beef(){
        super();
    }
    public String get_desc(){
        return description;
    }
}
