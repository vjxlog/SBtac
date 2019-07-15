package com.example.gourav.sbtac;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main8Activity extends AppCompatActivity {

    //DatabaseHelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        //db = new DatabaseHelper(Main8Activity.this);
    }
    public void fun11(View view){
        Intent i = new Intent(Main8Activity.this, Main9Activity.class);

        startActivity(i);
    }
    public void fun12(View view){
        Intent i = new Intent(Main8Activity.this, Main10Activity.class);

        startActivity(i);
    }
}
