package com.example.gozeal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class topiactivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topiactivity);

        ImageView gmbrtopi1 = findViewById(R.id.gmbrtopi1);
        ImageView gmbrtopi2 = findViewById(R.id.gmbrtopi2);
        ImageView gmbrtopi3 = findViewById(R.id.gmbrtopi3);
        ImageView gmbrtopi4 = findViewById(R.id.gmbrtopi4);
        ImageView gmbrtopi5 = findViewById(R.id.gmbrtopi5);
        TextView desktopi1 = findViewById(R.id.desktopi1);
        TextView desktopi2 = findViewById(R.id.desktopi2);
        TextView desktopi3 = findViewById(R.id.desktopi3);
        TextView desktopi4 = findViewById(R.id.desktopi4);
        TextView desktopi5 = findViewById(R.id.desktopi5);

        gmbrtopi1.setOnClickListener(this);
        gmbrtopi2.setOnClickListener(this);
        gmbrtopi3.setOnClickListener(this);
        gmbrtopi4.setOnClickListener(this);
        gmbrtopi5.setOnClickListener(this);
        desktopi1.setOnClickListener(this);
        desktopi2.setOnClickListener(this);
        desktopi3.setOnClickListener(this);
        desktopi4.setOnClickListener(this);
        desktopi5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.gmbrtopi1 || v.getId()==R.id.desktopi1){
            Detail topi1 = new Detail();
            topi1.setNama("Gozeal | 5Panels | Nicco");
            topi1.setHarga("Rp. 100,000,00");
            topi1.setGambar("topi1");
            topi1.setBahan("nylon");
            topi1.setUkuran("One size it most");
            topi1.setBerat("500g");

            Intent intent = new Intent(topiactivity.this,DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA,topi1);
            startActivity(intent);
        }
        if (v.getId()==R.id.gmbrtopi2 || v.getId()==R.id.desktopi2){
            Detail topi2 = new Detail();
            topi2.setNama("Gozeal | Trucker Hat | Fire");
            topi2.setHarga("Rp. 100,000,00");
            topi2.setGambar("topi2");
            topi2.setBahan("nylon");
            topi2.setUkuran("One size it most");
            topi2.setBerat("500g");

            Intent intent = new Intent(topiactivity.this,DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA,topi2);
            startActivity(intent);
        }
        if (v.getId()==R.id.gmbrtopi3 || v.getId()==R.id.desktopi3){
            Detail topi3 = new Detail();
            topi3.setNama("Gozeal | Trucker Hat | Damian");
            topi3.setHarga("Rp. 100,000,00");
            topi3.setGambar("topi3");
            topi3.setBahan("nylon");
            topi3.setUkuran("One size it most");
            topi3.setBerat("500g");

            Intent intent = new Intent(topiactivity.this,DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA,topi3);
            startActivity(intent);
        }
        if (v.getId()==R.id.gmbrtopi4 || v.getId()==R.id.desktopi4){
            Detail topi4= new Detail();
            topi4.setNama("Gozeal | Polocaps | Bear Black");
            topi4.setHarga("Rp. 100,000,00");
            topi4.setGambar("topi4");
            topi4.setBahan("nylon");
            topi4.setUkuran("One size it most");
            topi4.setBerat("500g");

            Intent intent = new Intent(topiactivity.this,DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA,topi4);
            startActivity(intent);
        }
        if (v.getId()==R.id.gmbrtopi5 || v.getId()==R.id.desktopi5){
            Detail topi5 = new Detail();
            topi5.setNama("Gozeal | Polocaps | Slay");
            topi5.setHarga("Rp. 100,000,00");
            topi5.setGambar("topi5");
            topi5.setBahan("nylon");
            topi5.setUkuran("One size it most");
            topi5.setBerat("500g");

            Intent intent = new Intent(topiactivity.this,DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA,topi5);
            startActivity(intent);
        }
    }
}