package com.example.gourav.sbtac;

/**
 * Created by Vijay Mahajan on 01-10-2017.
 */

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;



public class RegisterRequest extends StringRequest {

    private static final   String REGISTER_REQUEST_URL="https://sbtac.000webhostapp.com/reg.php";
    private Map<String,String> params;

    public RegisterRequest(int id,String name,String address, String email, int busnumber, int phnnumber , Response.Listener<String> listener){
        super(Method.POST,REGISTER_REQUEST_URL,listener,null);
        params=new HashMap<>();

        params.put("id",id +"");
        params.put("name",name);
        params.put("address",address);
        params.put("email",email);
        params.put("busnumber", busnumber +"");
        params.put("phnnumber",phnnumber +"");
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}

