package com.singaperbangsaluthfifarizqi.portofolioapp.data.android

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class Android(
    var id: Int = 0,
    var title: String = "",
    var poster: Int = 0,
    var link: String = ""
) : Parcelable