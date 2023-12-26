package com.example.recyclerviewtest

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactListAdapter(
    private val listOfContact:List<ContactItem>
) :RecyclerView.Adapter<ContactListAdapter.contactlistviewholder>(){
    class contactlistviewholder(view:View):RecyclerView.ViewHolder(view){
        val image:ImageView=view.findViewById(R.id.iv_rv_item)
        val textheading:TextView=view.findViewById(R.id.tv_rv_item1)
        val textsubheading:TextView=view.findViewById(R.id.tv_rv_item2)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): contactlistviewholder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.recycle_view_item,parent,false)
        return contactlistviewholder(view)
    }

    override fun getItemCount(): Int {
       return listOfContact.size
    }

    override fun onBindViewHolder(holder: contactlistviewholder, position: Int) {
        holder.image.setImageResource(listOfContact[position].imageres)
        holder.textheading.text=listOfContact[position].headingtext
        holder.textsubheading.text=listOfContact[position].subheading
    }
}