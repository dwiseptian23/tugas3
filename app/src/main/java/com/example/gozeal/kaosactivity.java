package com.example.gozeal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class kaosactivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kaosactivity);

        ImageView gmbrkaos1 = findViewById(R.id.gmbrkaos1);
        ImageView gmbrkaos2 = findViewById(R.id.gmbrkaos2);
        ImageView gmbrkaos3 = findViewById(R.id.gmbrkaos3);
        ImageView gmbrkaos4 = findViewById(R.id.gmbrkaos4);
        ImageView gmbrkaos5 = findViewById(R.id.gmbrkaos5);
        TextView deskkaos1 = findViewById(R.id.deskkaos1);
        TextView deskkaos2 = findViewById(R.id.deskkoas2);
        TextView deskkaos3 = findViewById(R.id.deskkaos3);
        TextView deskkaos4 = findViewById(R.id.deskkaos4);
        TextView deskkaos5 = findViewById(R.id.deskkaos5);

        gmbrkaos1.setOnClickListener(this);
        gmbrkaos2.setOnClickListener(this);
        gmbrkaos3.setOnClickListener(this);
        gmbrkaos4.setOnClickListener(this);
        gmbrkaos5.setOnClickListener(this);
        deskkaos1.setOnClickListener(this);
        deskkaos2.setOnClickListener(this);
        deskkaos3.setOnClickListener(this);
        deskkaos4.setOnClickListener(this);
        deskkaos5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.gmbrkaos1 || v.getId()==R.id.deskkaos1){
            Detail kaos1 = new Detail();
            kaos1.setNama("Gozeal | Tees | Brown");
            kaos1.setHarga("Rp. 119.000,00");
            kaos1.setGambar("kaos1");
            kaos1.setBahan("Cotton Combed");
            kaos1.setUkuran("M, L");
            kaos1.setBerat("249 g");

            Intent intent = new Intent(kaosactivity.this,DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA,kaos1);
            startActivity(intent);
        }
        if (v.getId()==R.id.gmbrkaos2 || v.getId()==R.id.deskkoas2) {
            Detail kaos2 = new Detail();
            kaos2.setNama("Gozeal | Tess | Small Step");
            kaos2.setHarga("Rp. 119,000,00");
            kaos2.setGambar("kaos2");
            kaos2.setBahan("Cotton Combed");
            kaos2.setUkuran("M, L");
            kaos2.setBerat("249 g");

            Intent intent = new Intent(kaosactivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, kaos2);
            startActivity(intent);
        }
        if (v.getId()==R.id.gmbrkaos3 || v.getId()==R.id.deskkaos3) {
            Detail kaos3 = new Detail();
            kaos3.setNama("Gozeal | Tees | Bella White");
            kaos3.setHarga("Rp. 119,000,00");
            kaos3.setGambar("kaos3");
            kaos3.setBahan("Cotton Combed");
            kaos3.setUkuran("M, L");
            kaos3.setBerat("249 g");

            Intent intent = new Intent(kaosactivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, kaos3);
            startActivity(intent);
        }
        if (v.getId()==R.id.gmbrkaos4 || v.getId()==R.id.deskkaos4) {
            Detail kaos4 = new Detail();
            kaos4.setNama("Gozeal | Tees | Cats");
            kaos4.setHarga("Rp. 119,000,00");
            kaos4.setGambar("kaos4");
            kaos4.setBahan("Cotton Combed");
            kaos4.setUkuran("M, L");
            kaos4.setBerat("249 g");

            Intent intent = new Intent(kaosactivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, kaos4);
            startActivity(intent);
        }
        if (v.getId()==R.id.gmbrkaos5 || v.getId()==R.id.deskkaos5) {
            Detail kaos5 = new Detail();
            kaos5.setNama("Gozeal | Tees | Washed Trace");
            kaos5.setHarga("Rp. 129,000,00");
            kaos5.setGambar("kaos5");
            kaos5.setBahan("Cotton Combed");
            kaos5.setUkuran("M, L");
            kaos5.setBerat("249 g");

            Intent intent = new Intent(kaosactivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, kaos5);
            startActivity(intent);
        }
    }
}