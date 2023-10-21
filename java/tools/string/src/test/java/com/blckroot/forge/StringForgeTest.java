package com.blckroot.forge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringForgeTest {

    // **** String Forge, Get Shortest String In Array ************************************************************** //

    @Test
    void STRING_FORGE__GET_SHORTEST_STRING_IN_ARRAY__null() {
        StringForge stringForge = new StringForge();
        assertNull(stringForge.getShortestStringInArray(null));
    }

    @Test
    void STRING_FORGE__GET_SHORTEST_STRING_IN_ARRAY__empty() {
        StringForge stringForge = new StringForge();
        assertNull(stringForge.getShortestStringInArray(new String[]{}));
    }

    @Test
    void STRING_FORGE__GET_SHORTEST_STRING_IN_ARRAY__success() {
        String expected = "str";
        StringForge stringForge = new StringForge();

        String actual = stringForge.getShortestStringInArray(
                new String[]{"stringA", expected, "stringB", "stringC"});

        assertEquals(expected, actual);
    }

    // **** String Forge, Get Shortest String In Array ************************************************************** //

    @Test
    void STRING_FORGE__GET_LONGEST_STRING_IN_ARRAY__null() {
        StringForge stringForge = new StringForge();
        assertNull(stringForge.getLongestStringInArray(null));
    }

    @Test
    void STRING_FORGE__GET_LONGEST_STRING_IN_ARRAY__empty() {
        StringForge stringForge = new StringForge();
        assertNull(stringForge.getLongestStringInArray(new String[]{}));
    }

    @Test
    void STRING_FORGE__GET_LONGEST_STRING_IN_ARRAY__success() {
        String expected = "longestString";
        StringForge stringForge = new StringForge();

        String actual = stringForge.getLongestStringInArray(
                new String[]{"stringA", "stringB", expected, "stringC"});

        assertEquals(expected, actual);
    }
}
