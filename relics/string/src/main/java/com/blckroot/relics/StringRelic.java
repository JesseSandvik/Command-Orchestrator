package com.blckroot.relics;

import java.util.Arrays;
import java.util.logging.Logger;
import java.util.logging.Level;


public class StringRelic implements StringRelicContract {
    private static final Logger LOGGER = Logger.getLogger(StringRelic.class.getName());
    private final StringRelicUtility stringRelicUtility;

    public StringRelic() {
        this.stringRelicUtility = new StringRelicUtility();
    }

    @Override
    public String getShortestStringInArray(String[] strings) {
        LOGGER.log(Level.INFO, Arrays.toString(strings));
        return stringRelicUtility.getShortestStringInArray(strings);
    }

    @Override
    public String getLongestStringInArray(String[] strings) {
        LOGGER.log(Level.INFO, Arrays.toString(strings));
        return stringRelicUtility.getLongestStringInArray(strings);
    }
}
