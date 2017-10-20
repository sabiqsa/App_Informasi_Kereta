package com.rizky.keretaapi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Petugas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petugas);

        Spinner spinnerKelas = (Spinner) findViewById(R.id.spinnerKelas);
        ArrayAdapter<String> adapterKelas = new ArrayAdapter<String> (Petugas.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.kelas));
        adapterKelas.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerKelas.setAdapter(adapterKelas);

        Spinner spinnerKereta = (Spinner) findViewById(R.id.spinnerKereta);
        ArrayAdapter<String> adapterKereta = new ArrayAdapter<String> (Petugas.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.kereta));
        adapterKereta.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerKereta.setAdapter(adapterKereta);

        Spinner spinnerJalur = (Spinner) findViewById(R.id.spinnerJalur);
        ArrayAdapter<String> adapterJalur = new ArrayAdapter<String> (Petugas.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.jalur));
        adapterJalur.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerJalur.setAdapter(adapterJalur);
    }

    public void onClickKeluar(View view){
        Intent i = new Intent(this,Masuk.class);
        startActivity(i);
    }
}
