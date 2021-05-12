package com.example.logger.impl

import com.example.logger.api.Logger


internal object NopLogger : Logger {
    override fun info(msg: String) = Unit
}