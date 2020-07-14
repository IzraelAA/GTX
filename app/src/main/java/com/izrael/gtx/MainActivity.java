package com.izrael.gtx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {
Button          login;
TextInputLayout username,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = findViewById(R.id.name);
        password = findViewById(R.id.password);
        login = findViewById(R.id.buttonlogin);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });
    }


    private void login(){
        if (username.getEditText().getText().toString().equals("")){
            username.setError("Isi Username");
        }else if (password.getEditText().getText().toString().equals("")){
            password.setError("Isi Password");
        }else if (username.getEditText().getText().toString().equals("Panca")&&password.getEditText().getText().toString().equals("izi")){
            Intent intent = new Intent(MainActivity.this,DashboardActivity.class);
            startActivity(intent);
        }else{
            Toast.makeText(this, "Username / kata sandi salah", Toast.LENGTH_SHORT).show();
        }
    }
}
