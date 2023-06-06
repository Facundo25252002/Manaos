package com.example.manaos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Acercade extends AppCompatActivity {
    Button btnenviarmaildev;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acercade);
        btnenviarmaildev = findViewById(R.id.btnenviarmaildev);


        btnenviarmaildev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Acercade.this, EnvioMail.class);
                startActivity(intent);
                Toast.makeText(Acercade.this, "Now you can write your email", Toast.LENGTH_SHORT).show();
            }
        });
    }
}