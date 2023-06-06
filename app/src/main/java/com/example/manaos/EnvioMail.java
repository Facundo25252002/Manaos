package com.example.manaos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EnvioMail extends AppCompatActivity {
  EditText etmail,etasunto,etcontenidomail;
  Button btnenviar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_envio_mail);
        etmail=findViewById(R.id.etmail);
        etasunto=findViewById(R.id.etasunto);
        etcontenidomail=findViewById(R.id.etcontenidomail);
        btnenviar= findViewById(R.id.btnenviar);

        btnenviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra(Intent.EXTRA_EMAIL,new String[]{etmail.getText().toString()});
                intent.putExtra(Intent.EXTRA_SUBJECT,etasunto.getText().toString());
                intent.putExtra(Intent.EXTRA_TEXT,etcontenidomail.getText().toString());
                startActivity(intent);
            }
        });

    }


}