package com.example.logger.api

import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

/**
 *
 * Created by wangpeng on 5/15/21
 */
class LoggerProperty<T>(private val tag: String) : ReadOnlyProperty<T, Logger> {
    override fun getValue(thisRef: T, property: KProperty<*>): Logger {
        return LoggerFactory.getLogger(tag)
    }
}

inline fun <reified T : Any> logger(tag: String = T::class.java.simpleName) =
    LoggerProperty<T>(tag)