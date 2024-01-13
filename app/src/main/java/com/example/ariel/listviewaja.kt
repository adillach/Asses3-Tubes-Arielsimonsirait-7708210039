package com.example.ariel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ariel.databinding.ActivityListviewajaBinding


class listviewaja : AppCompatActivity() {

    private lateinit var binding : ActivityListviewajaBinding
    private lateinit var userArrayList: ArrayList<User>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListviewajaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageId = intArrayOf(

            R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,
            R.drawable.f,R.drawable.g,R.drawable.h,R.drawable.i

        )

        val name = arrayOf(

            "Gustaf",
            "Lea",
            "Lambih",
            "Cila",
            "Nita",
            "Viks",
            "Tanaka",
            "Mama",
            "Ayang"
        )

        val lastmisscall = arrayOf(

            "7 missed call","8 missed call","9 missed call","45 missed call","6 missed call","8 missed call",
            "8 missed call","7 missed call","1 missed call"
        )

        val misstime = arrayOf(

            "7:00 am","8:52 am","9:00 am","10:14 am","11:34 am","12:00 pm","13:20 pm","14:03 pm","15:38 pm"
        )

        val phoneNo = arrayOf(

            "085255743589","08524634647","08525367578","08526647856","08525567786","085267445378",
            "085245367789","085233456645","085256467867"
        )

        val country = arrayOf(

            "Indonesia","German","Lamia","England","China","Indonesia","Tarkam","Valis","Chile"
        )

        userArrayList = ArrayList()

        for (i in name.indices){

            val user = User(name[i],lastmisscall[i],misstime[i],phoneNo[i],country[i],imageId[i])
            userArrayList.add(user)
        }

        binding.listview.isClickable = true
        binding.listview.adapter = MyAdapter(this,userArrayList)
        binding.listview.setOnItemClickListener {parent, view, position, id ->

            val name = name[position]
            val phone = phoneNo[position]
            val country = country[position]
            val imageId = imageId[position]

            val i = Intent(this, UserActivity::class.java)
            i.putExtra("name",name)
            i.putExtra("phone",phone)
            i.putExtra("country",country)
            i.putExtra("imageId",imageId)
            startActivity(i)
        }
    }
}