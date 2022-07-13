package com.first.myswooshapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lateinit var getStartedBtn:Button
        getStartedBtn.setOnClickListener {
            val leagueIntent = Intent(this, league::class.java)
            startActivity(leagueIntent)
        }


        }


    }
