package com.adeeva.chores.booksapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.adeeva.chores.booksapp.data.BookData
import com.adeeva.chores.booksapp.data.BookDataObject
import com.adeeva.chores.booksapp.ui.ListBookAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var rvBook: RecyclerView
    private var list: ArrayList<BookData> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvBook = findViewById(R.id.rv_book)
        rvBook.setHasFixedSize(true)
        list.addAll(BookDataObject.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvBook.layoutManager = LinearLayoutManager(this)
        val listBookAdapter = ListBookAdapter(list)
        rvBook.adapter = listBookAdapter

        listBookAdapter.setOnItemClickCallback(object: ListBookAdapter.OnItemClickCallback{
            override fun onItemClickedData(data: BookData) {
                showSelectedBook(data)
            }
        })
    }

    private fun showSelectedBook(data: BookData) {
        val detailBookActivity = Intent(this@MainActivity, DetailBookActivity::class.java).apply {
            putExtra(DetailBookActivity.EXTRA_PHOTO, data.photo)
            putExtra(DetailBookActivity.EXTRA_NAME, data.book_title)
            putExtra(DetailBookActivity.EXTRA_AUTHOR, data.author)
            putExtra(DetailBookActivity.EXTRA_PRICE, data.price)
            putExtra(DetailBookActivity.EXTRA_SUMMARY, data.summary)
        }
        startActivity(detailBookActivity)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(SelectedMode: Int) {
        R.id.action_user;run{
            val moveIntent = Intent(this@MainActivity, ProfileActivity::class.java)
            moveIntent.putExtra(ProfileActivity.EXTRA_IMAGE, R.drawable.user)
            moveIntent.putExtra(ProfileActivity.EXTRA_BACK, R.drawable.back)
            moveIntent.putExtra(ProfileActivity.EXTRA_USER, "Adeeva Rashida")
            moveIntent.putExtra(ProfileActivity.EXTRA_EMAIL, "rashidaadeva@gmail.com")

            startActivity(moveIntent)
        }
    }

}