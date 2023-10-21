package com.blckroot.relics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringRelicTest {

    // **** String Forge, Get Shortest String In Array ************************************************************** //

    @Test
    void STRING_FORGE__GET_SHORTEST_STRING_IN_ARRAY__null() {
        StringRelic stringForge = new StringRelic();
        assertNull(stringForge.getShortestStringInArray(null));
    }

    @Test
    void STRING_FORGE__GET_SHORTEST_STRING_IN_ARRAY__empty() {
        StringRelic stringForge = new StringRelic();
        assertNull(stringForge.getShortestStringInArray(new String[]{}));
    }

    @Test
    void STRING_FORGE__GET_SHORTEST_STRING_IN_ARRAY__success() {
        String expected = "str";
        StringRelic stringForge = new StringRelic();

        String actual = stringForge.getShortestStringInArray(
                new String[]{"stringA", expected, "stringB", "stringC"});

        assertEquals(expected, actual);
    }

    // **** String Forge, Get Shortest String In Array ************************************************************** //

    @Test
    void STRING_FORGE__GET_LONGEST_STRING_IN_ARRAY__null() {
        StringRelic stringForge = new StringRelic();
        assertNull(stringForge.getLongestStringInArray(null));
    }

    @Test
    void STRING_FORGE__GET_LONGEST_STRING_IN_ARRAY__empty() {
        StringRelic stringForge = new StringRelic();
        assertNull(stringForge.getLongestStringInArray(new String[]{}));
    }

    @Test
    void STRING_FORGE__GET_LONGEST_STRING_IN_ARRAY__success() {
        String expected = "longestString";
        StringRelic stringForge = new StringRelic();

        String actual = stringForge.getLongestStringInArray(
                new String[]{"stringA", "stringB", expected, "stringC"});

        assertEquals(expected, actual);
    }
}
