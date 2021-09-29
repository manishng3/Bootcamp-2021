package com.manish.activitiesandintentsdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActivityC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)

        findViewById<Button>(R.id.btn_launch_activity).setOnClickListener {
            launchActivityB()
        }

    }

    override fun onStart() {
        super.onStart()
        setResult(RESULT_OK,Intent().putExtra("AN_EXTRA",123))
    }

    private fun launchActivityB() {
        val intentForActivityB = Intent(this, ActivityB::class.java)
        startActivity(intentForActivityB)
    }

}