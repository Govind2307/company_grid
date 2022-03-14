package com.example.company_grid

var bookList = mutableListOf<book>()
val BOOK_ID_EXTRA = "bookExtra"
class book (
    var cover: Int,
    var author: String,
    var title:String,
    var description:String,
    val id: Int? = bookList.size

        )