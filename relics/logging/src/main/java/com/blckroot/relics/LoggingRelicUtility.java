package com.blckroot.relics;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;
import java.util.logging.Level;

class LoggingRelicUtility implements LoggingRelicContract {
    private Handler handler;
    private final Logger logger;

    public LoggingRelicUtility(String className) throws IOException {
        this.logger = Logger.getLogger(className);
        OperatingSystemRelic operatingSystemRelic = new OperatingSystemRelic();
        String logFilePath = operatingSystemRelic.getUserHomeDirectory() +
                operatingSystemRelic.getFileSeparator() +
                ".blckroot" +
                operatingSystemRelic.getFileSeparator() +
                "relic.log";

        this.handler = new FileHandler(logFilePath);
        this.logger.addHandler(handler);
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
