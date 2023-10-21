package com.blckroot.forge;

public class StringForge implements StringForgeContract {
    private final StringForgeUtility stringForgeUtility;

    public StringForge() {
        this.stringForgeUtility = new StringForgeUtility();
    }

    @Override
    public String getShortestStringInArray(String[] strings) {
        return stringForgeUtility.getShortestStringInArray(strings);
    }

    @Override
    public String getLongestStringInArray(String[] strings) {
        return stringForgeUtility.getLongestStringInArray(strings);
    }
}
