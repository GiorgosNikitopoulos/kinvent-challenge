package com.example.kinvent_challenge;

public class Item {
    int number;


    public Item() {
        number = 0;
    }
    public int add(int ammount){
        number = number + ammount;
        return number;
    }
    public int sub(int ammount){
        number = number - ammount;
        return number;
    }
    public int getNumber(){
        return number;
    }
}
