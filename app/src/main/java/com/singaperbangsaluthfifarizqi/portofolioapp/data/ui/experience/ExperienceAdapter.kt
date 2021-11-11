package com.singaperbangsaluthfifarizqi.portofolioapp.ui.experience

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.singaperbangsaluthfifarizqi.portofolioapp.R
import com.singaperbangsaluthfifarizqi.portofolioapp.data.experience.Experience
import com.singaperbangsaluthfifarizqi.portofolioapp.databinding.ItemExperienceBinding

class ExperienceAdapter : RecyclerView.Adapter<ExperienceAdapter.ExperienceViewHolder>() {

    private val listData = ArrayList<Experience>()

    var onItemClicked: ((Experience) -> Unit)? = null

    fun setData(data: List<Experience>?) {
        if (data == null) return
        listData.clear()
        listData.addAll(data)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExperienceViewHolder =
        ExperienceViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_experience, parent, false)
        )

    override fun onBindViewHolder(holder: ExperienceViewHolder, position: Int) {
        val listData = listData[position]
        holder.bind(listData)
    }

    override fun getItemCount(): Int = listData.size


    inner class ExperienceViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding = ItemExperienceBinding.bind(itemView)

        fun bind(data: Experience) {
            binding.experience = data
            binding.executePendingBindings()
        }

        init {
            binding.root.setOnClickListener {
                onItemClicked?.invoke(listData[adapterPosition])
            }
        }
    }
}