package com.example.recordapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ShowRecordActivity : AppCompatActivity() {
    var date = arrayOf(
        "10:00:15 = 5",
        "10:01:30 = 5",
        "10:02:45 = 5",
        "10:03:60 = 5"
    )
    private var recyclerView : RecyclerView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_dialog)
        recyclerView = findViewById(R.id.recyclerView_1)
        recyclerView!!.layoutManager = LinearLayoutManager(this)
        val  itemAdapter = Adapter_dialog(date,this)
        recyclerView!!.adapter = itemAdapter

    }
}