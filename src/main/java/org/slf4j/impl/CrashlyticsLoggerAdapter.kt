package org.slf4j.impl

import android.util.Log
import com.crashlytics.android.Crashlytics
import org.slf4j.helpers.MarkerIgnoringBase

/**
 * crashlytics logger
 */
class CrashlyticsLoggerAdapter() : MarkerIgnoringBase() {

    constructor(name: String) : this() {
        this.name = name
    }

    override fun warn(msg: String?) {
        Crashlytics.log(Log.WARN, getName(), msg)
    }

    override fun warn(format: String?, arg: Any?) {
        Crashlytics.log(Log.WARN, getName(), format?.let { String.format(it, arg) })
    }

    override fun warn(format: String?, vararg arguments: Any?) {
        Crashlytics.log(Log.WARN, getName(), format?.let { String.format(it, arguments) })
    }

    override fun warn(format: String?, arg1: Any?, arg2: Any?) {
        Crashlytics.log(Log.WARN, getName(), format?.let { String.format(it, arg1, arg2) })
    }

    override fun warn(msg: String?, t: Throwable?) {
        Crashlytics.log(Log.WARN, getName(), t?.message)
    }

    override fun info(msg: String?) {
        Crashlytics.log(Log.INFO, getName(), msg)
    }

    override fun info(format: String?, arg: Any?) {
        Crashlytics.log(Log.INFO, getName(), format?.let { String.format(it, arg) })
    }

    override fun info(format: String?, arg1: Any?, arg2: Any?) {
        Crashlytics.log(Log.INFO, getName(), format?.let { String.format(it, arg1, arg2) })
    }

    override fun info(format: String?, vararg arguments: Any?) {
        Crashlytics.log(Log.INFO, getName(), format?.let { String.format(it, arguments) })
    }

    override fun info(msg: String?, t: Throwable?) {
        Crashlytics.log(Log.INFO, getName(), t?.message)
    }

    override fun isErrorEnabled(): Boolean {
        return true
    }

    override fun error(msg: String?) {
        Crashlytics.log(Log.ERROR, getName(), msg)
    }

    override fun error(format: String?, arg: Any?) {
        Crashlytics.log(Log.ERROR, getName(), format?.let { String.format(it, arg) })
    }

    override fun error(format: String?, arg1: Any?, arg2: Any?) {
        Crashlytics.log(Log.ERROR, getName(), format?.let { String.format(it, arg1, arg2) })
    }

    override fun error(format: String?, vararg arguments: Any?) {
        Crashlytics.log(Log.ERROR, getName(), format?.let { String.format(it, arguments) })
    }

    override fun error(msg: String?, t: Throwable?) {
        Crashlytics.log(Log.ERROR, getName(), t?.message)
    }

    override fun isDebugEnabled(): Boolean {
        return true
    }

    override fun debug(msg: String?) {
        Crashlytics.log(Log.DEBUG, getName(), msg)
    }

    override fun debug(format: String?, arg: Any?) {
        Crashlytics.log(Log.DEBUG, getName(), format?.let { String.format(it, arg) })
    }

    override fun debug(format: String?, arg1: Any?, arg2: Any?) {
        Crashlytics.log(Log.DEBUG, getName(), format?.let { String.format(it, arg1, arg2) })
    }

    override fun debug(format: String?, vararg arguments: Any?) {
        Crashlytics.log(Log.DEBUG, getName(), format?.let { String.format(it, arguments) })
    }

    override fun debug(msg: String?, t: Throwable?) {
        Crashlytics.log(Log.DEBUG, getName(), t?.message)
    }

    override fun isInfoEnabled(): Boolean {
        return true
    }

    override fun trace(msg: String?) {
        Crashlytics.log(Log.VERBOSE, getName(), msg)
    }

    override fun trace(format: String?, arg: Any?) {
        Crashlytics.log(Log.VERBOSE, getName(), format?.let { String.format(it, arg) })
    }

    override fun trace(format: String?, arg1: Any?, arg2: Any?) {
        Crashlytics.log(Log.VERBOSE, getName(), format?.let { String.format(it, arg1, arg2) })
    }

    override fun trace(format: String?, vararg arguments: Any?) {
        Crashlytics.log(Log.VERBOSE, getName(), format?.let { String.format(it, arguments) })
    }

    override fun trace(msg: String?, t: Throwable?) {
        Crashlytics.log(Log.VERBOSE, getName(), t?.message)
    }

    override fun isWarnEnabled(): Boolean {
        return true
    }

    override fun isTraceEnabled(): Boolean {
        return true
    }
}
