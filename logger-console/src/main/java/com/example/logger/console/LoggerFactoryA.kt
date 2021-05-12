package com.example.logger.console

import com.example.logger.api.ILoggerFactory
import com.example.logger.api.Logger
import java.util.concurrent.ConcurrentHashMap

/**
 *
 * Created by wangpeng on 5/7/21
 */
internal class LoggerFactoryA : ILoggerFactory {
    private val map: MutableMap<String, Logger> by lazy(::ConcurrentHashMap)

    override fun getLogger(name: String): Logger {
        return map.getOrPut(name, { LoggerA(name) })
    }
}