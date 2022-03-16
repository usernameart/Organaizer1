package com.mypackage.android.organaizer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val buttonInt : Button= findViewById(R.id.buttonint)
        val buttonIn2 : Button= findViewById(R.id.buttonInt2)

       buttonInt.setOnClickListener() {
       val intent = Intent(this,calculatoin::class.java)
       startActivity(intent) }
     buttonIn2.setOnClickListener(){
        val intent2 = Intent(
            this, spisok::class.java
        )
        startActivity(intent2)}
            }
    }


