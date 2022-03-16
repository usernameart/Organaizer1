package com.mypackage.android.organaizer.db

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper


// Создаем базу данных и перезаписываем ее


class myDbHelper(context: Context): SQLiteOpenHelper(context,myDbNameClass.DATABASE_NAME,
    null,myDbNameClass.DATABASE_VERSION) {
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL(myDbNameClass.CREAT_TABLE)
    }

    override fun onUpgrade(db: SQLiteDatabase?, p1: Int, p2: Int) {
        db?.execSQL(myDbNameClass.SQL_DELETE_TABLE)
        onCreate(db)

    }
}