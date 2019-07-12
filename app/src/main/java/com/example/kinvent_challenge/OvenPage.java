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
import static com.example.kinvent_challenge.MainActivity.muffins_made;


public class OvenPage extends Fragment {
    private TextView muffinText;

    Button muffinButton;

    String message;
    public OvenPage() {

    }

    @Override
    public void setUserVisibleHint(boolean visibleHint) {
        super.onHiddenChanged(visibleHint);
        if(visibleHint){
            muffinText.setText("Muffins made: " + String.valueOf(muffins_made));
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.oven, container, false);

        muffinText = (TextView) view.findViewById(R.id.textView51);
        muffinButton = (Button) view.findViewById(R.id.button50);
        muffinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //pastaButton.setText("Bacon: " + String.valueOf(chef.add_bacon()));
                if(chef.get_tray() == 0 &&
                   chef.get_bowl() == 0 &&
                   chef.get_sift() == 0 &&
                   chef.get_egg() >= 2 &&
                   chef.get_vegetable_oil() >= 1 &&
                   chef.get_milk() >= 2 &&
                   chef.get_sugar() >= 2 &&
                   chef.get_flour() >= 4 &&
                   chef.get_baking_powder() >= 3 &&
                   chef.get_chocolate() >= 1){
                    chef.dirty_tray();
                    chef.dirty_bowl();
                    chef.dirty_sift();
                    chef.sub_egg(2);
                    chef.sub_vegetable_oil(1);
                    chef.sub_milk(2);
                    chef.sub_sugar(2);
                    chef.sub_flour(4);
                    chef.sub_baking_powder(3);
                    chef.sub_chocolate(1);
                    muffins_made++;
                    muffinText.setText("Muffins made: " + String.valueOf(muffins_made));
                }
            }
        });

        return view;
    }

    public static OvenPage newInstance(Chef chef){
        Bundle args = new Bundle();
        OvenPage fragment = new OvenPage();
        return fragment;
    }

}
