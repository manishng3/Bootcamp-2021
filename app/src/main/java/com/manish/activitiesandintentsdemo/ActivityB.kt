package com.manish.activitiesandintentsdemo

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class ActivityB : AppCompatActivity() {
    private val TAG = ActivityB::class.java.name

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "Activity B's onCreate() called")
        setContentView(R.layout.activity_b)
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "Activity B's onStart() called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "Activity B's onResume() called")

    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "Activity B's onPause() called")

    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d(TAG, "Activity B's onRestoreInstanceState() called")

    }


    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
        Log.d(TAG, "Activity B's onSaveInstanceState() called")

    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "Activity B's onStop() called")

    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "Activity B's onRestart() called")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "Activity B's onDestroy() called")

    }

}