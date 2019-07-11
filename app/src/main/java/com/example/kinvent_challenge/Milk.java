package com.example.kinvent_challenge;

public class Milk extends Item {
    String description = "Milk is a nutrient-rich, white liquid food produced by" +
            "the mammary glands of mammals. ";

    public Milk(){
        super();
    }
    public String get_desc(){
        return description;
    }
}
