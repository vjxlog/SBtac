package com.example.gourav.sbtac;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Main9Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        final EditText etID = (EditText) findViewById(R.id.etID);
        final EditText etname = (EditText) findViewById(R.id.etName);
        final EditText etaddress = (EditText) findViewById(R.id.etBatch);
        final EditText etemail = (EditText) findViewById(R.id.etEmail);
        final EditText etbusnumber = (EditText) findViewById(R.id.etBusNumber);
        final EditText etphonenumber = (EditText) findViewById(R.id.etPhoneNumber);

        final Button AddStudent = (Button) findViewById(R.id.btAddStudent);


        AddStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final int id = Integer.parseInt(etID.getText().toString());
                final String name = etname.getText().toString();
                final String address = etaddress.getText().toString();
                final String email = etemail.getText().toString();
                final int busnumber = Integer.parseInt(etbusnumber.getText().toString());
                final int phonenumber = Integer.parseInt(etphonenumber.getText().toString());


                Response.Listener<String> responseListener = new Response.Listener<String>() {

                    @Override
                    public void onResponse(String response) {
                        try {

                            JSONObject jsonResponse = new JSONObject(response);
                            boolean success = jsonResponse.getBoolean("success");
                            if (success) {
                                Intent intent = new Intent(Main9Activity.this, Main9Activity.class);
                                Main9Activity.this.startActivity(intent);

                            } else {
                                AlertDialog.Builder builder = new AlertDialog.Builder(Main9Activity.this);
                                builder.setMessage("Register Failed");
                                builder.setNegativeButton("Retry", null)
                                        .create()
                                        .show();
                                etname.setText("");
                                etaddress.setText("");
                                etemail.setText("");
                                etbusnumber.setText("");
                                etphonenumber.setText("");
                            }


                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                    }

                };
                RegisterRequest registerRequest = new RegisterRequest(id,name, address, email, busnumber, phonenumber, responseListener);
                RequestQueue queue = Volley.newRequestQueue(Main9Activity.this);
                queue.add(registerRequest);


            }
        });

    }
}


