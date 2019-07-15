package com.example.gourav.sbtac;

import android.content.Intent;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;

public class Main1Activity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);


    }
    public void fun(View view){
        Intent i = new Intent(Main1Activity.this, Main3Activity.class);

        startActivity(i);
    }
    public void fun1(View view){
        Intent i = new Intent(Main1Activity.this, Main2Activity.class);

        startActivity(i);
    }



}
