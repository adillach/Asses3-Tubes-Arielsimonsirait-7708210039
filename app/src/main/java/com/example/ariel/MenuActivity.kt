package com.example.ariel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.bottomsheet.BottomSheetBehavior

class MenuActivity : AppCompatActivity() {


    val band = arrayOf("The Beatles","Oasis","Sheila On 7","Dewa 19")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val spinner = findViewById<Spinner>(R.id.spinner1)
        val arrayAdapter =
            ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, band)
        spinner.adapter = arrayAdapter
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(
                    applicationContext,
                    "Selected Band is =" + band[position],
                    Toast.LENGTH_SHORT
                ).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }

        val buttonClick = findViewById<ImageView>(R.id.profile)
        buttonClick.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
            finish()

        }

        val band1 = findViewById<ImageView>(R.id.band1)
        band1.setOnClickListener {
            val intent = Intent(this, AbbeyRoad::class.java)
            startActivity(intent)
            finish()

        }

        val band2 = findViewById<ImageView>(R.id.band2)
        band2.setOnClickListener {
            val intent = Intent(this, DefinitelyMaybe::class.java)
            startActivity(intent)
            finish()

        }

        val band3 = findViewById<ImageView>(R.id.band3)
        band3.setOnClickListener {
            val intent = Intent(this, SeberapaPantas::class.java)
            startActivity(intent)
            finish()

        }

        val band4 = findViewById<ImageView>(R.id.band4)
        band4.setOnClickListener {
            val intent = Intent(this, Hadapi::class.java)
            startActivity(intent)
            finish()

        }
        val friend = findViewById<TextView>(R.id.friendlist)
        friend.setOnClickListener {
            val intent = Intent(this, listviewaja::class.java)
            startActivity(intent)
            finish()

        }

        val konseraza = findViewById<TextView>(R.id.konser)
        konseraza.setOnClickListener {
            val intent = Intent(this, tablayout_band::class.java)
            startActivity(intent)
            finish()

        }

    }
}
