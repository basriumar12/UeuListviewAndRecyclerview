package info.blogbasbas.listviewandrecycleview

import android.app.Activity
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

/**
 * Created by User on 13/10/2018.
 */


class CustomAdapter :RecyclerView.Adapter <CustomAdapter.MyViewHolder>  {

    var c : Activity? = null
    var dataBuah : Array<String>? = null
    var dataGambar : Array<Int>? =null

    constructor(c: Activity?, dataBuah: Array<String>?, dataGambar: Array<Int>?) : super() {
        this.c = c
        this.dataBuah = dataBuah
        this.dataGambar = dataGambar
    }

    // view
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MyViewHolder {
        var view : View = LayoutInflater.from(c).inflate(R.layout.list_item,parent,false)
        return MyViewHolder(view)

    }
    // set data
    override fun getItemCount(): Int {
      return dataBuah?.size!!

    }

    override fun onBindViewHolder(holder: MyViewHolder ?, position: Int) {
       //set data pada objek textview dan imageview
        holder?.tvNamaBuah?.text = dataBuah?.get(position)
        holder?.imgGambar?.setImageResource(dataGambar?.get(position)!!)

    }


    class MyViewHolder(itemView : View?) : RecyclerView.ViewHolder(itemView){

        var tvNamaBuah : TextView? = itemView?.findViewById(R.id.tv_nama)
        var imgGambar : ImageView? = itemView?.findViewById(R.id.img_data)

    }



}













