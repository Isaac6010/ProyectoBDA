package com.example.proyectobda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class menu extends AppCompatActivity {
    ImageButton btnVentas, btnInventario;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnVentas = findViewById(R.id.btnVentasMenu);
        btnInventario = findViewById(R.id.btnInventarioMenu);
    }
    public void pantallaVentas(View view){
        startActivity(new Intent(this, ventas.class));
    }

    public void pantallaInventario(View view){
        startActivity(new Intent(this, MainActivity.class));
    }
}