package com.example.kinvent_challenge;

import java.io.Serializable;

public class Chef implements Serializable {

    String chef_name = "Bizd";

    Knife knife = new Knife();
    Tray tray = new Tray();
    Sift sift = new Sift();
    Bowl bowl = new Bowl();
    Saucepan saucepan = new Saucepan();
    Colander colander = new Colander();
    Grater grater = new Grater();
    Plate plate = new Plate();

    Bacon bacon = new Bacon();
    Onion onion = new Onion();
    Carrot carrot = new Carrot();
    Celery_Stick  celery_stick = new Celery_Stick();
    Baking_Powder baking_powder = new Baking_Powder();
    Beef beef = new Beef();
    Cheese cheese = new Cheese();
    Chili chili = new Chili();
    Chocolate chocolate = new Chocolate();
    Egg egg = new Egg();
    Flour flour = new Flour();
    Milk milk = new Milk();
    Olive_Oil olive_oil = new Olive_Oil();
    Cucumber cucumber = new Cucumber();
    Tomato tomato = new Tomato();
    Rosemary_Leaf rosemary = new Rosemary_Leaf();
    Sugar sugar = new Sugar();
    Vegetable_Oil vegetable_oil = new Vegetable_Oil();

    public Chef() {
        //Leave Empty
    }
    //Chef Actions//
    public int get_plate(){
        return plate.isDirty();
    }
    public int clean_plate(){
        return plate.clean();
    }
    public int dirty_plate(){
        return plate.dirty();
    }


    public int get_grater(){
        return grater.isDirty();
    }
    public int clean_grater(){
        return grater.clean();
    }
    public int dirty_grater(){
        return grater.dirty();
    }

    public int get_colander(){
        return colander.isDirty();
    }
    public int clean_colander(){
        return colander.clean();
    }
    public int dirty_colander(){
        return colander.dirty();
    }

    public int get_saucepan(){
        return saucepan.isDirty();
    }
    public int clean_saucepan(){
        return saucepan.clean();
    }
    public int dirty_saucepan(){
        return saucepan.dirty();
    }

    public int get_bowl(){
        return bowl.isDirty();
    }
    public int clean_bowl(){
        return bowl.clean();
    }
    public int dirty_bowl(){
        return bowl.dirty();
    }

    public int get_sift(){
        return sift.isDirty();
    }
    public int clean_sift(){
        return sift.clean();
    }
    public int dirty_sift(){
        return sift.dirty();
    }

    public int get_tray(){
        return tray.isDirty();
    }
    public int clean_tray(){
        return tray.clean();
    }
    public int dirty_tray(){
        return tray.dirty();
    }

    public int get_knife(){
        return knife.isDirty();
    }
    public int clean_knife(){
        return knife.clean();
    }
    public int dirty_knife(){
        return knife.dirty();
    }

    public int get_bacon(){
        return bacon.getNumber();
    }
    public int add_bacon(){
        return bacon.add(1);
    }
    public int sub_bacon(int ammount){
        return bacon.sub(ammount);
    }

    public int get_onion(){
        return onion.getNumber();
    }
    public int add_onion(){
        return onion.add(1);
    }
    public int sub_onion(int ammount){
        return onion.sub(ammount);
    }

    public int get_carrot(){
        return carrot.getNumber();
    }
    public int add_carrot(){
        return carrot.add(1);
    }
    public int sub_carrot(int ammount){
        return carrot.sub(ammount);
    }

    public int get_celstick(){
        return celery_stick.getNumber();
    }
    public int add_celstick(){
        return celery_stick.add(1);
    }
    public int sub_celstick(int ammount){
        return celery_stick.sub(ammount);
    }

    public int get_baking_powder(){
        return baking_powder.getNumber();
    }
    public int add_baking_powder(){
        return baking_powder.add(1);
    }
    public int sub_baking_powder(int ammount){
        return baking_powder.sub(ammount);
    }

    public int get_beef(){
        return beef.getNumber();
    }

    public int add_beef(){
        return beef.add(1);
    }

    public int sub_beef(int ammount){
        return beef.sub(ammount);
    }

    public int get_cheese(){
        return cheese.getNumber();
    }

    public int add_cheese(){
        return cheese.add(1);
    }

    public int sub_cheese(int ammount){
        return cheese.sub(ammount);
    }

    public int get_chili(){
        return chili.getNumber();
    }

    public int add_chili(){
        return chili.add(1);
    }

    public int sub_chili(int ammount){
        return chili.sub(ammount);
    }

    public int get_chocolate(){
        return chocolate.getNumber();
    }

    public int add_chocolate(){
        return chocolate.add(1);
    }

    public int sub_chocolate(int ammount){
        return chocolate.sub(ammount);
    }

    public int get_egg(){
        return egg.getNumber();
    }

    public int add_egg(){
        return egg.add(1);
    }

    public int sub_egg(int ammount){
        return egg.sub(ammount);
    }

    public int get_flour(){
        return flour.getNumber();
    }

    public int add_flour(){
        return flour.add(1);
    }

    public int sub_flour(int ammount){
        return flour.sub(ammount);
    }

    public int get_milk(){
        return milk.getNumber();
    }

    public int add_milk(){
        return milk.add(1);
    }

    public int sub_milk(int ammount){
        return milk.sub(ammount);
    }

    public int get_olive_oil(){
        return olive_oil.getNumber();
    }

    public int add_olive_oil(){
        return olive_oil.add(1);
    }

    public int sub_olive_oil(int ammount){
        return olive_oil.sub(ammount);
    }

    public int get_cucumber(){
        return cucumber.getNumber();
    }

    public int add_cucumber(){
        return cucumber.add(1);
    }

    public int sub_cucumber(int ammount){
        return cucumber.sub(ammount);
    }

    public int get_tomato(){
        return tomato.getNumber();
    }

    public int add_tomato(){
        return tomato.add(1);
    }

    public int sub_tomato(int ammount){
        return tomato.sub(ammount);
    }

    public int get_rosemary(){
        return rosemary.getNumber();
    }

    public int add_rosemary(){
        return rosemary.add(1);
    }

    public int sub_rosemary(int ammount){
        return rosemary.sub(ammount);
    }

    public int get_sugar(){
        return sugar.getNumber();
    }

    public int add_sugar(){
        return sugar.add(1);
    }

    public int sub_sugar(int ammount){
        return sugar.sub(ammount);
    }
    public int get_vegetable_oil(){
        return vegetable_oil.getNumber();
    }

    public int add_vegetable_oil(){
        return vegetable_oil.add(1);
    }

    public int sub_vegetable_oil(int ammount){
        return vegetable_oil.sub(ammount);
    }
    public String get_desc(){
        return chef_name;
    }
}
