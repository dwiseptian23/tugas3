package com.example.gozeal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    public static final String KEY_DATA = "key_object";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView gambar = findViewById(R.id.fotoproduk);
        TextView nama = findViewById(R.id.namaproduk);
        TextView harga = findViewById(R.id.hargaproduk);
        TextView ukuran = findViewById(R.id.ukuranproduk);
        TextView bahan = findViewById(R.id.bahanproduk);
        TextView berat = findViewById(R.id.beratproduk);

        Detail detail;
        if (Build.VERSION.SDK_INT>=33){
            detail = getIntent().getParcelableExtra(KEY_DATA, Detail.class);
        }else {
            detail = getIntent().getParcelableExtra(KEY_DATA);
        }
        String sourceGambar = detail.getGambar();
        int sourceGambarID = getResources().getIdentifier(sourceGambar,"drawable", getPackageName());
        gambar.setImageResource(sourceGambarID);

        nama.setText(detail.getNama());
        harga.setText(detail.getHarga());
        ukuran.setText(detail.getUkuran());
        bahan.setText(detail.getBahan());
        berat.setText(detail.getBerat());

    }
}