package com.example.sqlite_nome;
import static com.example.sqlite_nome.DatabaseStrings.FIELD_TEXT;
import static com.example.sqlite_nome.DatabaseStrings.TBL_NAME;

import android.database.sqlite.SQLiteOpenHelper;
import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
public class DBhelper extends SQLiteOpenHelper
{
    public static final String DBNAME="BILLBOOK";
    public DBhelper(Context context) {
        super(context, DBNAME, null, 1);
    }
    @Override
    public void onCreate(SQLiteDatabase db)
    {
        String q="CREATE TABLE "+ TBL_NAME+
                " ( _id INTEGER PRIMARY KEY AUTOINCREMENT," +
                DatabaseStrings.FIELD_SUBJECT+" TEXT," +
                DatabaseStrings.FIELD_TEXT+" TEXT," +
                DatabaseStrings.FIELD_DATE+" TEXT)";
        db.execSQL(q);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        db.execSQL("DROP TABLE IF EXISTS " + TBL_NAME);
        onCreate(db);
    }

    public long salvaNome(String name) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(FIELD_TEXT, name);
        long id = db.insert(TBL_NAME, null, values);
        db.close();
        return id;
    }
}