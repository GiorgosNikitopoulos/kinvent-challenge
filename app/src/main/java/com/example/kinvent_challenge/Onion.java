package com.example.kinvent_challenge;

public class Onion extends Item {
    String description = "The onion (Allium cepa L., from Latin cepa \"onion\"),"+
            "also known as the bulb onion or common onion, is a vegetable that is" +
            "the most widely cultivated species of the genus Allium";
    public Onion(){
        super();
    }
    public String get_desc(){
        return description;
    }
}
