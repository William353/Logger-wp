package com.example.logger.console

import com.example.logger.api.Logger

/**
 *
 * Created by wangpeng on 5/7/21
 */
internal class LoggerA(private val tag: String) : Logger {
    override fun info(msg: String) {
        println("$tag:$msg")
    }

}