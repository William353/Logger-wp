package com.example.logger.api

/**
 *
 * Created by wangpeng on 5/7/21
 */
interface ILoggerFactory {
    fun getLogger(name: String): Logger
}