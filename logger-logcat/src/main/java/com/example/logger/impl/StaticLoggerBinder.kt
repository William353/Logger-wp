package com.example.logger.impl

import com.example.logger.logcat.LoggerFactoryB
import com.example.logger.api.ILoggerFactory
import com.example.logger.api.LoggerFactoryBinder

/**
 * Created by wangpeng on 5/7/21
 */
internal object StaticLoggerBinder : LoggerFactoryBinder {

    override val loggerFactory: ILoggerFactory by lazy(::LoggerFactoryB)
}