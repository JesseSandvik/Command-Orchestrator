package com.blckroot.relics;

import java.io.IOException;
import java.util.Arrays;


public class StringRelic implements StringRelicContract {
    private static final LoggingRelic LOGGER;

    static {
        try {
            LOGGER = new LoggingRelic(StringRelic.class.getName());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private final StringRelicUtility stringRelicUtility;

    public StringRelic() {
        this.stringRelicUtility = new StringRelicUtility();
    }

    @Override
    public String getShortestStringInArray(String[] strings) {
        LOGGER.debug("DEBUG MESSAGE");
        LOGGER.error("ERROR MESSAGE");
        LOGGER.fatal("FATAL MESSAGE");
        LOGGER.info("INFO MESSAGE");
        LOGGER.warn("WARN MESSAGE");
        LOGGER.trace("TRACE MESSAGE");
        return stringRelicUtility.getShortestStringInArray(strings);
    }

    @Override
    public String getLongestStringInArray(String[] strings) {
        LOGGER.debug("DEBUG MESSAGE");
        LOGGER.error("ERROR MESSAGE");
        LOGGER.fatal("FATAL MESSAGE");
        LOGGER.info("INFO MESSAGE");
        LOGGER.warn("WARN MESSAGE");
        LOGGER.trace("TRACE MESSAGE");
        return stringRelicUtility.getLongestStringInArray(strings);
    }
}
