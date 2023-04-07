package com.example.modul2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private var layoutManager: RecyclerView.LayoutManager?=null
    private var adapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Menentukan LayoutManager untuk RecyclerView
        layoutManager = LinearLayoutManager(this)
        recycler_view.layoutManager = layoutManager

        //Link kan RecyclerView dengan class Adapter
        adapter = RecyclerAdapter()
        recycler_view.adapter = adapter
    }
}