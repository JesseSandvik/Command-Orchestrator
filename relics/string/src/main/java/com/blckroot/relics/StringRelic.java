package com.blckroot.relics;

public class StringRelic implements StringRelicContract {
    private final StringRelicUtility stringRelicUtility;

    public StringRelic() {
        this.stringRelicUtility = new StringRelicUtility();
    }

    @Override
    public String getShortestStringInArray(String[] strings) {
        return stringRelicUtility.getShortestStringInArray(strings);
    }

    @Override
    public String getLongestStringInArray(String[] strings) {
        return stringRelicUtility.getLongestStringInArray(strings);
    }
}
