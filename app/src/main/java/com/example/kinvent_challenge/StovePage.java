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

import static com.example.kinvent_challenge.MainActivity.chef;
import static com.example.kinvent_challenge.MainActivity.pasta_bolognese_made;


public class StovePage extends Fragment {
    private TextView pasta_text;

    Button pastaButton;

    String message;
    public StovePage() {

    }

    @Override
    public void setUserVisibleHint(boolean visibleHint) {
        super.onHiddenChanged(visibleHint);
        if(visibleHint){
            pasta_text.setText("Pasta Bolognese made: " + String.valueOf(pasta_bolognese_made));
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.stove, container, false);

        pasta_text = (TextView) view.findViewById(R.id.textView26);
        pastaButton = (Button) view.findViewById(R.id.button19);
        pastaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //pastaButton.setText("Bacon: " + String.valueOf(chef.add_bacon()));
                if(chef.get_saucepan() == 0 &&
                   chef.get_plate() == 0 &&
                   chef.get_grater() == 0 &&
                   chef.get_knife() == 0 &&
                   chef.get_colander() == 0 &&
                   chef.get_olive_oil() >= 1 &&
                   chef.get_bacon() >= 4 &&
                   chef.get_celstick() >= 2 &&
                   chef.get_rosemary() >= 2 &&
                   chef.get_beef() >= 1 &&
                   chef.get_tomato() >= 2 &&
                   chef.get_chili() >= 1 &&
                   chef.get_cheese() >= 1 &&
                   chef.get_pasta() >= 1 &&
                   chef.get_onion() >= 2 &&
                   chef.get_carrot() >= 2){

                    chef.dirty_saucepan();
                    chef.dirty_plate();
                    chef.dirty_grater();
                    chef.dirty_knife();
                    chef.dirty_colander();
                    chef.sub_olive_oil(1);
                    chef.sub_bacon(4);
                    chef.sub_celstick(2);
                    chef.sub_rosemary(2);
                    chef.sub_beef(1);
                    chef.sub_tomato(2);
                    chef.sub_chili(1);
                    chef.sub_cheese(1);
                    chef.sub_pasta(1);
                    chef.sub_onion(2);
                    chef.sub_carrot(2);
                    pasta_bolognese_made++;
                    pasta_text.setText("Pasta Bolognese made: " + String.valueOf(pasta_bolognese_made));
                }
            }
        });

        return view;
    }

    public static StovePage newInstance(Chef chef){
        Bundle args = new Bundle();
        StovePage fragment = new StovePage();
        return fragment;
    }

}
