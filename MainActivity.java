package com.example.pratikratnaparkhi.session5assignment4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username, password;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText)findViewById(R.id.edit_text_username);
        password=(EditText)findViewById(R.id.edit_text_password);
        login=(Button)findViewById(R.id.button_login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username.getText().toString().trim().length() > 0) {
                    if (password.getText().toString().trim().length() > 0) {

                        Intent mIntent = new Intent(MainActivity.this, SecondActivity.class);
                        Bundle mBundle = new Bundle();
                        String usernamevalue = username.getText().toString();
                        mBundle.putString("key",usernamevalue );
                        mIntent.putExtras(mBundle);
                        startActivity(mIntent);
                    }
                    else {
                        Toast.makeText(getApplicationContext(), "Enter valid password.", Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(getApplicationContext(), "Enter Valid Email Address.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
