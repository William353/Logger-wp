package com.example.logger.impl

import com.example.logger.api.ILoggerFactory
import com.example.logger.api.Logger

internal object NopLoggerFactory : ILoggerFactory {
    override fun getLogger(name: String): Logger = NopLogger
}