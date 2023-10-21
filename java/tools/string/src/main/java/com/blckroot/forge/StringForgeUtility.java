package com.blckroot.forge;

class StringForgeUtility implements StringForgeContract {
    public String getShortestStringInArray(String[] strings) {
        if (strings == null || strings.length < 1) {
            return null;
        }

        String shortestString = null;

        for (String string : strings) {
            if (shortestString == null) {
                shortestString = string;
            } else {
                if (string.length() < shortestString.length()) {
                    shortestString = string;
                }
            }
        }
        return shortestString;
    }

    public String getLongestStringInArray(String[] strings) {
        if (strings == null || strings.length < 1) {
            return null;
        }

        String longestString = null;

        for (String string : strings) {
            if (longestString == null) {
                longestString = string;
            } else {
                if (string.length() > longestString.length()) {
                    longestString = string;
                }
            }
        }
        return longestString;
    }
}
