package com.example.gozeal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class hoodieActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoodie);

        ImageView gmbrhoodie1 = findViewById(R.id.gmbrhoodie1);
        ImageView gmbrhoodie2 = findViewById(R.id.gmbrhoodie2);
        ImageView gmbrhoodie3 = findViewById(R.id.gmbrhoodie3);
        ImageView gmbrhoodie4 = findViewById(R.id.gmbrhoodie4);
        ImageView gmbrhoodie5 = findViewById(R.id.gmbrhoodie5);
        TextView deskhoodie1 = findViewById(R.id.deskhoodie1);
        TextView deskhoodie2 = findViewById(R.id.deskhoodie2);
        TextView deskhoodie3 = findViewById(R.id.deskhoodie3);
        TextView deskhoodie4 = findViewById(R.id.deskhoodie4);
        TextView deskhoodie5 = findViewById(R.id.deskhoodie5);

        gmbrhoodie1.setOnClickListener(this);
        gmbrhoodie2.setOnClickListener(this);
        gmbrhoodie3.setOnClickListener(this);
        gmbrhoodie4.setOnClickListener(this);
        gmbrhoodie5.setOnClickListener(this);
        deskhoodie1.setOnClickListener(this);
        deskhoodie2.setOnClickListener(this);
        deskhoodie3.setOnClickListener(this);
        deskhoodie4.setOnClickListener(this);
        deskhoodie5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.gmbrhoodie1 || v.getId()==R.id.deskhoodie1){
            Detail hoodie1 = new Detail();
            hoodie1.setNama("Gozeal | Hoodie Boxy | Drain");
            hoodie1.setHarga("Rp. 279,000,00");
            hoodie1.setGambar("hooide1");
            hoodie1.setBahan("Cotton Fleece 330GSM");
            hoodie1.setUkuran("M, L");
            hoodie1.setBerat("399 g");

            Intent intent = new Intent(hoodieActivity.this,DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA,hoodie1);
            startActivity(intent);
        }
        if (v.getId()==R.id.gmbrhoodie2 || v.getId()==R.id.deskhoodie2){
            Detail hoodie2 = new Detail();
            hoodie2.setNama("Gozeal | Hoodie | Forgot");
            hoodie2.setHarga("Rp. 279,000,00");
            hoodie2.setGambar("hoodie2");
            hoodie2.setBahan("Cotton Fleece 330GSM");
            hoodie2.setUkuran("M, L");
            hoodie2.setBerat("399 g");

            Intent intent = new Intent(hoodieActivity.this,DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA,hoodie2);
            startActivity(intent);
        }
        if (v.getId()==R.id.gmbrhoodie3 || v.getId()==R.id.deskhoodie3){
            Detail hoodie3 = new Detail();
            hoodie3.setNama("Gozeal | Hoodie | Washed Gone");
            hoodie3.setHarga("Rp. 279,000,00");
            hoodie3.setGambar("hooide3");
            hoodie3.setBahan("Cotton Fleece 330GSM");
            hoodie3.setUkuran("M, L");
            hoodie3.setBerat("399 g");

            Intent intent = new Intent(hoodieActivity.this,DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA,hoodie3);
            startActivity(intent);
        }
        if (v.getId()==R.id.gmbrhoodie4 || v.getId()==R.id.deskhoodie4){
            Detail hoodie4 = new Detail();
            hoodie4.setNama("Gozeal | Hoodie | 2Tone Dijon Beige");
            hoodie4.setHarga("Rp. 279,000,00");
            hoodie4.setGambar("hoodie4");
            hoodie4.setBahan("Cotton Fleece 330GSM");
            hoodie4.setUkuran("M, L");
            hoodie4.setBerat("399 g");

            Intent intent = new Intent(hoodieActivity.this,DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA,hoodie4);
            startActivity(intent);
        }
        if (v.getId()==R.id.gmbrhoodie5 || v.getId()==R.id.deskhoodie5){
            Detail hoodie5 = new Detail();
            hoodie5.setNama("Gozeal | Hoodie | Lucid");
            hoodie5.setHarga("Rp. 279,000,00");
            hoodie5.setGambar("hoodie5");
            hoodie5.setBahan("Cotton Fleece 330GSM");
            hoodie5.setUkuran("M, L");
            hoodie5.setBerat("399 g");

            Intent intent = new Intent(hoodieActivity.this,DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA,hoodie5);
            startActivity(intent);
        }
    }
}