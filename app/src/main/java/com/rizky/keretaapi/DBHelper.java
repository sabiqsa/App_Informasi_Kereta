package com.rizky.keretaapi;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;

public class DBHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "KeretaApi.db";

    public static final String PETUGAS_TABLE_NAME = "Petugas";
    public static final String PETUGAS_COLOUMN_ID = "idPatugas";
    public static final String PETUGAS_COLOUMN_NAME = "namaPetugas";
    public static final String PETUGAS_COLOUMN_PASSWORD = "kataSandi";

    public static final String KELAS_TABLE_NAME = "Kelas";
    public static final String KELAS_COLOUMN_ID = "idKelas";
    public static final String KELAS_COLOUMN_NAME = "namaKelas";

    public static final String JALUR_TABLE_NAME = "Jalur";
    public static final String JALUR_COLOUMN_ID = "idJalur";
    public static final String JALUR_COLOUMN_NAME = "namaJalur";

    public static final String LOKASI_TABLE_NAME = "Lokasi";
    public static final String LOKASI_COLOUMN_ID = "idLokasi";
    public static final String LOKASI_COLOUMN_LATITUDE = "latitude";
    public static final String LOKASI_COLOUMN_LONGITUDE = "longitude";

    public static final String KERETA_TABLE_NAME = "Kereta";
    public static final String KERETA_COLOUMN_ID = "idKereta";
    public static final String KERETA_COLOUMN_NAME = "namaKereta";
    public static final String KERETA_COLOUMN_INFORMATION = "informasiKereta";
    public static final String KERETA_COLOUMN_KELAS_ID = "idKelas";
    public static final String KERETA_COLOUMN_JALUR_ID = "idJalur";
    public static final String KERETA_COLOUMN_LOKASI_ID = "idLokasi";
    public static final String KERETA_COLOUMN_PETUGAS_ID = "idPetugas";

    public static final String JADWAL_TABLE_NAME = "Jadwal";
    public static final String JADWAL_COLOUMN_ID = "idJadwal";
    public static final String JADWAL_COLOUMN_TIBA = "waktuTiba";
    public static final String JADWAL_COLOUMN_BERANGKAT = "waktuBerangkat";
    public static final String JADWAL_COLOUMN_KERETA_ID = "idKereta";
    public static final String JADWAL_COLOUMN_STASIUN_ID = "idStasiun";

    public static final String STASIUN_TABLE_NAME = "Stasiun";
    public static final String STASIUN_COLOUMN_ID = "idStasiun";
    public static final String STASIUN_COLOUMN_NAME = "namaStasiun";
    public static final String STASIUN_COLOUMN_INFORMATION = "informasiStasiun";
    public static final String STASIUN_COLOUMN_LOKASI_ID = "idLokasi";


    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table "+PETUGAS_TABLE_NAME+"("+PETUGAS_COLOUMN_ID+" integer primary key, "+PETUGAS_COLOUMN_NAME+" text,"+PETUGAS_COLOUMN_PASSWORD+" text);");
        db.execSQL("create table "+KELAS_TABLE_NAME+"("+KELAS_COLOUMN_ID+" integer primary key, "+KELAS_COLOUMN_NAME+" text);");
        db.execSQL("create table "+JALUR_TABLE_NAME+"("+JALUR_COLOUMN_ID+" integer primary key, "+JALUR_COLOUMN_NAME+" text);");
        db.execSQL("create table "+LOKASI_TABLE_NAME+"("+LOKASI_COLOUMN_ID+" integer primary key, "+LOKASI_COLOUMN_LATITUDE+" blob,"+LOKASI_COLOUMN_LONGITUDE+" blob);");
        db.execSQL("create table "+KERETA_TABLE_NAME+"("+KERETA_COLOUMN_ID+" integer primary key, "+KERETA_COLOUMN_NAME+" text,"+KERETA_COLOUMN_INFORMATION+" text" +
                ","+KERETA_COLOUMN_KELAS_ID+" integer,"+KERETA_COLOUMN_JALUR_ID+" integer,"+KERETA_COLOUMN_LOKASI_ID+" integer,"+KERETA_COLOUMN_PETUGAS_ID+" integer," +
                "foreign key ("+KERETA_COLOUMN_KELAS_ID+") references "+KELAS_TABLE_NAME+"("+KELAS_COLOUMN_ID+")," +
                "foreign key ("+KERETA_COLOUMN_JALUR_ID+") references "+JALUR_TABLE_NAME+"("+JALUR_COLOUMN_ID+")," +
                "foreign key ("+KERETA_COLOUMN_LOKASI_ID+") references "+LOKASI_TABLE_NAME+"("+LOKASI_COLOUMN_ID+")," +
                "foreign key ("+KERETA_COLOUMN_PETUGAS_ID+") references "+PETUGAS_TABLE_NAME+"("+PETUGAS_COLOUMN_ID+"));");
        db.execSQL("create table "+JADWAL_TABLE_NAME+"("+JADWAL_COLOUMN_ID+" integer primary key, "+JADWAL_COLOUMN_TIBA+" text,"+JADWAL_COLOUMN_BERANGKAT+" text" +
                ","+JADWAL_COLOUMN_KERETA_ID+" integer,"+JADWAL_COLOUMN_STASIUN_ID+" integer," +
                "foreign key ("+JADWAL_COLOUMN_KERETA_ID+") references "+KERETA_TABLE_NAME+"("+KERETA_COLOUMN_ID+")," +
                "foreign key ("+JADWAL_COLOUMN_STASIUN_ID+") references "+STASIUN_TABLE_NAME+"("+STASIUN_COLOUMN_ID+"));");
        db.execSQL("create table "+STASIUN_TABLE_NAME+"("+STASIUN_COLOUMN_ID+" integer primary key, "+STASIUN_COLOUMN_NAME+" text,"+STASIUN_COLOUMN_INFORMATION+" text" +
                ","+STASIUN_COLOUMN_LOKASI_ID+" integer," +
                "foreign key ("+STASIUN_COLOUMN_LOKASI_ID+") references "+LOKASI_TABLE_NAME+"("+LOKASI_COLOUMN_ID+"));");

        /*
        ContentValues valuePetugas = new ContentValues();
        ContentValues valueKelas = new ContentValues();
        ContentValues valueJalur = new ContentValues();
        ContentValues valueLokasi = new ContentValues();
        ContentValues valueKereta = new ContentValues();
        ContentValues valueJadwal = new ContentValues();
        ContentValues valueStasiun = new ContentValues();

        valuePetugas.put(PETUGAS_COLOUMN_ID,"1");
        valuePetugas.put(PETUGAS_COLOUMN_NAME,"Andi");
        valuePetugas.put(PETUGAS_COLOUMN_PASSWORD,"1234");

        db.insert(PETUGAS_TABLE_NAME,null,valuePetugas);

        valueKelas.put(KELAS_COLOUMN_ID,"1");
        valueKelas.put(KELAS_COLOUMN_NAME,"Kelas 1");

        db.insert(KELAS_TABLE_NAME,null,valueKelas);

        valueJalur.put(JALUR_COLOUMN_ID,"1");
        valueJalur.put(JALUR_COLOUMN_NAME,"Jalur 1");

        db.insert(JALUR_TABLE_NAME,null,valueJalur);

        valueLokasi.put(LOKASI_COLOUMN_ID,"1");
        valueLokasi.put(LOKASI_COLOUMN_LATITUDE,"Latitude 1");
        valueLokasi.put(LOKASI_COLOUMN_LONGITUDE,"Longitude 1");

        db.insert(LOKASI_TABLE_NAME,null,valueLokasi);

        valueKereta.put(KERETA_COLOUMN_ID,"1");
        valueKereta.put(KERETA_COLOUMN_NAME,"Kereta 1");
        valueKereta.put(KERETA_COLOUMN_INFORMATION,"Info Kereta 1");
        valueKereta.put(KERETA_COLOUMN_KELAS_ID,"1");
        valueKereta.put(KERETA_COLOUMN_JALUR_ID,"1");
        valueKereta.put(KERETA_COLOUMN_LOKASI_ID,"1");
        valueKereta.put(KERETA_COLOUMN_PETUGAS_ID,"1");

        db.insert(KERETA_TABLE_NAME,null,valueKereta);

        valueJadwal.put(JADWAL_COLOUMN_ID,"1");
        valueJadwal.put(JADWAL_COLOUMN_TIBA,"Waktu tiba 1");
        valueJadwal.put(JADWAL_COLOUMN_BERANGKAT,"Waktu Berangkat 1");
        valueJadwal.put(JADWAL_COLOUMN_KERETA_ID,"1");
        valueJadwal.put(JADWAL_COLOUMN_STASIUN_ID,"1");

        db.insert(JADWAL_TABLE_NAME,null,valueJadwal);

        valueStasiun.put(STASIUN_COLOUMN_ID,"1");
        valueStasiun.put(STASIUN_COLOUMN_NAME,"Stasiun 1");
        valueStasiun.put(STASIUN_COLOUMN_INFORMATION,"Info Stasiun 1");
        valueStasiun.put(STASIUN_COLOUMN_LOKASI_ID,"1");

        db.insert(STASIUN_TABLE_NAME,null,valueStasiun);
        */
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+PETUGAS_TABLE_NAME+";");
        db.execSQL("DROP TABLE IF EXISTS "+KELAS_TABLE_NAME+";");
        db.execSQL("DROP TABLE IF EXISTS "+JALUR_TABLE_NAME+";");
        db.execSQL("DROP TABLE IF EXISTS "+LOKASI_TABLE_NAME+";");
        db.execSQL("DROP TABLE IF EXISTS "+KERETA_TABLE_NAME+";");
        db.execSQL("DROP TABLE IF EXISTS "+JADWAL_TABLE_NAME+";");
        db.execSQL("DROP TABLE IF EXISTS "+STASIUN_TABLE_NAME+";");
        onCreate(db);
    }

    public Cursor getJadwal(String name, String jalur) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res =  db.rawQuery( "select * from "+JADWAL_TABLE_NAME+","+KERETA_TABLE_NAME+","+STASIUN_TABLE_NAME+"" +
                " where "+KERETA_TABLE_NAME+"."+KERETA_COLOUMN_NAME+"="+name+"" +
                " and "+KERETA_TABLE_NAME+"."+KERETA_COLOUMN_JALUR_ID+"="+jalur+"" +
                " and "+JADWAL_TABLE_NAME+"."+JADWAL_COLOUMN_KERETA_ID+"="+KERETA_TABLE_NAME+"."+KERETA_COLOUMN_ID+"" +
                " and "+JADWAL_TABLE_NAME+"."+JADWAL_COLOUMN_STASIUN_ID+"="+STASIUN_TABLE_NAME+"."+STASIUN_COLOUMN_ID+"=;", null );

        return res;
    }

    public Cursor getInfo(String name) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res =  db.rawQuery( "select * from "+KERETA_TABLE_NAME+"" +
                " where "+KERETA_TABLE_NAME+"."+KERETA_COLOUMN_NAME+"="+name+";", null );
        return res;
    }

    public Cursor getLokasi(String name, String jalur) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res =  db.rawQuery( "select * from "+KERETA_TABLE_NAME+","+LOKASI_TABLE_NAME+"" +
                " where "+KERETA_TABLE_NAME+"."+KERETA_COLOUMN_NAME+"="+name+"" +
                " and "+KERETA_TABLE_NAME+"."+KERETA_COLOUMN_JALUR_ID+"="+jalur+"" +
                " and "+KERETA_TABLE_NAME+"."+KERETA_COLOUMN_LOKASI_ID+"="+LOKASI_TABLE_NAME+"."+LOKASI_COLOUMN_ID+"=;", null );
        return res;
    }
}
