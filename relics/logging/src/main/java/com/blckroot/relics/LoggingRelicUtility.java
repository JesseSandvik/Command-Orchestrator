package com.blckroot.relics;

import java.util.logging.Logger;
import java.util.logging.Level;

class LoggingRelicUtility implements LoggingRelicContract {
    private final Logger logger;

    public LoggingRelicUtility(String className) {
        this.logger = Logger.getLogger(className);
    }

    @Override
    public void trace(String message) {
        logger.log(Level.parse("TRACE"), message);
    }

    @Override
    public void debug(String message) {
        logger.log(Level.parse("DEBUG"), message);
    }

    @Override
    public void info(String message) {
        logger.log(Level.INFO, message);
    }

    @Override
    public void warn(String message) {
        logger.log(Level.WARNING, message);
    }

    @Override
    public void error(String message) {
        logger.log(Level.parse("ERROR"), message);
    }

    @Override
    public void fatal(String message) {
        logger.log(Level.parse("FATAL"), message);
    }
}
