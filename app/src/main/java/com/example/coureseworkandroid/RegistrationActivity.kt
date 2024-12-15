package com.example.coureseworkandroid

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RegistrationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_registration)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val userLogin: EditText = findViewById(R.id.registerLoginText)
        val userEmail: EditText = findViewById(R.id.registerEmailText)
        val userPassword: EditText = findViewById(R.id.registerPasswordText)
        val button: Button = findViewById(R.id.buttonRegistration)

        button.setOnClickListener{
            val login = userLogin.text.toString().trim()
            val email = userEmail.text.toString().trim()
            val pass = userPassword.text.toString().trim()

            if (login != "" || email != "" || pass != ""){
                val user = User(login, email, pass)

                val p0 = DataBaseTest(this, null)
                p0.addUser(user)
                Toast.makeText(this, "Added user $login", Toast.LENGTH_LONG).show()

                userLogin.text.clear()
                userEmail.text.clear()
                userPassword.text.clear()
            }
        }
    }
}