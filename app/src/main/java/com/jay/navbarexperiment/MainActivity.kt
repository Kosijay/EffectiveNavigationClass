package com.jay.navbarexperiment

import android.content.DialogInterface
import android.os.Bundle
import android.preference.PreferenceManager
import android.util.Log
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.jay.navbarexperiment.util.PreferenceKeys

class MainActivity : AppCompatActivity(){
    private val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        isFirstLogin()
        init()
    }
    fun init() {
        val homeFragment = HomeFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.main_content_frame, homeFragment, getString(R.string.tag_fragment_home))
        transaction.addToBackStack(getString(R.string.tag_fragment_home))
        transaction.commit()
    }
    fun isFirstLogin() {
        Log.d(TAG, "isFirstLogin: checking if this is the first login")
        val preferences = PreferenceManager.getDefaultSharedPreferences(this)
        val isFirstLogin = preferences.getBoolean(PreferenceKeys.FIRST_TIME_LOGIN, true)
        if (isFirstLogin) {
            Log.d(TAG, "isFirstLogin: launching alert dialog")
            val alertDialogBuilder = AlertDialog.Builder(this)
            alertDialogBuilder.setMessage(getString(R.string.first_time_user_message))
            alertDialogBuilder.setPositiveButton("OK",
                object : DialogInterface.OnClickListener {
                    override fun onClick(dialogInterface: DialogInterface, i: Int) {
                    Log.d(TAG, "onClick: closing dialog")
                        val editor = preferences.edit()
                        editor.putBoolean(PreferenceKeys.FIRST_TIME_LOGIN, false)
                        editor.commit()
                        dialogInterface.dismiss()
                    }
                }
            )
            alertDialogBuilder.setTitle(" ")
            alertDialogBuilder.setIcon(R.drawable.tabian_dating)
            val alertDialog = alertDialogBuilder.create()
            alertDialog.show()
        }
    }
}