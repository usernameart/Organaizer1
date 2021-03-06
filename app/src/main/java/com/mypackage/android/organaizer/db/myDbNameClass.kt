package com.mypackage.android.organaizer.db

import android.provider.BaseColumns


// создаем базу данных


object myDbNameClass : BaseColumns {
    const val TABLE_NAME = "my_table"
    const val COLUMN_NAME_TITLE = "title"
    const val COLUMN_NAME_CONTENT = "content"

    const val DATABASE_VERSION = 1
    const val DATABASE_NAME = "myDb.db"

    const val CREAT_TABLE = "CREATE TABLE IF NOT EXISTS $TABLE_NAME ("+
            "${BaseColumns._ID} INTEGER PRIMARY KEY,$COLUMN_NAME_TITLE TEXT,$COLUMN_NAME_CONTENT TEXT)"
    const val SQL_DELETE_TABLE = "DROP TABLE IF EXISTS $TABLE_NAME"
}