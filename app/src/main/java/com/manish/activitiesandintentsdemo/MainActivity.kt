package com.manish.activitiesandintentsdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private val TAG = MainActivity::class.java.name

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "Activity A's onCreate() called")

        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn_launch_activity).setOnClickListener {
            launchActivityB()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "Activity A's onStart() called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "Activity A's onResume() called")

    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "Activity A's onPause() called")

    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d(TAG, "Activity A's onRestoreInstanceState() called")

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d(TAG, "Activity A's onSaveInstanceState() called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "Activity A's onStop() called")

    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "Activity A's onRestart() called")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "Activity A's onDestroy() called")

    }

    private fun launchActivityB() {
        val intentForActivityB = Intent(this, ActivityB::class.java)
        startActivity(intentForActivityB)
    }

}

