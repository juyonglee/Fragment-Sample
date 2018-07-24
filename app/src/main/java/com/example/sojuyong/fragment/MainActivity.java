package com.example.sojuyong.fragment;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void viewAdd01() {

    }

    public void viewAdd02() {
         LayoutInflater inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
         View view = inflater.inflate(R.layout.activity_main, null);
         setContentView(view);
    }

    public void viewAdd03() {
         LayoutInflater inflater = getLayoutInflater();
         View view = inflater.inflate(R.layout.activity_main, null);
         setContentView(view);
    }

    public void viewAdd04() {
        LayoutInflater inflater = LayoutInflater.from(this);
        View view = inflater.inflate(R.layout.activity_main, null);
        setContentView(view);
    }
}
