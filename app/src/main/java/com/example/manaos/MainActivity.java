package com.example.manaos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import kotlinx.coroutines.MainCoroutineDispatcher;


public class MainActivity extends AppCompatActivity {

    EditText user,pass;
    Button btnlogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user= findViewById(R.id.user);
        pass=findViewById(R.id.pass);
        btnlogin= findViewById(R.id.btnlogin);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(user.getText().toString().equals("alumno")&& pass.getText().toString().equals("1234")){

                    Intent intent = new Intent(MainActivity.this,Principal.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity.this,"Acceso Otorgado",Toast.LENGTH_SHORT).show();

                }else{
                    Toast.makeText(MainActivity.this,"Uno de los des parámetros está Mal",Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}