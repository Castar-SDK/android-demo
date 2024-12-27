package com.example.castardemo

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.castarsdk.android.CastarSdk
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView() {
        findViewById<Button>(R.id.btn_start).setOnClickListener(View.OnClickListener {
            startSdk()
        })

        findViewById<Button>(R.id.btn_stop).setOnClickListener(View.OnClickListener {
            stopSdk()
        })

    }

    //start sdk
    private fun startSdk() {
        GlobalScope.launch(Dispatchers.IO) {
            CastarSdk.Start(this@MainActivity, "YOUR_DEV_KEY")
        }
    }

    //stop sdk
    private fun stopSdk() {
        CastarSdk.Stop()
    }


}



