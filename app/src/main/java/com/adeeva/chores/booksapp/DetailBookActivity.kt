package com.adeeva.chores.booksapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailBookActivity : AppCompatActivity() {

    companion object{
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_AUTHOR = "extra_author"
        const val EXTRA_PRICE = "extra_price"
        const val EXTRA_SUMMARY = "extra_summary"

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_book)

        var actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)

        showBookDetail()
    }

    private fun showBookDetail() {

        val ivImageReceived: ImageView = findViewById(R.id.iv_item_photo)
        val tvNameReceived: TextView = findViewById(R.id.tv_item_name)
        val tvAuthorReceived: TextView = findViewById(R.id.tv_item_author)
        val tvPriceReceived: TextView = findViewById(R.id.tv_item_price)
        val tvSummaryReceived: TextView = findViewById(R.id.tv_item_summary)

        val photo = intent.getIntExtra(EXTRA_PHOTO, 0)
        val name = intent.getStringExtra(EXTRA_NAME)
        val author = intent.getStringExtra(EXTRA_AUTHOR)
        val price = intent.getStringExtra(EXTRA_PRICE)
        val summary = intent.getStringExtra(EXTRA_SUMMARY)

        ivImageReceived.setImageResource(photo)
        tvNameReceived.text = "$name"
        tvAuthorReceived.text = "$author"
        tvPriceReceived.text = "Price: $price"
        tvSummaryReceived.text = "$summary"

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}