package com.adeeva.chores.booksapp.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class BookData(
    var book_title: String = " ",
    var author: String = " ",
    var price: String = " ",
    var summary: String = " ",
    var photo: Int = 0,

) : Parcelable
