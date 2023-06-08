package com.example.manaos;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Principal extends AppCompatActivity {
    Button btnprogramador,btncallus,btnwebsite,btnlocation ;

    String _urllocation = "https://www.google.com/maps/place/Av.+Brig.+Gral.+Juan+Manuel+de+Rosas+25150,+Virrey+del+Pino,+Provincia+de+Buenos+Aires/@-34.8639075,-58.6657403,18z/data=!4m14!1m7!3m6!1s0x95bcdc60d200f6c1:0x7813de53fa0b093b!2sManaos!8m2!3d-34.8635071!4d-58.6656329!16s%2Fg%2F1q64c05b0!3m5!1s0x95bcdc66ec1b86bb:0x58318301b72f2d61!8m2!3d-34.8645327!4d-58.6647575!16s%2Fg%2F11jymj94r3?hl=es&entry=ttu";
    String _url = "https://www.manaosargentina.com.ar";
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater= getMenuInflater();
        inflater.inflate(R.menu.menuprincipal,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int itemId = item.getItemId();
        if (itemId == R.id.aboutdevelop) {
            Intent intent = new Intent(Principal.this, Acercade.class);
            startActivity(intent);
            Toast.makeText(Principal.this,getString(R.string.toastBienvenidosperfil), Toast.LENGTH_SHORT).show();
            return true;
        } else if (itemId == R.id.manaoshist) {
            Intent intenthistoria = new Intent(Principal.this, HistoriaManaos.class);
            startActivity(intenthistoria);
            Toast.makeText(Principal.this, getString(R.string.toastvamosmanaos), Toast.LENGTH_SHORT).show();
            return true;
        } else if (itemId == R.id.exitapp) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        btncallus= findViewById(R.id.btncallus);
        btnwebsite=findViewById(R.id.btnwebsite);
        btnlocation=findViewById(R.id.btnlocation);
        btnprogramador=findViewById(R.id.btnprogramador);

        btnlocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri _link = Uri.parse(_urllocation);
                Intent intent = new Intent(Intent.ACTION_VIEW,_link);
                startActivity(intent);
            }
        });

        btnwebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Uri _link = Uri.parse(_url);
             Intent intent = new Intent(Intent.ACTION_VIEW,_link);
             startActivity(intent);
            }
        });

        btncallus.setOnClickListener(view -> {
            String phone = "tel:02202499180";
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);

        });

        btnprogramador.setOnClickListener(view -> {
            Intent intent = new Intent(Principal.this,Acercade.class);
            startActivity(intent);
            Toast.makeText(Principal.this, getString(R.string.toastBienvenidosperfil), Toast.LENGTH_SHORT).show();
        });

    }





  }