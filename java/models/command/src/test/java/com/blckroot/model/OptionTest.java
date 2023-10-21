package com.blckroot.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OptionTest {

    // **** Option, Set Properties, LongName ************************************************************************ //

    @Test
    void OPTION__set_longName__no_shortName__empty() {
        String expected = "";
        Option option = new Option(expected, null);

        String actual = option.getLongName();
        assertEquals(expected, actual);
    }

    @Test
    void OPTION__set_longName__no_shortName__blank() {
        String expected = "    ";
        Option option = new Option(expected, null);

        String actual = option.getLongName();
        assertEquals(expected, actual);
    }

    @Test
    void OPTION__set_longName__no_shortName() {
        String expected = "--long-option";
        Option option = new Option(expected, null);

        String actual = option.getLongName();
        assertEquals(expected, actual);
    }

    @Test
    void OPTION__set_longName__empty() {
        String expected = "";
        Option option = new Option(new String[]{expected, ""}, null);

        String actual = option.getLongName();
        assertEquals(expected, actual);
    }

    @Test
    void OPTION__set_longName__blank() {
        String expected = "    ";
        Option option = new Option(new String[]{expected, ""}, null);

        String actual = option.getLongName();
        assertEquals(expected, actual);
    }

    @Test
    void OPTION__set_longName() {
        String expected = "--long-option";
        Option option = new Option(new String[]{expected, ""}, null);

        String actual = option.getLongName();
        assertEquals(expected, actual);
    }

    // **** Option, Set Properties, shortName *********************************************************************** //

    @Test
    void OPTION__set_shortName__empty() {
        String expected = "";
        Option option = new Option(new String[]{"--long-option", expected}, null);

        String actual = option.getShortName();
        assertEquals(expected, actual);
    }

    @Test
    void OPTION__set_shortName__blank() {
        String expected = "   ";
        Option option = new Option(new String[]{"--long-option", expected}, null);

        String actual = option.getShortName();
        assertEquals(expected, actual);
    }

    @Test
    void OPTION__set_shortName() {
        String expected = "-a";
        Option option = new Option(new String[]{"--long-option", expected}, null);

        String actual = option.getShortName();
        assertEquals(expected, actual);
    }

    // **** Option, Set Properties, Synopsis ************************************************************************ //

    @Test
    void OPTION__set_synopsis__null() {
        Option option = new Option(new String[]{"--long-option", "-o"}, null);

        assertNull(option.getSynopsis());
    }

    @Test
    void OPTION__set_synopsis__empty() {
        String expected = "";
        Option option = new Option(new String[]{"--long-option", "-o"}, expected);

        String actual = option.getSynopsis();
        assertEquals(expected, actual);
    }

    @Test
    void OPTION__set_synopsis__blank() {
        String expected = "   ";
        Option option = new Option(new String[]{"--long-option", "-o"}, expected);

        String actual = option.getSynopsis();
        assertEquals(expected, actual);
    }

    @Test
    void OPTION__set_synopsis() {
        String expected = "Synopsis for option --long-option";
        Option option = new Option(new String[]{"--long-option", "-o"}, expected);

        String actual = option.getSynopsis();
        assertEquals(expected, actual);
    }

    // **** Option, Set Properties, Parameter Label ***************************************************************** //

    @Test
    void OPTION__set_parameter_label__null() {
        Option option = new Option(new String[]{"--long-option", "-o"}, null);
        option.setParameterLabel(null);

        assertNull(option.getParameterLabel());
    }

    @Test
    void OPTION__set_parameter_label__empty() {
        String expected = "";
        Option option = new Option(new String[]{"--long-option", "-o"}, null);
        option.setParameterLabel(expected);

        String actual = option.getParameterLabel();
        assertEquals(expected, actual);
    }

    @Test
    void OPTION__set_parameter_label__blank() {
        String expected = "    ";
        Option option = new Option(new String[]{"--long-option", "-o"}, null);
        option.setParameterLabel(expected);

        String actual = option.getParameterLabel();
        assertEquals(expected, actual);
    }

    @Test
    void OPTION__set_parameter_label() {
        String expected = "<label>";
        Option option = new Option(new String[]{"--long-option", "-o"}, null);
        option.setParameterLabel(expected);

        String actual = option.getParameterLabel();
        assertEquals(expected, actual);
    }

    // **** Option, Set Properties, Value *************************************************************************** //

    @Test
    void OPTION__set_parameter_value__null() {
        Option option = new Option(new String[]{"--long-option", "-o"}, null);
        option.setValue(null);

        assertNull(option.getValue());
    }

    @Test
    void OPTION__set_parameter_value__empty() {
        String expected = "";
        Option option = new Option(new String[]{"--long-option", "-o"}, null);
        option.setValue(expected);

        String actual = option.getValue().toString();
        assertEquals(expected, actual);
    }

    @Test
    void OPTION__set_parameter_value__blank() {
        String expected = "    ";
        Option option = new Option(new String[]{"--long-option", "-o"}, null);
        option.setValue(expected);

        String actual = option.getValue().toString();
        assertEquals(expected, actual);
    }

    @Test
    void OPTION__set_parameter_value__string() {
        String expected = "value";
        Option option = new Option(new String[]{"--long-option", "-o"}, null);
        option.setValue(expected);

        String actual = option.getValue().toString();
        assertEquals(expected, actual);
    }

    @Test
    void OPTION__set_parameter_value__boolean() {
        boolean expected = true;
        Option option = new Option(new String[]{"--long-option", "-o"}, null);
        option.setValue(expected);

        boolean actual = (boolean) option.getValue();
        assertEquals(expected, actual);
    }
}
