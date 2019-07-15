package com.example.gourav.sbtac;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    public void fun3(View view){
        Intent i = new Intent(Main3Activity.this, Main4Activity.class);

        startActivity(i);
    }
    public void fun4(View view){
        Intent i = new Intent(Main3Activity.this, Main5Activity.class);

        startActivity(i);
    }
}
