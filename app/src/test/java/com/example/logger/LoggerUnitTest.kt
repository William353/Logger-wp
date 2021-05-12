package com.example.logger

import com.example.logger.api.LoggerFactory
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Rule
import org.junit.Test
import org.junit.contrib.java.lang.system.SystemOutRule




/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class LoggerUnitTest {

    @get:Rule
     val systemOutRule = SystemOutRule().mute().enableLog()

    @Test
    fun addition_isCorrect() {
        print("some text"); //is not visible on the console

        assertEquals("some text", systemOutRule.getLog()); //succeeds
    }

    @Test
    fun `logger test`() {
        val msg = "test msg"
        val logger = LoggerFactory.getLogger(this::class.java).info(msg)
        assertNotNull(logger)
        assertEquals(msg, systemOutRule.log)
    }
}