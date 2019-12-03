package com.orange_infinity.onlinepay.data.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

private const val UPDATER_URL = "http://kolyanpie.ddns.net:8095"

class UpdateNetworkService {

    private var retrofit: Retrofit

    init {
        retrofit = Retrofit.Builder()
            .baseUrl(UPDATER_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    companion object {
        private var instance: UpdateNetworkService? = null

        fun getInstance(): UpdateNetworkService {
            if (instance == null) {
                instance = UpdateNetworkService()
            }
            return instance!!
        }
    }

    fun getLastVersionPlaceHolderApi(): LastVersionPlaceHolderApi {
        return retrofit.create(LastVersionPlaceHolderApi::class.java)
    }

    fun getUpdaterPlaceHolderApi(): UpdaterPlaceHolder {
        return retrofit.create(UpdaterPlaceHolder::class.java)
    }
}