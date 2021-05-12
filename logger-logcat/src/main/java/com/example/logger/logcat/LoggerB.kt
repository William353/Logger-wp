package com.example.logger.logcat

import android.util.Log
import com.example.logger.api.Logger

/**
 *
 * Created by wangpeng on 5/7/21
 */
internal class LoggerB(private val tag: String) : Logger {
    override fun info(msg: String) {
        Log.d(tag, "$msg")
    }
}