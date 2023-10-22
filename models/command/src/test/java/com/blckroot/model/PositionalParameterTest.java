package com.blckroot.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PositionalParameterTest {

    // **** Positional Parameter, Set Properties, Label ************************************************************* //

    @Test
    void POSITIONAL_PARAMETER__set_label__null() {
        PositionalParameter positionalParameter = new PositionalParameter(null, null);
        assertNull(positionalParameter.getLabel());
    }

    @Test
    void POSITIONAL_PARAMETER__set_label__empty() {
        String expected = "";
        PositionalParameter positionalParameter = new PositionalParameter(expected, null);

        String actual = positionalParameter.getLabel();
        assertEquals(expected, actual);
    }

    @Test
    void POSITIONAL_PARAMETER__set_label__blank() {
        String expected = "    ";
        PositionalParameter positionalParameter = new PositionalParameter(expected, null);

        String actual = positionalParameter.getLabel();
        assertEquals(expected, actual);
    }

    @Test
    void POSITIONAL_PARAMETER__set_label() {
        String expected = "label";
        PositionalParameter positionalParameter = new PositionalParameter(expected, null);

        String actual = positionalParameter.getLabel();
        assertEquals(expected, actual);
    }

    // **** Positional Parameter, Set Properties, Synopsis ********************************************************** //

    @Test
    void POSITIONAL_PARAMETER__set_synopsis__null() {
        PositionalParameter positionalParameter = new PositionalParameter(null, null);
        assertNull(positionalParameter.getSynopsis());
    }

    @Test
    void POSITIONAL_PARAMETER__set_synopsis__empty() {
        String expected = "";
        PositionalParameter positionalParameter = new PositionalParameter(null, expected);

        String actual = positionalParameter.getSynopsis();
        assertEquals(expected, actual);
    }

    @Test
    void POSITIONAL_PARAMETER__set_synopsis__blank() {
        String expected = "    ";
        PositionalParameter positionalParameter = new PositionalParameter(null, expected);

        String actual = positionalParameter.getSynopsis();
        assertEquals(expected, actual);
    }

    @Test
    void POSITIONAL_PARAMETER__set_synopsis() {
        String expected = "description";
        PositionalParameter positionalParameter = new PositionalParameter(null, expected);

        String actual = positionalParameter.getSynopsis();
        assertEquals(expected, actual);
    }

    // **** Positional Parameter, Set Properties, Value ************************************************************* //

    @Test
    void POSITIONAL_PARAMETER__set_value__null() {
        PositionalParameter positionalParameter = new PositionalParameter(null, null);
        positionalParameter.setValue(null);
        assertNull(positionalParameter.getValue());
    }

    @Test
    void POSITIONAL_PARAMETER__set_value__empty() {
        String expected = "";
        PositionalParameter positionalParameter = new PositionalParameter(null, null);
        positionalParameter.setValue(expected);

        String actual = positionalParameter.getValue().toString();
        assertEquals(expected, actual);
    }

    @Test
    void POSITIONAL_PARAMETER__set_value__blank() {
        String expected = "    ";
        PositionalParameter positionalParameter = new PositionalParameter(null, null);
        positionalParameter.setValue(expected);

        String actual = positionalParameter.getValue().toString();
        assertEquals(expected, actual);
    }

    @Test
    void POSITIONAL_PARAMETER__set_value_string() {
        String expected = "value";
        PositionalParameter positionalParameter = new PositionalParameter(null, null);
        positionalParameter.setValue(expected);

        String actual = positionalParameter.getValue().toString();
        assertEquals(expected, actual);
    }

    @Test
    void POSITIONAL_PARAMETER__set_value_boolean() {
        boolean expected = true;
        PositionalParameter positionalParameter = new PositionalParameter(null, null);
        positionalParameter.setValue(expected);

        boolean actual = (boolean) positionalParameter.getValue();
        assertEquals(expected, actual);
    }
}
