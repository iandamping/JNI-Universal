package com.ian.app.helper

/**
 *
Created by Ian Damping on 22/05/2019.
Github = https://github.com/iandamping
 */

object SecretKeyHelper {

    val baseUrl: String
        external get
    val apiKey: String
        external get
    val encriptionKey: String
        external get
    val communityId: String
        external get

    init {
        System.loadLibrary("ian")
    }

    fun baseUrlKey(): String {
        return baseUrl
    }

    fun apiKey(): String {
        return apiKey
    }

    fun encriptionKey(): String {
        return encriptionKey
    }

    fun communityIDKey(): String {
        return communityId
    }
}
