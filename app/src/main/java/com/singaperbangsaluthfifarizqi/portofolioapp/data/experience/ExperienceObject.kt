package com.singaperbangsaluthfifarizqi.portofolioapp.data.experience

import  com.singaperbangsaluthfifarizqi.portofolioapp.R

object ExperienceObject {

    private val title = arrayOf(
        "Android Associated Developer",
        "Android Pemula",
        "Memulai Program Bahasa Kotlin",
        "Memulai Bahasa Program Python",
        "Solid Principle"
    )

    private val detail = arrayOf(
        "Sertifikat ini merupakan sertifikat yang diterbitkan langsung oleh Google untuk developer Android",
        "Android pemula merupakan course yang diadakan oleh dicoding untuk memulai belajar program android",
        "memulai program bahasa kotlin merupakan course yang bertujuan untuk mempelajari bahas kotlin",
        "memulai program bahasa kotlin merupakan course yang bertujuan untuk mempelajari bahas python",
        "solid principle mempeljari tentang oop, clean code, dll"
    )


    private val image = intArrayOf(
        R.drawable.aad,
        R.drawable.androidcert,
        R.drawable.kotlincert,
        R.drawable.pythoncert,
        R.drawable.solidcert
    )
    val listData: ArrayList<Experience>
        get() {
            val list = arrayListOf<Experience>()
            for (position in title.indices) {
                val experience = Experience()
                experience.title = title[position]
                experience.detail = detail[position]
                experience.image = image[position]
                list.add(experience)
            }

            return list
        }
}