package com.jay.navbarexperiment.models

import android.os.Parcel
import android.os.Parcelable

class User() : Parcelable {
    var profile_image = ""
    var name = ""
    var gender = ""
    var interested_in = ""
    var status = ""

    constructor(
        profile_image: String,
        name: String,
        gender: String,
        interested_in: String,
        status: String
    ) : this() {
        this.profile_image = profile_image
        this.name = name
        this.gender = gender
        this.interested_in = interested_in
        this.status = status
    }

    constructor(parcel: Parcel) : this() {
        profile_image = parcel.readString().toString()
        name = parcel.readString().toString()
        gender = parcel.readString().toString()
        interested_in = parcel.readString().toString()
        status = parcel.readString().toString()
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(profile_image)
        parcel.writeString(name)
        parcel.writeString(gender)
        parcel.writeString(interested_in)
        parcel.writeString(status)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<User> {
        override fun createFromParcel(parcel: Parcel): User {
            return User(parcel)
        }

        override fun newArray(size: Int): Array<User?> {
            return arrayOfNulls(size)
        }
    }
}
