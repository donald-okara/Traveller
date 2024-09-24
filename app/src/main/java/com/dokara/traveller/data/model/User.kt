package com.dokara.traveller.data.model

import com.google.firebase.firestore.PropertyName
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

data class User(
    @get:PropertyName("uid")
    @set:PropertyName("uid")
    var uid: String = "",

    @get:PropertyName("displayName")
    @set:PropertyName("displayName")
    var displayName: String? = null,

    @get:PropertyName("username")
    @set:PropertyName("username")
    var username: String? = null,

    @get:PropertyName("photoUrl")
    @set:PropertyName("photoUrl")
    var photoUrl: String? = null,

    @get:PropertyName("email")
    @set:PropertyName("email")
    var email: String? = null,

    @get:PropertyName("phoneNumber")
    @set:PropertyName("phoneNumber")
    var phoneNumber: String? = null,

    @get:PropertyName("birthday")
    @set:PropertyName("birthday")
    var birthday: String =  LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)
)

data class SignInResult(
    val data : User?,
    val errorMessage : String?
)