package com.orange_infinity.onlinepay.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.orange_infinity.onlinepay.R
import com.orange_infinity.onlinepay.daggerConfigurations.MyApplication
import com.orange_infinity.onlinepay.useCase.TicketManager
import javax.inject.Inject

class SettingsActivity : AppCompatActivity() {

    @Inject lateinit var ticketManager: TicketManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        (application as MyApplication).appComponent.inject(this)
    }
}