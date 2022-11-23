package com.example.proyectobda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginDBA extends AppCompatActivity {
    //private LoginViewModel loginViewModel;

    Button btnIngresar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_dba);

        btnIngresar = findViewById(R.id.btnIngresar);
    }

    public void pantalla2(View view){
        startActivity(new Intent(this, menu.class));
    }
}