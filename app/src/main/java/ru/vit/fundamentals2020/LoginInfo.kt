package ru.vit.fundamentals2020

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class LoginInfo : AppCompatActivity() {
    companion object {
        const val TAG = "LoginInfo"
        const val LOGIN_PARAM = "login"
        const val EMAIL_PARAM = "email"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_info)

        val tv = findViewById<TextView>(R.id.login_message)

        val login = intent.getStringExtra(LOGIN_PARAM)
        val email = intent.getStringExtra(EMAIL_PARAM)

        Log.d(TAG, "Login = " + login)
        Log.d(TAG, "email = " + email)

        tv.text = "Hello, $login! Your email is $email"
    }
}