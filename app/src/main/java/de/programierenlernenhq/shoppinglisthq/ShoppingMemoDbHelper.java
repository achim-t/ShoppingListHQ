package de.programierenlernenhq.shoppinglisthq;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by ataeschner on 28.04.2016.
 */
public class ShoppingMemoDbHelper extends SQLiteOpenHelper{
    private static final String LOG_TAG = ShoppingMemoDbHelper.class.getSimpleName();

    public ShoppingMemoDbHelper(Context context) {
        super(context, "PLATZHALTER_DATENBANKNAME", null, 1);
        Log.d(LOG_TAG, "DbHelper hat die Datenbank: " + getDatabaseName() + " erzeugt.");
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
