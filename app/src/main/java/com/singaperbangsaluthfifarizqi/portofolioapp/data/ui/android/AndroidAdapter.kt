package com.singaperbangsaluthfifarizqi.portofolioapp.ui.android

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.singaperbangsaluthfifarizqi.portofolioapp.R
import com.singaperbangsaluthfifarizqi.portofolioapp.data.android.Android
import com.singaperbangsaluthfifarizqi.portofolioapp.databinding.ItemAndroidBinding

class AndroidAdapter : RecyclerView.Adapter<AndroidAdapter.AndroidViewHolder>() {

    private val listData = ArrayList<Android>()
    var onItemClicked: ((Android) -> Unit)? = null

    fun setData(newList: List<Android>?) {
        if (newList == null) return
        listData.clear()
        listData.addAll(newList)
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AndroidViewHolder =
        AndroidViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_android, parent, false)
        )

    override fun onBindViewHolder(holder: AndroidViewHolder, position: Int) {
        val listData = listData[position]
        holder.bind(listData)
    }

    override fun getItemCount(): Int = listData.size

    inner class AndroidViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding = ItemAndroidBinding.bind(itemView)

        fun bind(data: Android) {
            binding.android = data
            binding.executePendingBindings()
        }

        init {
            binding.root.setOnClickListener {
                onItemClicked?.invoke(listData[adapterPosition])
            }
        }
    }
}