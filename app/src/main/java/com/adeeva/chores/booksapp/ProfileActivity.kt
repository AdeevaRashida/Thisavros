package com.adeeva.chores.booksapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class ProfileActivity : AppCompatActivity() {

    companion object{
        const val EXTRA_IMAGE = "extra_image"
        const val EXTRA_BACK = "extra_back"
        const val EXTRA_USER = "extra_user"
        const val EXTRA_EMAIL = "extra_email"

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val actionBar = supportActionBar
        actionBar!!.title = "About"
        actionBar.setDisplayHomeAsUpEnabled(true)

        showProfileDetail()
    }

    private fun showProfileDetail() {

        val ivPictureReceived: ImageView = findViewById(R.id.img_user_photo)
        val ivBackReceived: ImageView = findViewById(R.id.img_back_photo)
        val tvUserReceived: TextView = findViewById(R.id.tv_user_name)
        val tvEmailReceived: TextView = findViewById(R.id.tv_user_email)

        val photo = intent.getIntExtra(EXTRA_IMAGE, 0)
        val back = intent.getIntExtra(EXTRA_BACK, 0)
        val user = intent.getStringExtra(EXTRA_USER)
        val email = intent.getStringExtra(EXTRA_EMAIL)

        ivPictureReceived.setImageResource(photo)
        ivBackReceived.setImageResource(back)
        tvUserReceived.text = "$user"
        tvEmailReceived.text = "$email"
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}