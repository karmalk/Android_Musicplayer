package com.example.zzuli.myapplication_week3;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MyFragment3 extends Fragment {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getArguments();
        if (bundle != null) {
            String name = bundle.get("name").toString();
            Log.d("MyFragment", name);
        }
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.myfragment3, null);
        return view;
    }
    public static MyFragment3 newInstance(String name) {
        Bundle args = new Bundle();
        args.putString("name", name);
        MyFragment3 fragment = new MyFragment3();
        fragment.setArguments(args);
        return fragment;
    }
}
