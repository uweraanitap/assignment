package com.example.c217064280;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username,password;
    Button login;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=(EditText)findViewById(R.id.username);
        password=(EditText)findViewById(R.id.password);
        login=(Button)findViewById(R.id.login);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = username.getText().toString();
                String pass = password.getText().toString();
                if (user.equals("") || pass.equals("")){
                    Toast.makeText(getApplicationContext(), "fill all field" , Toast.LENGTH_LONG).show();

                }
                else if (user.equals("carine") && pass.equals("dance")){
                    Toast.makeText(getApplicationContext(), "login succefull" , Toast.LENGTH_LONG).show();
                    Intent inti = new Intent(MainActivity.this,Navigation.class);
                    startActivity(inti);
                }
                else
                    Toast.makeText(getApplicationContext(), "invalid username or password" , Toast.LENGTH_LONG).show() ;
            }
        });
    }
}
