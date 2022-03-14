package com.example.company_grid

import androidx.recyclerview.widget.RecyclerView
import com.example.company_grid.databinding.CardCellBinding

class CardViewHolder(private val cardCellBinding:CardCellBinding , private val clickListener: bookClickListener)
    :RecyclerView.ViewHolder(cardCellBinding.root) {
        fun bindBook(book: book){
            cardCellBinding.cover.setImageResource(book.cover)
            cardCellBinding.title.text = book.title
            cardCellBinding.author.text = book.author
            cardCellBinding.cardView.setOnClickListener{
                clickListener.onClick(book)
            }
        }
}