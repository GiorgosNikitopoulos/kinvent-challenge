package com.example.kinvent_challenge;

public class Plate extends Tool {
    String description = "A plate.";
    public Plate(){
        super();
        this.dirty();
    }
    public String get_desc(){
        return description;
    }
}
