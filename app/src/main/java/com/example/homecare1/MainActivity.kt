package com.example.homecare1

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        auth=Firebase.auth
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonSignUp.setOnClickListener{
            val inputMethodManager=getSystemService(Context.INPUT_METHOD_SERVICE)as InputMethodManager

        }
    }

}