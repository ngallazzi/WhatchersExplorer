package com.ngallazzi.watchersexplorer.remote.models

import android.os.Parcelable
import com.squareup.moshi.Json
import kotlinx.android.parcel.Parcelize

@Parcelize
class Owner(@Json(name = "login") val login: String,
            @Json(name = "avatar_url") var avatarUrl: String,
            @Json(name = "url") var url: String) : Parcelable