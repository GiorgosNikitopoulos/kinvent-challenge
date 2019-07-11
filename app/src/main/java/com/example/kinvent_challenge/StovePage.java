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


public class StovePage extends Fragment {

    private TextView bowlText;
    private TextView colanderText;
    private TextView graterText;
    private TextView plateText;
    private TextView saucepanText;
    private TextView trayText;
    private TextView siftText;
    private TextView knifeText;

    Button bowlButton;
    Button colanderButton;
    Button graterButton;
    Button plateButton;
    Button saucepanButton;
    Button trayButton;
    Button siftButton;
    Button knifeButton;

    String message;
    public StovePage() {

    }

    @Override
    public void setUserVisibleHint(boolean visibleHint) {
        super.onHiddenChanged(visibleHint);
        if(visibleHint){
            //textView.setText(String.valueOf(chef.get_bacon()));
            if(chef.get_bowl() == 0){
                bowlText.setText("The bowl is clean");
            }else{
                bowlText.setText("The bowl is dirty");
            }

            if(chef.get_colander() == 0){
                colanderText.setText("The colander is clean");
            }else{
                colanderText.setText("The colander is dirty");
            }

            if(chef.get_grater() == 0){
                graterText.setText("The grater is clean");
            }else{
                graterText.setText("The grater is dirty");
            }

            if(chef.get_plate() == 0){
                plateText.setText("The plate is clean");
            }else{
                plateText.setText("The plate is dirty");
            }

            if(chef.get_saucepan() == 0){
                saucepanText.setText("The saucepan is clean");
            }else{
                saucepanText.setText("The saucepan is dirty");
            }

            if(chef.get_tray() == 0){
                trayText.setText("The tray is clean");
            }else{
                trayText.setText("The tray is dirty");
            }

            if(chef.get_sift() == 0){
                siftText.setText("The sift is clean");
            }else {
                siftText.setText("The sift is dirty");
            }

            if(chef.get_knife() == 0){
                knifeText.setText("The knife is clean");
            }else{
                knifeText.setText("The knife is dirty");
            }
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.stove, container, false);





        return view;
    }

    public static StovePage newInstance(Chef chef){
        Bundle args = new Bundle();
        StovePage fragment = new StovePage();
        return fragment;
    }

}
