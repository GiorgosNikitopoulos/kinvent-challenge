package com.example.kinvent_challenge;

public class Carrot extends Item {
    String description = "The carrot (Daucus carota subsp. sativus) is a root vegetable," +
            "usually orange in colour, though purple," +
            "black, red, white, and yellow cultivars exist.";
    public Carrot(){
        super();
    }
    public String get_desc(){
        return description;
    }
}
