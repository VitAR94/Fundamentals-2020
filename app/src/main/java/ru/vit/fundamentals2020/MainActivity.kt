package ru.vit.fundamentals2020

import android.content.Intent
import android.os.Bundle
import android.util.Log
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    companion object{
        const val TAG = "MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginView = findViewById<EditText>(R.id.login)
        val emailView = findViewById<EditText>(R.id.email)
        val loginBtn = findViewById<Button>(R.id.loginBtn)

        loginBtn.setOnClickListener {
            val login = loginView.editableText
            val email = emailView.editableText

            val intent = Intent(this, LoginInfo::class.java)
            intent.putExtra(LoginInfo.LOGIN_PARAM, login)
            intent.putExtra(LoginInfo.EMAIL_PARAM, email)
            Log.d(TAG, "Login = " + login)
            Log.d(TAG, "email = " + email)
            startActivity(intent)
        }

    }
}