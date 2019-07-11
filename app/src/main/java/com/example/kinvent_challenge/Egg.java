package com.example.kinvent_challenge;

public class Egg extends Item {
    String description = "The egg is the organic vessel containing the zygote in which an embryo" +
            "develops until it can survive on its own; at which point the animal hatches." +
            "An egg results from fertilization of an egg cell." +
            "Most arthropods, vertebrates (excluding mammals), and mollusks lay eggs," +
            "although some, such as scorpions do not.\n";

    public Egg(){
        super();
    }
    public String get_desc(){
        return description;
    }
}
