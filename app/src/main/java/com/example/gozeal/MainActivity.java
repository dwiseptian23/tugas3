package com.example.gozeal;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView gmbrkaos = findViewById(R.id.gmbrkaos);
        ImageView gmbrhooide = findViewById(R.id.gmbrhoodie);
        ImageView gmbrtopi = findViewById(R.id.gmbrtopi);
        TextView deskkaos = findViewById(R.id.deskkaos);
        TextView deskhoodie = findViewById(R.id.deskkaos);
        TextView desktopi = findViewById(R.id.desktopi);

        gmbrkaos.setOnClickListener(this);
        gmbrhooide.setOnClickListener(this);
        gmbrtopi.setOnClickListener(this);
        deskkaos.setOnClickListener(this);
        deskhoodie.setOnClickListener(this);
        desktopi.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.deskkaos|| v.getId()==R.id.gmbrkaos){
            Intent intent = new Intent(this, kaosactivity.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.deskhoodie|| v.getId()==R.id.gmbrhoodie) {
            Intent intent = new Intent(this, hoodieActivity.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.desktopi|| v.getId()==R.id.gmbrtopi) {
            Intent intent = new Intent(this, topiactivity.class);
            startActivity(intent);
        }
    }
}