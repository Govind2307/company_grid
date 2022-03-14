package com.example.company_grid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.company_grid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() , bookClickListener{
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        populateBooks()

        val mainActivity = this
        binding.recyclerview
        binding.recyclerview.apply {
            layoutManager = GridLayoutManager(applicationContext,2)
            adapter= cardAdapter(bookList,mainActivity)
        }
    }
    override fun onClick(book: book) {
        val intent =Intent(applicationContext, DetailActivity::class.java)
        intent.putExtra(BOOK_ID_EXTRA,book.id)
        startActivity(intent)
    }

    private fun populateBooks() {
        val book1 = book(
            R.drawable.apple,
            author = "Steve Jobs",
            title = "Innovation",
            description = "Innovation distinguishes between leader and follower"
        )
        bookList.add(book1)
        val book2 = book(
            R.drawable.apple,
            author = "Steve Jobs",
            title = "Innovation",
            description = "Innovation distinguishes between leader and follower"
        )
        bookList.add(book2)
        val book3 = book(
            R.drawable.apple,
            author = "Steve Jobs",
            title = "Innovation",
            description = "Innovation distinguishes between leader and follower"

        )
        bookList.add(book3)
        val book4 = book(
            R.drawable.apple,
            author = "Steve Jobs",
            title = "Innovation",
            description = "Innovation distinguishes between leader and follower"

        )
        bookList.add(book4)
        val book5 = book(
            R.drawable.apple,
            author = "Steve Jobs",
            title = "Innovation",
            description = "Innovation distinguishes between leader and follower"

        )
        bookList.add(book5)
        val book6 = book(
            R.drawable.apple,
            author = "Steve Jobs",
            title = "Innovation",
            description = "Innovation distinguishes between leader and follower"

        )
        bookList.add(book6)
        val book7 = book(
            R.drawable.apple,
            author = "Steve Jobs",
            title = "Innovation",
            description = "Innovation distinguishes between leader and follower"

        )
        bookList.add(book7)
        val book8 = book(
            R.drawable.apple,
            author = "Steve Jobs",
            title = "Innovation",
            description = "Innovation distinguishes between leader and follower"

        )
        bookList.add(book8)
        val book9 = book(
            R.drawable.apple,
            author = "Steve Jobs",
            title = "Innovation",
            description = "Innovation distinguishes between leader and follower"

        )
        bookList.add(book9)
        val book10 = book(
            R.drawable.apple,
            author = "Steve Jobs",
            title = "Innovation",
            description = "Innovation distinguishes between leader and follower"

        )
       bookList.add(book10)





    }


}