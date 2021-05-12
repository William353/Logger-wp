package com.example.logger

import com.example.logger.console.LoggerA
import com.example.logger.api.LoggerFactory
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Rule
import org.junit.Test
import org.junit.contrib.java.lang.system.SystemOutRule


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class LoggerUnitTestConsole {

    @get:Rule
    val systemOutRule: SystemOutRule = SystemOutRule().mute().enableLog()


    @Test
    fun `logger test String`() {
        systemOutRule.clearLog()
        val name = "StringTag"
        val msg = "test msg"
        val logger = LoggerFactory.getLogger(name)
        assertTrue(logger is LoggerA)
        logger.info(msg)
        assertEquals("$name:$msg\n", systemOutRule.log)
    }

    @Test
    fun `logger test Class`() {
        systemOutRule.clearLog()
        val msg = "test msg"
        val logger = LoggerFactory.getLogger(this::class.java)
        assertTrue(logger is LoggerA)
        logger.info(msg)
        assertEquals("${this::class.java.simpleName}:$msg\n", systemOutRule.log)
    }

    @Test
    fun `logger test KClass`() {
        systemOutRule.clearLog()
        val msg = "test msg"
        val logger = LoggerFactory.getLogger(this::class)
        assertTrue(logger is LoggerA)
        logger.info(msg)
        assertEquals("${this::class.java.simpleName}:$msg\n", systemOutRule.log)
    }

}