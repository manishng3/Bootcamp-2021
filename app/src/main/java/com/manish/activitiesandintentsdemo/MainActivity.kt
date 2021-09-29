package com.manish.activitiesandintentsdemo

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity() {

    private val TAG = MainActivity::class.java.name

    val getContent = registerForActivityResult(ActivityResultContracts.GetContent()) { uri: Uri? ->
        // Handle the returned Uri
    }

    private val startForResult =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { activityResult ->
            if (activityResult.resultCode == RESULT_OK) {
                val receivedIntent = activityResult.data
                Toast.makeText(this, "Result OK", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "Result other than OK", Toast.LENGTH_LONG).show()
            }
        }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "Activity A's onCreate() called")

        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn_launch_activity).setOnClickListener {
            launchActivityB()
        }

        findViewById<Button>(R.id.btn_launch_activity_for_result).setOnClickListener {
            startForResult.launch(Intent(this, ActivityB::class.java))
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

