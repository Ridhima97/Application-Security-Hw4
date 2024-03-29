package com.example.giftcardsite.api.service

import com.example.giftcardsite.api.model.User
import com.example.giftcardsite.api.model.UserInfoContainer
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Header

interface UserInfo {
    fun postInfo(@Body info: UserInfoContainer, @Header("Authorization") token: String?) : Call<User>
}
