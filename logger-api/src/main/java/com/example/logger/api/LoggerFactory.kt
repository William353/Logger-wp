package com.example.logger.api

import com.example.logger.impl.NopLoggerFactory
import com.example.logger.impl.StaticLoggerBinder
import kotlin.reflect.KClass

/**
 *
 * Created by wangpeng on 5/7/21
 */
object LoggerFactory {
    private val delegate: ILoggerFactory by lazy {
        try {
            StaticLoggerBinder.loggerFactory
        } catch (e: NoClassDefFoundError) {
            NopLoggerFactory
        }
    }

    fun getLogger(name: String): Logger = delegate.getLogger(name)

    fun getLogger(clazz: KClass<*>): Logger = getLogger(clazz.java)

    fun getLogger(clazz: Class<*>): Logger = getLogger(clazz.simpleName)


}