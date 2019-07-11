package com.example.kinvent_challenge;

public class Chocolate extends Item {
    String description = "Chocolate is a usually sweet, brown food preparation of roasted and" +
            "ground cacao seeds that is made in the form of a liquid, paste, or in a block," +
            "or used as a flavoring ingredient in other foods. ";

    public Chocolate(){
        super();
    }
    public String get_desc(){
        return description;
    }
}
