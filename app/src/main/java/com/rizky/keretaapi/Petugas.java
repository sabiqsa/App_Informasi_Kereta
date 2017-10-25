package com.rizky.keretaapi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Petugas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petugas);

        final Spinner spinnerKelas = (Spinner) findViewById(R.id.spinnerKelas);
        final Spinner spinnerKereta = (Spinner) findViewById(R.id.spinnerKereta);
        final Spinner spinnerJalur = (Spinner) findViewById(R.id.spinnerJalur);

        ArrayAdapter<String> adapterKelas = new ArrayAdapter<String> (Petugas.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.daftarkelas));
        adapterKelas.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerKelas.setAdapter(adapterKelas);
        spinnerKelas.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                String spinnerKelasSelected = parent.getItemAtPosition(position).toString();

                if(spinnerKelasSelected.equals("Kelas 1")){
                    ArrayAdapter<String> adapterKereta = new ArrayAdapter<String> (Petugas.this,
                            android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.kelas1));
                    adapterKereta.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinnerKereta.setAdapter(adapterKereta);
                }
                else if(spinnerKelasSelected.equals("Kelas 2")){
                    ArrayAdapter<String> adapterKereta = new ArrayAdapter<String> (Petugas.this,
                            android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.kelas2));
                    adapterKereta.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinnerKereta.setAdapter(adapterKereta);
                }
                else if(spinnerKelasSelected.equals("Kelas 3")){
                    ArrayAdapter<String> adapterKereta = new ArrayAdapter<String> (Petugas.this,
                            android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.kelas3));
                    adapterKereta.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinnerKereta.setAdapter(adapterKereta);
                }
            }
            public void onNothingSelected(AdapterView<?> parent)
            {

            }
        });

        spinnerKereta.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                String spinnerKeretaSelected = parent.getItemAtPosition(position).toString();

                if(spinnerKeretaSelected.equals("Kereta 1")){
                    ArrayAdapter<String> adapterJalur = new ArrayAdapter<String> (Petugas.this,
                            android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.kereta1));
                    adapterJalur.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinnerJalur.setAdapter(adapterJalur);
                }
                else if(spinnerKeretaSelected.equals("Kereta 2")){
                    ArrayAdapter<String> adapterJalur = new ArrayAdapter<String> (Petugas.this,
                            android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.kereta2));
                    adapterJalur.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinnerJalur.setAdapter(adapterJalur);
                }
                else if(spinnerKeretaSelected.equals("Kereta 3")){
                    ArrayAdapter<String> adapterJalur = new ArrayAdapter<String> (Petugas.this,
                            android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.kereta3));
                    adapterJalur.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinnerJalur.setAdapter(adapterJalur);
                }
                else if(spinnerKeretaSelected.equals("Kereta 4")){
                    ArrayAdapter<String> adapterJalur = new ArrayAdapter<String> (Petugas.this,
                            android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.kereta4));
                    adapterJalur.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinnerJalur.setAdapter(adapterJalur);
                }
                else if(spinnerKeretaSelected.equals("Kereta 5")){
                    ArrayAdapter<String> adapterJalur = new ArrayAdapter<String> (Petugas.this,
                            android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.kereta5));
                    adapterJalur.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinnerJalur.setAdapter(adapterJalur);
                }
                else if(spinnerKeretaSelected.equals("Kereta 6")){
                    ArrayAdapter<String> adapterJalur = new ArrayAdapter<String> (Petugas.this,
                            android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.kereta6));
                    adapterJalur.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinnerJalur.setAdapter(adapterJalur);
                }
                else if(spinnerKeretaSelected.equals("Kereta 7")){
                    ArrayAdapter<String> adapterJalur = new ArrayAdapter<String> (Petugas.this,
                            android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.kereta7));
                    adapterJalur.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinnerJalur.setAdapter(adapterJalur);
                }
                else if(spinnerKeretaSelected.equals("Kereta 8")){
                    ArrayAdapter<String> adapterJalur = new ArrayAdapter<String> (Petugas.this,
                            android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.kereta8));
                    adapterJalur.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinnerJalur.setAdapter(adapterJalur);
                }
                else if(spinnerKeretaSelected.equals("Kereta 9")){
                    ArrayAdapter<String> adapterJalur = new ArrayAdapter<String> (Petugas.this,
                            android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.kereta9));
                    adapterJalur.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinnerJalur.setAdapter(adapterJalur);
                }
            }
            public void onNothingSelected(AdapterView<?> parent)
            {

            }
        });
    }

    public void onClickKeluar(View view){
        Intent i = new Intent(this,Masuk.class);
        startActivity(i);
    }
}
