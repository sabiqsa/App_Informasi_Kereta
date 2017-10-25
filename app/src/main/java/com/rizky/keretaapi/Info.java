package com.rizky.keretaapi;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Info extends AppCompatActivity {
    private DBHelper mydb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        TextView textViewTitle,textViewInfo;

        textViewTitle = (TextView) findViewById(R.id.textViewTitle);
        textViewInfo = (TextView) findViewById(R.id.textViewInfo);

        Bundle extras = getIntent().getExtras();
        String spinnerKeretaSelected = extras.getString("spinnerKeretaSelected");

        textViewTitle.setText("Info "+spinnerKeretaSelected);
        textViewInfo.setText("Info tentang "+spinnerKeretaSelected);

        /*
        mydb = new DBHelper(this);

        Cursor rs = mydb.getInfo(spinnerKeretaSelected);
        rs.moveToFirst();

        String namaKereta = rs.getString(rs.getColumnIndex(DBHelper.KERETA_COLOUMN_NAME));
        String informasiKereta = rs.getString(rs.getColumnIndex(DBHelper.KERETA_COLOUMN_INFORMATION));

        if (!rs.isClosed())  {
            rs.close();
        }

        textViewTitle.setText("Jadwal "+namaKereta);
        textViewInfo.setText(informasiKereta);
        */
    }
}
