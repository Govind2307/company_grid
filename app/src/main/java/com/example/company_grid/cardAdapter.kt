package com.example.company_grid

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.company_grid.databinding.CardCellBinding

class cardAdapter(private val books:List<book>,private val clickListener: bookClickListener): RecyclerView.Adapter<CardViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
       val from = LayoutInflater.from(parent.context)
        val binding = CardCellBinding.inflate(from,parent,false)
        return CardViewHolder(binding,clickListener)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {

        holder.bindBook(books[position])
    }

    override fun getItemCount(): Int = books.size

}