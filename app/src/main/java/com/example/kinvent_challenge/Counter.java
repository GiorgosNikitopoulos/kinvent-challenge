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
import static com.example.kinvent_challenge.MainActivity.salads_made;


public class Counter extends Fragment {
    private TextView saladText;

    Button saladButton;

    String message;
    public Counter() {

    }

    @Override
    public void setUserVisibleHint(boolean visibleHint) {
        super.onHiddenChanged(visibleHint);
        if(visibleHint){
            saladText.setText("Salads made: " + String.valueOf(salads_made));
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.counter, container, false);

        saladText = (TextView) view.findViewById(R.id.textView61);
        saladButton = (Button) view.findViewById(R.id.button60);
        saladButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //pastaButton.setText("Bacon: " + String.valueOf(chef.add_bacon()));
                if(chef.get_plate() == 0 &&
                        chef.get_knife() == 0 &&
                        chef.get_cucumber() >= 1 &&
                        chef.get_tomato() >= 1){
                    chef.dirty_plate();
                    chef.dirty_knife();
                    chef.sub_cucumber(1);
                    chef.sub_tomato(1);
                    salads_made++;
                    saladText.setText("Salads made: " + String.valueOf(salads_made));
                }
            }
        });

        return view;
    }

    public static Counter newInstance(Chef chef){
        Bundle args = new Bundle();
        Counter fragment = new Counter();
        return fragment;
    }

}
