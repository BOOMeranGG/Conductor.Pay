package com.orange_infinity.onlinepay.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.orange_infinity.onlinepay.R
import com.orange_infinity.onlinepay.daggerConfigurations.MyApplication
import com.orange_infinity.onlinepay.useCase.NfcController
import com.orange_infinity.onlinepay.useCase.ServerController
import com.orange_infinity.onlinepay.useCase.YandexSdkManager
import javax.inject.Inject

class PayActivity : AppCompatActivity() {

    @Inject lateinit var yandexSdkManager: YandexSdkManager
    @Inject lateinit var nfcController: NfcController
    @Inject lateinit var serverController: ServerController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pay)

        (application as MyApplication).appComponent.inject(this)
    }
}
