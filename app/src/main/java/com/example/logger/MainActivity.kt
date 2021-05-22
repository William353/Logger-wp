package com.example.logger

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.logger.api.Logger
import com.example.logger.api.logger

class MainActivity : AppCompatActivity() {

    private val logger: Logger by logger()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        logger.info("111111111111111")
        
    }
}