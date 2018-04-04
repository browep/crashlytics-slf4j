package org.slf4j.impl

import android.util.Log
import org.slf4j.ILoggerFactory
import org.slf4j.Logger
import java.util.concurrent.ConcurrentHashMap

/**
 * crashlytics logging factory
 */

class CrashlyticsLoggerFactory : ILoggerFactory {

    private val loggerMap = ConcurrentHashMap<String, Logger>()

    init {
        Log.i(javaClass.canonicalName, "slf4j: init")
    }

    /**
     * Return an appropriate [CrashlyticsLoggerAdapter] instance by name.
     */
    override fun getLogger(name: String): Logger {
        val tag = name
        var logger: Logger? = loggerMap[tag]
        if (logger == null) {
            val newInstance = CrashlyticsLoggerAdapter(tag)
            val oldInstance = loggerMap.putIfAbsent(tag, newInstance)
            logger = oldInstance ?: newInstance
        }
        return logger
    }

}
