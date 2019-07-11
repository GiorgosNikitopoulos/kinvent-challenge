package com.example.kinvent_challenge;

public class Tool {
    int isDirty;


    public Tool() {
        isDirty = 0;
    }
    public int isDirty(){
        return isDirty;
    }
    public int dirty(){
        isDirty = 1;
        return isDirty;
    }
    public int clean(){
        isDirty = 0;
        return isDirty;
    }
}
