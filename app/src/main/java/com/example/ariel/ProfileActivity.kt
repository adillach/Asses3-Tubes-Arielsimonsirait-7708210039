package com.example.ariel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.models.SlideModel
import com.google.android.material.bottomsheet.BottomSheetBehavior

class ProfileActivity : AppCompatActivity() {
    private lateinit var bottomSheetBehavior: BottomSheetBehavior<ConstraintLayout>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val buttonClick = findViewById<ImageView>(R.id.btnback)
        buttonClick.setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
            finish()

        }
        val imageList = ArrayList<SlideModel>() // Create image list

// imageList.add(SlideModel("String Url" or R.drawable)
// imageList.add(SlideModel("String Url" or R.drawable, "title") You can add title

        imageList.add(SlideModel("https://imgsrv2.voi.id/40c19kujUQTt9_sj1voBTChNaPzAI5vM4Oq9nfbvPC8/auto/1280/853/sm/1/bG9jYWw6Ly8vcHVibGlzaGVycy8xMzE5NTMvMjAyMjAyMDcxMDMzLW1haW4uanBn.jpg", "THE BEATLES"))
        imageList.add(SlideModel("https://thumb.viva.id/intipseleb/1265x711/2020/08/31/5f4c94ae506cb-dewa19.jpeg", "DEWA19"))
        imageList.add(SlideModel("https://asset-2.tstatic.net/tribunnewswiki/foto/bank/images/band-oasis.jpg", "OASIS"))

        val imageSlider = findViewById<ImageSlider>(R.id.image_slider)
        imageSlider.setImageList(imageList)

        val buttonlogout = findViewById<TextView>(R.id.btnlogout)
        buttonlogout.setOnClickListener {
            val intent = Intent(this, OnBoarding::class.java)
            startActivity(intent)
            finish()

        }
        val socialmedia = findViewById<TextView>(R.id.sosmed)
        socialmedia.setOnClickListener {
            showBottomSheet()
        }
        bottomSheetBehavior = BottomSheetBehavior.from(findViewById(R.id.bottomSheet))
        bottomSheetBehavior.addBottomSheetCallback(object :
            BottomSheetBehavior.BottomSheetCallback() {
            override fun onSlide(bottomSheet: View, slideOffset: Float) {
            }

            override fun onStateChanged(bottomSheet: View, newState: Int) {
                // Tambahkan logika yang sesuai berdasarkan newState
                // Misalnya, Anda dapat mengubah teks pada buttonBottomSheetPersistent
            }
        })
    }

    // Metode untuk menampilkan bottom sheet
    private fun showBottomSheet() {
        bottomSheetBehavior.state = BottomSheetBehavior.STATE_EXPANDED
    }
}
