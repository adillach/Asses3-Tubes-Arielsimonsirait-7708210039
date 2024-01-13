package com.example.ariel

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter(private val context : Activity,private val arraylist : ArrayList<User>) : ArrayAdapter<User>(context,
                R.layout.list_item,arraylist)    {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflater : LayoutInflater = LayoutInflater.from(context)
        val view : View = inflater.inflate(R.layout.list_item,null)

        val imageView : ImageView = view.findViewById(R.id.profile_pic)
        val userName : TextView = view.findViewById(R.id.personName)
        val lastmissCall : TextView = view.findViewById(R.id.missCall)
        val lastmissTime: TextView = view.findViewById(R.id.misstime)

        imageView.setImageResource(arraylist[position].imageId)
        userName.text = arraylist[position].name
        lastmissCall.text = arraylist[position].missCall
        lastmissTime.text = arraylist[position].missCallTime


        return view
    }
}