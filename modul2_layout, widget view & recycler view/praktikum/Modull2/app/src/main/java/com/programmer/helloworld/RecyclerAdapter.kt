package com.programmer.helloworld

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar

class RecyclerAdapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>(){
    //Image list
    private val images = intArrayOf(
        R.drawable.cardview_1,
        R.drawable.cardview_2,
        R.drawable.cardview_3,
        R.drawable.cardview_4,
        R.drawable.cardview_5,
        R.drawable.cardview_6)
    //Title list
    private val titles = arrayOf(
        "1 Time Wizard",
        "2 Morphing Jar",
        "3 CopyCat",
        "4 Jinzo",
        "5 Mosnter Reborn",
        "6 The Winged Dragon Of RA",
        "7 Silver The Sky Dragon",
        "8 Obelisk The Tormetor")
    //Detail list
    private val details = arrayOf(
        "Monster Legendaris Dengan Effect Lempar Koin Setiap Turn",
        "Flip: Buang Semua Kartu Yang Di Pegang, Dan Ambil KArtu Sejumlah Kartu Yang Di Buang",
        "Copy ATK And DEF Monster Musuh Yang Di Copy",
        "Bened Semua Effect Trap Card",
        "Ambil Monster Dalam Kuburan",
        "Salah 1 Monster Dewa",
        "Salah 1 Monster Dewa",
        "Salah 1 Monster Dewa")
    //ViewHolder class
    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var itemImage: ImageView
        var itemTitle: TextView
        var itemDetail: TextView
        init{
            itemImage = itemView.findViewById(R.id.cardImage)
            itemTitle = itemView.findViewById(R.id.cardTitle)
            itemDetail = itemView.findViewById(R.id.cardDetail)

            itemView.setOnClickListener { v: View ->
                var position: Int = getAdapterPosition()
                Snackbar.make(v, "Click on item ${titles[position]}",
                    Snackbar.LENGTH_LONG).setAction("Action",null).show()
            }
        }

    }

    //onCreateViewHolder()
    override fun onCreateViewHolder(ViewGroup: ViewGroup, i: Int): ViewHolder {
        val v = LayoutInflater.from(ViewGroup.context)
            .inflate(R.layout.card_layout, ViewGroup, false)
        return ViewHolder(v)
    }
    //onBindViewHolder()
    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        viewHolder.itemTitle.text = titles[i]
        viewHolder.itemDetail.text = details[i]
        viewHolder.itemImage.setImageResource(images[i])
    }
    //getItemCount()
    override fun getItemCount(): Int {
        return titles.size
    }
}