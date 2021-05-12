package com.example.logger

import com.example.logger.api.LoggerFactory
import com.example.logger.logcat.LoggerB
import org.junit.Assert
import org.junit.Test


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class LoggerUnitTestLogcat {


    @Test
    fun `logger test String`() {
        val name = "StringTag"
        val logger = LoggerFactory.getLogger(name)
        Assert.assertTrue(logger is LoggerB)
    }

    @Test
    fun `logger test Class`() {
        val logger = LoggerFactory.getLogger(this::class.java)
        Assert.assertTrue(logger is LoggerB)
    }

    @Test
    fun `logger test KClass`() {
        val logger = LoggerFactory.getLogger(this::class)
        Assert.assertTrue(logger is LoggerB)
    }

}