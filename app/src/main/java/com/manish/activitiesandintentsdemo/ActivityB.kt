package com.manish.activitiesandintentsdemo

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ActivityB : AppCompatActivity() {
    private val TAG = ActivityC::class.java.name
    private val REQ_CODE = 1


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "Activity B's onCreate() called")
        setContentView(R.layout.activity_b)

        findViewById<Button>(R.id.btn_launch_activity).setOnClickListener {
            launchActivityC()
        }

        findViewById<Button>(R.id.btn_launch_activity_for_result).setOnClickListener {
            launchActivityCForResult()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "Activity B's onStart() called")
        setResult(Activity.RESULT_OK)
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

    private fun launchActivityC() {
        val intentForActivityC = Intent(this, ActivityC::class.java)
        startActivity(intentForActivityC)
    }

    private fun launchActivityCForResult() {
        val intentForActivityC = Intent(this, ActivityC::class.java)
        startActivityForResult(intentForActivityC, REQ_CODE)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQ_CODE && resultCode == RESULT_OK) {
            if (data?.hasExtra("AN_EXTRA") == true) {
                Toast.makeText(
                    this,
                    "Result OK with intent data : ${data.getIntExtra("AN_EXTRA", 0)}",
                    Toast.LENGTH_LONG
                ).show()
            }
        }
    }

}