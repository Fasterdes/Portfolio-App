package com.singaperbangsaluthfifarizqi.portofolioapp.data.experience

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Experience (
    var id: Int = 0,
    var title: String = "",
    var detail: String = "",
    var image: Int = 0
): Parcelable