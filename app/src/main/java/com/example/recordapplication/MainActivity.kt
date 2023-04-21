package com.example.recordapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private var date = arrayOf(
        "21/03/2566",
        "22/03/2566",
        "23/03/2566",
        "24/03/2566",
        "25/04/2566",
        "26/03/2566",
        "27/03/2566",
        "28/03/2655",
        "29/03/2546"
    )
    private lateinit var recyclerView : RecyclerView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recyclerView_record)

        recyclerView.layoutManager = LinearLayoutManager(this)
        val  itemAdapter = Adapter(date,this)

        recyclerView.adapter = itemAdapter
    }
}