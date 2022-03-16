package com.mypackage.android.organaizer.db

import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase


// открывет , записывает и читает базу данных


class myDbManager(context: Context) {
    val myDbHelper = com.mypackage.android.organaizer.db.myDbHelper(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelper.writableDatabase
    }
    fun insertToDb(title: String, content:String){
        val values = ContentValues().apply {
            put(myDbNameClass.COLUMN_NAME_TITLE,title)
            put(myDbNameClass.COLUMN_NAME_CONTENT,content)
        }
        db?.insert(myDbNameClass.TABLE_NAME,null,values)
    }
    @SuppressLint("Range")
    fun readDbData ():ArrayList<String>{
        val dataList = ArrayList<String>()
        val cursor = db?.query(myDbNameClass.TABLE_NAME,null, null,null,null,null,null)

            while (cursor?.moveToNext()!!){
                val dataText = cursor.getString(cursor.getColumnIndex(myDbNameClass.COLUMN_NAME_TITLE))
                dataList.add(dataText.toString())
            }
        cursor.close()
        return dataList
    }



    fun closedDb() {
        myDbHelper.close()
    }
}