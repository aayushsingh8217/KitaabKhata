package com.testpro.kitaabkhaata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText remail;
    private EditText rpass;
    private Button signin;
    private TextView lresgis;
    private TextView lforpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logindetails();
    }
    private void logindetails()
    {
        remail=findViewById(R.id.editTextTextEmailAddress);
        rpass=findViewById(R.id.editTextTextPassword);
        signin=findViewById(R.id.button);
        lresgis=findViewById(R.id.Sign_up);
        lforpass=findViewById(R.id.pass_reset);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email=remail.toString().trim();
                String pass=rpass.toString().trim();
                if(TextUtils.isEmpty(email))
                {
                    remail.setError("Invalid email!\n Enter again!");
                    return;
                }
                if(TextUtils.isEmpty(pass))
                {
                    rpass.setError("Enter a Valid password!");
                    return;
                }
            }
        });
        //Registraion activity
        lresgis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),sigupactivity.class));
            }
        });
        lforpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),reset_activity.class));
            }
        });
    }
}