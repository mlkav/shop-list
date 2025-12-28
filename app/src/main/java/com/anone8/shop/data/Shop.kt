package com.anone8.shop.data

import android.os.Parcel
import android.os.Parcelable

data class Shop(
    val id: Int,
    val title: String,
    val overview: String,
    val description: String,
    val imageResId: Int,
    val category: String,
    val company: String,
    val date: String,
    val region: String,
    val url: String
) : Parcelable {

    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readInt(),
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readString() ?: ""
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(id)
        parcel.writeString(title)
        parcel.writeString(overview)
        parcel.writeString(description)
        parcel.writeInt(imageResId)
        parcel.writeString(category)
        parcel.writeString(company)
        parcel.writeString(date)
        parcel.writeString(region)
        parcel.writeString(url)
    }

    override fun describeContents(): Int = 0

    companion object CREATOR : Parcelable.Creator<Shop> {
        override fun createFromParcel(parcel: Parcel): Shop {
            return Shop(parcel)
        }

        override fun newArray(size: Int): Array<Shop?> {
            return arrayOfNulls(size)
        }
    }
}