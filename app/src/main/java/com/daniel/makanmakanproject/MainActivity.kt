package com.daniel.makanmakanproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //initiate button from layout
        val button = findViewById<Button>(R.id.btnRelative)
        val buttonConstraint = findViewById<Button>(R.id.btnConstraint)

        //set action for button
        button.setOnClickListener {
            val intent = Intent(this@MainActivity, RelativeActivity::class.java)
            startActivity(intent)
        }

        buttonConstraint.setOnClickListener {
            val intent = Intent(this@MainActivity, ConstraintActivity::class.java)
            startActivity(intent)
        }
    }
}