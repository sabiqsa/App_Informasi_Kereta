package com.rizky.keretaapi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Lacak extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lacak);

        TextView textViewTitle, textViewTitle2;

        textViewTitle = (TextView) findViewById(R.id.textViewTitle);
        textViewTitle2 = (TextView) findViewById(R.id.textViewTitle2);

        Bundle extras = getIntent().getExtras();
        String spinnerKeretaSelected = extras.getString("spinnerKeretaSelected");
        String spinnerJalurSelected = extras.getString("spinnerJalurSelected");

        textViewTitle.setText("Lokasi "+spinnerKeretaSelected);
        textViewTitle2.setText(spinnerJalurSelected);
    }
}
