package com.example.recyclerviewtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listOfContact= mutableListOf<ContactItem>()
        val rv:RecyclerView=findViewById(R.id.rv)
        listOfContact.add(ContactItem(
            imageres = R.drawable.ic_launcher_foreground,
            headingtext = "Ayush",
            subheading = "this message from ayush"
        )
        )
        listOfContact.add(ContactItem(
            imageres = R.drawable.ic_launcher_foreground,
            headingtext = "Abhinav",
            subheading = "this message from abhinav"
        )
        )
        listOfContact.add(ContactItem(
            imageres = R.drawable.ic_launcher_foreground,
            headingtext = "Nayan",
            subheading = "this message from nayan"
        )
        )
        val adapter=ContactListAdapter(listOfContact)
        rv.layoutManager=LinearLayoutManager(this)
        rv.adapter=adapter

    }
}