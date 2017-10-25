package com.rizky.keretaapi;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Jadwal extends AppCompatActivity {
    private DBHelper mydb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jadwal);

        ListView listViewJadwal;
        TextView textViewTitle, textViewTitle2;

        textViewTitle = (TextView) findViewById(R.id.textViewTitle);
        textViewTitle2 = (TextView) findViewById(R.id.textViewTitle2);

        Bundle extras = getIntent().getExtras();
        String spinnerKeretaSelected = extras.getString("spinnerKeretaSelected");
        String spinnerJalurSelected = extras.getString("spinnerJalurSelected");

        textViewTitle.setText("Jadwal "+spinnerKeretaSelected);
        textViewTitle2.setText(spinnerJalurSelected);

        /*
        mydb = new DBHelper(this);

        ArrayList<String> listJadwal = new ArrayList<String>();

        Cursor res = mydb.getJadwal(spinnerKeretaSelected,spinnerJalurSelected);
        res.moveToFirst();

        while(res.isAfterLast() == false) {
            listJadwal.add(res.getString(res.getColumnIndex(DBHelper.STASIUN_COLOUMN_NAME))+"\n"+res.getString(res.getColumnIndex(DBHelper.JADWAL_COLOUMN_TIBA))+"\n"+res.getString(res.getColumnIndex(DBHelper.JADWAL_COLOUMN_TIBA)));
            res.moveToNext();
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,listJadwal);

        listViewJadwal = (ListView) findViewById(R.id.listViewJadwal);
        listViewJadwal.setAdapter(adapter);
        */
    }
}
