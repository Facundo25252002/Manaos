package com.example.manaos;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Principal extends AppCompatActivity {
  Button btnprogramador;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        btnprogramador=findViewById(R.id.btnprogramador);

        btnprogramador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Principal.this,Acercade.class);
                startActivity(intent);
                Toast.makeText(Principal.this, "Bienvenidos a Mi Perfil", Toast.LENGTH_SHORT).show();
            }
        });

    }
}