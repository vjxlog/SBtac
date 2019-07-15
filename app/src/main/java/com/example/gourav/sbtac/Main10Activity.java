package com.example.gourav.sbtac;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Main10Activity extends AppCompatActivity {
   // DriverDatabase helper=new DriverDatabase(Main10Activity.this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
    }


    public void addDriver(View view) {

        if (view.getId() == R.id.btDriverData) {
            EditText a = (EditText) findViewById(R.id.etDriverName);
            String name = a.getText().toString();

            EditText b = (EditText) findViewById(R.id.etAddress);
            String address = b.getText().toString();
            EditText c = (EditText) findViewById(R.id.etPhoneno);
            String phone = c.getText().toString();
            EditText d = (EditText) findViewById(R.id.etBusno);
            String busno = d.getText().toString();


          //  DriverData obj = new DriverData();
          //  obj.setDName(name);
         //   obj.setDAddress(address);
          //  obj.setDPhone(phone);
          //  obj.setDBusNo(busno);

           // helper.insertDriver(obj);

            a.setText(null);
            b.setText(null);
            c.setText(null);
            d.setText(null);


            Toast temp = Toast.makeText(Main10Activity.this, "Driver added", Toast.LENGTH_SHORT);
            temp.show();

            Intent i = new Intent(Main10Activity.this, Main8Activity.class);
            startActivity(i);
        }
    }
}
