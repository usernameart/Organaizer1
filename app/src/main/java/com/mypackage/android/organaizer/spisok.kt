package com.mypackage.android.organaizer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.mypackage.android.organaizer.db.myDbManager

class spisok : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spisok)}

        val myDbManager = myDbManager(this)

        fun onClickNew(v: View) {
            val i = Intent(this,EditActivity::class.java)
            startActivity(i)}


        }



