package com.example.kinvent_challenge;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import static com.example.kinvent_challenge.MainActivity.chef;


public class EmptyPage extends Fragment {

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
    public EmptyPage() {

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
        View view = inflater.inflate(R.layout.empty, container, false);

        bowlText = view.findViewById(R.id.textView16);
        colanderText = view.findViewById(R.id.textView18);
        graterText = view.findViewById(R.id.textView19);
        plateText = view.findViewById(R.id.textView21);
        saucepanText = view.findViewById(R.id.textView22);
        trayText = view.findViewById(R.id.textView23);
        siftText = view.findViewById(R.id.textView24);
        knifeText = view.findViewById(R.id.textView25);

        bowlButton = (Button) view.findViewById(R.id.button22);
        bowlButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chef.clean_bowl();
                bowlText.setText("The bowl is clean");
            }
        });
        colanderButton = (Button) view.findViewById(R.id.button17);
        colanderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chef.clean_colander();
                colanderText.setText("The colander is clean");
            }
        });
        graterButton = (Button) view.findViewById(R.id.button16);
        graterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chef.clean_grater();
                graterText.setText("The grater is clean");
            }
        });

        plateButton = (Button) view.findViewById(R.id.button20);
        plateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chef.clean_plate();
                plateText.setText("The plate is clean");
            }
        });

        saucepanButton = (Button) view.findViewById(R.id.button21);
        saucepanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chef.clean_saucepan();
                saucepanText.setText("The saucepan is clean");
            }
        });

        trayButton = (Button) view.findViewById(R.id.button18);
        trayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chef.clean_tray();
                trayText.setText("The tray is clean");
            }
        });

        siftButton = (Button) view.findViewById(R.id.button23);
        siftButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chef.clean_sift();
                siftText.setText("The sift is clean");
            }
        });

        siftButton = (Button) view.findViewById(R.id.button23);
        siftButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chef.clean_sift();
                siftText.setText("The sift is clean");
            }
        });

        knifeButton = (Button) view.findViewById(R.id.button24);
        knifeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chef.clean_knife();
                knifeText.setText("The knife is clean");
            }
        });

        return view;
    }

    public static EmptyPage newInstance(Chef chef){
        Bundle args = new Bundle();
        EmptyPage fragment = new EmptyPage();
        args.putString("chef", chef.get_desc());
        fragment.setArguments(args);
        return fragment;
    }

}
