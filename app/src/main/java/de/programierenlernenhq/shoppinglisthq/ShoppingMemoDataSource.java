package de.programierenlernenhq.shoppinglisthq;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

/**
 * Created by ataeschner on 28.04.2016.
 */
public class ShoppingMemoDataSource {
    private static final String LOG_TAG = ShoppingMemoDataSource.class.getSimpleName();

    private SQLiteDatabase database;
    private ShoppingMemoDbHelper dbHelper;

    public ShoppingMemoDataSource(Context context) {
        Log.d(LOG_TAG, "Unsere DataSource erzeugt jetzt den dbHelper");
        dbHelper = new ShoppingMemoDbHelper(context);
    }
}
