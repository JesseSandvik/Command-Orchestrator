package com.blckroot.relics;

import java.io.IOException;

public class LoggingRelic implements LoggingRelicContract {
    private final LoggingRelicUtility loggingRelicUtility;

    public LoggingRelic(String className) throws IOException {
        this.loggingRelicUtility = new LoggingRelicUtility(className);
    }

    @Override
    public void trace(String message) {
        loggingRelicUtility.trace(message);
    }

    @Override
    public void debug(String message) {
        loggingRelicUtility.debug(message);
    }

    @Override
    public void info(String message) {
        loggingRelicUtility.info(message);
    }

    @Override
    public void warn(String message) {
        loggingRelicUtility.warn(message);
    }

    @Override
    public void error(String message) {
        loggingRelicUtility.error(message);
    }

    @Override
    public void fatal(String message) {
        loggingRelicUtility.fatal(message);
    }
}
