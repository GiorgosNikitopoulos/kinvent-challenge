package com.example.kinvent_challenge;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import static com.example.kinvent_challenge.MainActivity.chef;


public class EmptyPage extends Fragment {

    private TextView textView;
    String message;
    public EmptyPage() {

    }



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //Bundle bundle = getArguments();
        //bundle.getInt("pageNumber");


        //Chef chef = (Chef) bundle.getSerializable("chef");

        View view = inflater.inflate(R.layout.empty, container, false);

        textView = view.findViewById(R.id.textView16);
        textView.setText(String.valueOf(chef.get_bacon()));

        return view;
        //TextView =
        //return super.onCreateView(inflater, container, savedInstanceState);

    }

    @Override
    public void setUserVisibleHint(boolean visibleHint) {
        super.onHiddenChanged(visibleHint);
        if(visibleHint){
            textView.setText(String.valueOf(chef.get_bacon()));
        }
    }

    public static EmptyPage newInstance(Chef chef){
        Bundle args = new Bundle();
        EmptyPage fragment = new EmptyPage();
        args.putString("chef", chef.get_desc());
        fragment.setArguments(args);
        return fragment;
    }

}
