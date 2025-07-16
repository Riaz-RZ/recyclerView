package com.example.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.databinding.CardBinding

class PersonAdapter (context: Context, private val personList: List<PersonDC>):RecyclerView.Adapter<PersonAdapter.personViewHolder>(){
    inner class personViewHolder(val binding: CardBinding):RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): personViewHolder {
        val binding = CardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return personViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return personList.size
    }

    override fun onBindViewHolder(holder: personViewHolder, position: Int) {
        val person = personList[position]
        holder.binding.circularimageView.setImageResource(person.imgResId)
        holder.binding.nameTV.text = person.name
        holder.binding.detailTV.text = person.details
    }

}