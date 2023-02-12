package com.testpro.kitaabkhaata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

public class sigupactivity extends AppCompatActivity {
    private EditText rname;
    private EditText rphn;
    private EditText rdate;
    private  EditText remail;
    private EditText rpass;
    private Button rbres;
    private TextView rsignu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sigupactivity);
        registration();
    }
    private void registration()
    {
        rname=findViewById(R.id.editTextTextPersonName);
        rphn=findViewById(R.id.editTextPhone);
        rdate=findViewById(R.id.editTextDate);
        remail=findViewById(R.id.res_email);
        rpass=findViewById(R.id.res_pass);
        rbres=findViewById(R.id.res_button);
        rsignu=findViewById(R.id.Sign_up_res);
        rbres.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                String name=rname.toString().trim();
                String phn=rphn.toString().trim();
                String date= rdate.toString().trim();
                String email=remail.toString().trim();
                String pass=rpass.toString().trim();
                if(TextUtils.isEmpty(email))
                {
                    remail.setError("Invalid email!\n Enter again!");
                    return;
                }
                if(TextUtils.isEmpty(name))
                {
                    rname.setError("Enter Valid Name");
                    return ;
                }
                if(TextUtils.isEmpty(date))
                {
                    rdate.setError("Enter Valid date");
                    return;
                }
                if(TextUtils.isEmpty(pass))
                {
                    rpass.setError("Enter a Valid password!");
                    return;
                }
            }
        });
        rsignu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        });



    }
}