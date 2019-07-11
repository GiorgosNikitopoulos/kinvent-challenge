package com.example.kinvent_challenge;

public class Tomato extends Item {
    String description = "The tomato is the edible, often red, berry of the plant" +
            "Solanum lycopersicum, commonly known as a tomato plant.";

    public Tomato(){
        super();
    }
    public String get_desc(){
        return description;
    }
}
