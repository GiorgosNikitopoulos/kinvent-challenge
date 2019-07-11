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

        final TextView onion_text;
        TextView egg_text;
        TextView cheese_text;
        TextView chili_text;
        TextView milk_text;
        TextView flour_text;
        TextView oliveoil_text;
        TextView rosemary_text;
        TextView tomato_text;
        TextView celery_text;
        final TextView bacon_text;
        TextView carrot_text;
        TextView baking_powder_text;
        TextView beef_text;
        TextView chocolate_text;
        TextView sugar_text;
        TextView vegetableoil_text;
        Button bacon_button;
        Button onion_button;
        final EmptyPage EPFrag = new EmptyPage();
        //public Chef chef = new Chef();

        final Bundle bundle = new Bundle();

        View view = inflater.inflate(R.layout.shop, container, false);
        //bundle.putString("chef", "bizd");
        //EPFrag.setArguments(bundle);
        bacon_text = (TextView) view.findViewById(R.id.textView38);
        bacon_text.setText("Bacon: " + String.valueOf(chef.get_bacon()));
        bacon_button = (Button) view.findViewById(R.id.button34);
        bacon_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bacon_text.setText("Bacon: " + String.valueOf(chef.add_bacon()));
                bundle.putString("chef", "howdy");
                EPFrag.setArguments(bundle);
            }
        });

        onion_text = (TextView) view.findViewById(R.id.textView13);
        onion_text.setText("Onions: " + String.valueOf(chef.get_bacon()));
        onion_button = (Button) view.findViewById(R.id.button13);
        onion_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onion_text.setText("Onions: " + String.valueOf(chef.add_onion()));
                bundle.putString("chef", "dyhow");
                EPFrag.setArguments(bundle);
            }
        });
        return view;

        //TextView =
        //return super.onCreateView(inflater, container, savedInstanceState);

    }
    public static ShopPage newInstance(Chef chef){
        Bundle args = new Bundle();
        ShopPage fragment = new ShopPage();
        fragment.setArguments(args);
        return fragment;
    }

}
