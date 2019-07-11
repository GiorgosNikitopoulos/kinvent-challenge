package com.example.kinvent_challenge;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.io.Serializable;

import static com.example.kinvent_challenge.MainActivity.chef;

public class ShopPage extends Fragment {
    public ShopPage() {
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        final TextView chili_text;
        final TextView bacon_text;
        final TextView baking_powder_text;
        final TextView onion_text;
        final TextView beef_text;
        final TextView carrot_text;
        final TextView celstick_text;
        final TextView cheese_text;
        final TextView chocolate_text;
        final TextView cucumber_text;
        final TextView egg_text;
        final TextView flour_text;
        final TextView milk_text;
        final TextView olive_oil_text;
        final TextView rosemary_text;
        final TextView sugar_text;
        final TextView tomato_text;
        final TextView vegetable_oil_text;

        Button bacon_button;
        Button onion_button;
        Button beef_button;
        Button baking_powder_button;
        Button carrot_button;
        Button celstick_button;
        Button cheese_button;
        Button chocolate_button;
        Button cucumber_button;
        Button egg_button;
        Button flour_button;
        Button milk_button;
        Button olive_oil_button;
        Button rosemary_button;
        Button sugar_button;
        Button tomato_button;
        Button vegetable_oil_button;
        Button chili_button;

        View view = inflater.inflate(R.layout.shop, container, false);

        bacon_text = (TextView) view.findViewById(R.id.textView38);
        bacon_text.setText("Bacon: " + String.valueOf(chef.get_bacon()));
        bacon_button = (Button) view.findViewById(R.id.button34);
        bacon_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bacon_text.setText("Bacon: " + String.valueOf(chef.add_bacon()));
            }
        });

        baking_powder_text = (TextView) view.findViewById(R.id.textView8);
        baking_powder_text.setText("Powder: " + String.valueOf(chef.get_baking_powder()));
        baking_powder_button = (Button) view.findViewById(R.id.button8);
        baking_powder_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                baking_powder_text.setText("Powder: " + String.valueOf(chef.add_baking_powder()));
            }
        });

        onion_text = (TextView) view.findViewById(R.id.textView7);
        onion_text.setText("Onions: " + String.valueOf(chef.get_onion()));
        onion_button = (Button) view.findViewById(R.id.button7);
        onion_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onion_text.setText("Onions: " + String.valueOf(chef.add_onion()));
            }
        });

        beef_text = (TextView) view.findViewById(R.id.textView12);
        beef_text.setText("Beef: " + String.valueOf(chef.get_beef()));
        beef_button = (Button) view.findViewById(R.id.button12);
        beef_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                beef_text.setText("Beef: " + String.valueOf(chef.add_beef()));
            }
        });

        carrot_text = (TextView) view.findViewById(R.id.textView);
        carrot_text.setText("Carrot: " + String.valueOf(chef.get_carrot()));
        carrot_button = (Button) view.findViewById(R.id.button);
        carrot_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                carrot_text.setText("Carrot: " + String.valueOf(chef.add_carrot()));
            }
        });

        celstick_text = (TextView) view.findViewById(R.id.textView2);
        celstick_text.setText("Celery: " + String.valueOf(chef.get_celstick()));
        celstick_button = (Button) view.findViewById(R.id.button2);
        celstick_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                celstick_text.setText("Celery: " + String.valueOf(chef.add_celstick()));
            }
        });

        cheese_text = (TextView) view.findViewById(R.id.textView3);
        cheese_text.setText("Cheese: " + String.valueOf(chef.get_cheese()));
        cheese_button = (Button) view.findViewById(R.id.button3);
        cheese_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cheese_text.setText("Cheese: " + String.valueOf(chef.add_cheese()));
            }
        });

        chocolate_text = (TextView) view.findViewById(R.id.textView4);
        chocolate_text.setText("Chocolate: " + String.valueOf(chef.get_chocolate()));
        chocolate_button = (Button) view.findViewById(R.id.button4);
        chocolate_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chocolate_text.setText("Chocolate: " + String.valueOf(chef.add_chocolate()));
            }
        });

        cucumber_text = (TextView) view.findViewById(R.id.textView5);
        cucumber_text.setText("Cucumber: " + String.valueOf(chef.get_cucumber()));
        cucumber_button = (Button) view.findViewById(R.id.button5);
        cucumber_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cucumber_text.setText("Cucumber: " + String.valueOf(chef.add_cucumber()));
            }
        });

        egg_text = (TextView) view.findViewById(R.id.textView11);
        egg_text.setText("Egg: " + String.valueOf(chef.get_egg()));
        egg_button = (Button) view.findViewById(R.id.button11);
        egg_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                egg_text.setText("Egg: " + String.valueOf(chef.add_egg()));
            }
        });

        flour_text = (TextView) view.findViewById(R.id.textView13);
        flour_text.setText("Flour: " + String.valueOf(chef.get_flour()));
        flour_button = (Button) view.findViewById(R.id.button13);
        flour_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                flour_text.setText("Flour: " + String.valueOf(chef.add_flour()));
            }
        });

        milk_text = (TextView) view.findViewById(R.id.textView44);
        milk_text.setText("Milk: " + String.valueOf(chef.get_milk()));
        milk_button = (Button) view.findViewById(R.id.button26);
        milk_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                milk_text.setText("Milk: " + String.valueOf(chef.add_milk()));
            }
        });

        olive_oil_text = (TextView) view.findViewById(R.id.textView15);
        olive_oil_text.setText("Olive oil: " + String.valueOf(chef.get_olive_oil()));
        olive_oil_button = (Button) view.findViewById(R.id.button15);
        olive_oil_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                olive_oil_text.setText("Olive oil: " + String.valueOf(chef.add_olive_oil()));
            }
        });

        rosemary_text = (TextView) view.findViewById(R.id.textView15);
        rosemary_text.setText("Olive oil: " + String.valueOf(chef.get_rosemary()));
        rosemary_button = (Button) view.findViewById(R.id.button15);
        rosemary_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rosemary_text.setText("Olive oil: " + String.valueOf(chef.add_rosemary()));
            }
        });

        sugar_text = (TextView) view.findViewById(R.id.textView10);
        sugar_text.setText("Sugar: " + String.valueOf(chef.get_sugar()));
        sugar_button = (Button) view.findViewById(R.id.button10);
        sugar_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sugar_text.setText("Sugar: " + String.valueOf(chef.add_sugar()));
            }
        });

        tomato_text = (TextView) view.findViewById(R.id.textView14);
        tomato_text.setText("Tomato: " + String.valueOf(chef.get_tomato()));
        tomato_button = (Button) view.findViewById(R.id.button14);
        tomato_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tomato_text.setText("Tomato: " + String.valueOf(chef.add_tomato()));
            }
        });

        vegetable_oil_text = (TextView) view.findViewById(R.id.textView9);
        vegetable_oil_text.setText("Veggy Oil: " + String.valueOf(chef.get_vegetable_oil()));
        vegetable_oil_button = (Button) view.findViewById(R.id.button9);
        vegetable_oil_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vegetable_oil_text.setText("Veggy Oil: " + String.valueOf(chef.add_vegetable_oil()));
            }
        });

        chili_text = (TextView) view.findViewById(R.id.textView6);
        chili_text.setText("Chili: " + String.valueOf(chef.get_chili()));
        chili_button = (Button) view.findViewById(R.id.button6);
        chili_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chili_text.setText("Chili: " + String.valueOf(chef.add_chili()));
            }
        });

        return view;
    }
    public static ShopPage newInstance(Chef chef){
        Bundle args = new Bundle();
        ShopPage fragment = new ShopPage();
        fragment.setArguments(args);
        return fragment;
    }

}
