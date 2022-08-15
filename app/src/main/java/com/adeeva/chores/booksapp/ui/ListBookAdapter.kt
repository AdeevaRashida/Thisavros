package com.adeeva.chores.booksapp.ui

import android.view.LayoutInflater
import android.view.ScrollCaptureCallback
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.adeeva.chores.booksapp.R
import com.adeeva.chores.booksapp.data.BookData
import com.squareup.picasso.Picasso

class ListBookAdapter(private val listBook: ArrayList<BookData>): RecyclerView.Adapter<ListBookAdapter.ListViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback){
        this.onItemClickCallback = onItemClickCallback
    }

    interface OnItemClickCallback {
        fun onItemClickedData(data: BookData)
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvAuthor: TextView = itemView.findViewById(R.id.tv_item_author)
        var imgPhoto: ImageView = itemView.findViewById(R.id.iv_item_photo)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_book, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val book = listBook[position]

        book.photo.let{
            Picasso.with(holder.itemView.context)
                .load(it)
                .resize(50, 50)
                .into(holder.imgPhoto)
        }

        holder.tvName.text = book.book_title
        holder.tvAuthor.text = book.author

        holder.itemView.setOnClickListener{ onItemClickCallback.onItemClickedData(listBook[holder.adapterPosition])}
    }

    override fun getItemCount(): Int {
        return listBook.size
    }
}