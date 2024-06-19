package com.example.profiledummy

import android.os.Parcel
import android.os.Parcelable

//data class UserData(var empName : String, var subject : String, var description : String, var userImg : Int)

data class UserData(
    val empName: String,
    val subject: String,
    val userImg: Int,
    val description: String
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readInt(),
        parcel.readString()!!
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(empName)
        parcel.writeString(subject)
        parcel.writeInt(userImg)
        parcel.writeString(description)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<UserData> {
        override fun createFromParcel(parcel: Parcel): UserData {
            return UserData(parcel)
        }

        override fun newArray(size: Int): Array<UserData?> {
            return arrayOfNulls(size)
        }
    }
}