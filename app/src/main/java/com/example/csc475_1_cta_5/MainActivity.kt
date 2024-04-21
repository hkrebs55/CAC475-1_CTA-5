package com.example.csc475_1_cta_5

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val photoRecyclerView: RecyclerView = findViewById(R.id.photoRecyclerView)
        photoRecyclerView.layoutManager = LinearLayoutManager(this)

        val photoList = listOf(
            R.drawable.dnd,
            R.drawable.heman_trio,
            R.drawable.hello_my_name,
            R.drawable.disney,
        )

        photoRecyclerView.adapter = PhotoAdapter(this, photoList)
    }
}