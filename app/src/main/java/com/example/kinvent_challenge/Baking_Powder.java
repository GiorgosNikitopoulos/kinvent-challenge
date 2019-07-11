package com.example.kinvent_challenge;

public class Baking_Powder extends Item {
    String description = "Baking powder is a dry chemical leavening agent," +
            "a mixture of a carbonate or bicarbonate and a weak acid.";

    public Baking_Powder(){
        super();
    }
    public String get_desc(){
        return description;
    }
}
