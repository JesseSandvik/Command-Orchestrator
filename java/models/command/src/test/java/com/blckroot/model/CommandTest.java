package com.blckroot.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CommandTest {

    // **** Command, Set Properties, CommandName ******************************************************************** //

    @Test
    void COMMAND__set_commandName__null() {
        Command command = new Command(null);
        assertNull(command.getCommandName());
    }

    @Test
    void COMMAND__set_commandName__empty() {
        String expected = "";
        Command command = new Command(expected);

        String actual = command.getCommandName();
        assertEquals(expected, actual);
    }

    @Test
    void COMMAND__set_commandName__blank() {
        String expected = "   ";
        Command command = new Command(expected);

        String actual = command.getCommandName();
        assertEquals(expected, actual);
    }

    @Test
    void COMMAND__set_commandName() {
        String expected = "command";
        Command command = new Command(expected);

        String actual = command.getCommandName();
        assertEquals(expected, actual);
    }

    // **** Command, Set Properties, ParentCommandName ************************************************************** //

    @Test
    void COMMAND__set_commandParentName__null() {
        Command command = new Command("command");
        command.setParentCommandName(null);

        assertNull(command.getParentCommandName());
    }

    @Test
    void COMMAND__set_commandParentName__empty() {
        String expected = "";
        Command command = new Command("command");
        command.setParentCommandName(expected);

        String actual = command.getParentCommandName();
        assertEquals(expected, actual);
    }

    @Test
    void COMMAND__set_commandParentName__blank() {
        String expected = "   ";
        Command command = new Command("command");
        command.setParentCommandName(expected);

        String actual = command.getParentCommandName();
        assertEquals(expected, actual);
    }

    @Test
    void COMMAND__set_commandParentName() {
        String expected = "parent";
        Command command = new Command("command");
        command.setParentCommandName(expected);

        String actual = command.getParentCommandName();
        assertEquals(expected, actual);
    }

    // **** Command, Set Properties, Version ************************************************************************ //

    @Test
    void COMMAND__set_version__null() {
        Command command = new Command("command");
        command.setVersion(null);

        assertNull(command.getVersion());
    }

    @Test
    void COMMAND__set_version__empty() {
        String expected = "";
        Command command = new Command("command");
        command.setVersion(expected);

        String actual = command.getVersion();
        assertEquals(expected, actual);
    }

    @Test
    void COMMAND__set_version__blank() {
        String expected = "   ";
        Command command = new Command("command");
        command.setVersion(expected);

        String actual = command.getVersion();
        assertEquals(expected, actual);
    }

    @Test
    void COMMAND__set_version() {
        String expected = "parent";
        Command command = new Command("command");
        command.setVersion(expected);

        String actual = command.getVersion();
        assertEquals(expected, actual);
    }

    // **** Command, Set Properties, Synopsis *********************************************************************** //

    @Test
    void COMMAND__set_synopsis__null() {
        Command command = new Command("command");
        command.setSynopsis(null);

        assertNull(command.getSynopsis());
    }

    @Test
    void COMMAND__set_synopsis__empty() {
        String expected = "";
        Command command = new Command("command");
        command.setSynopsis(expected);

        String actual = command.getSynopsis();
        assertEquals(expected, actual);
    }

    @Test
    void COMMAND__set_synopsis__blank() {
        String expected = "   ";
        Command command = new Command("command");
        command.setSynopsis(expected);

        String actual = command.getSynopsis();
        assertEquals(expected, actual);
    }

    @Test
    void COMMAND__set_synopsis() {
        String expected = "Synopsis for command.";
        Command command = new Command("command");
        command.setSynopsis(expected);

        String actual = command.getSynopsis();
        assertEquals(expected, actual);
    }

    // **** Command, Set Properties, Description ******************************************************************** //

    @Test
    void COMMAND__set_description__null() {
        Command command = new Command("command");
        command.setDescription(null);

        assertNull(command.getDescription());
    }

    @Test
    void COMMAND__set_description__empty() {
        String expected = "";
        Command command = new Command("command");
        command.setDescription(expected);

        String actual = command.getDescription();
        assertEquals(expected, actual);
    }

    @Test
    void COMMAND__set_description__blank() {
        String expected = "   ";
        Command command = new Command("command");
        command.setDescription(expected);

        String actual = command.getDescription();
        assertEquals(expected, actual);
    }

    @Test
    void COMMAND__set_description() {
        String expected = "Description for command.";
        Command command = new Command("command");
        command.setDescription(expected);

        String actual = command.getDescription();
        assertEquals(expected, actual);
    }

    // **** Command, Set Properties, ExecutesWithoutArguments ******************************************************* //

    @Test
    void COMMAND__set_executesWithoutArguments__null() {
        Command command = new Command("command");
        command.executesWithoutArguments(null);

        assertNull(command.executesWithoutArguments());
    }

    @Test
    void COMMAND__set_executesWithoutArguments__false() {
        Command command = new Command("command");
        command.executesWithoutArguments(false);

        assertFalse(command.executesWithoutArguments());
    }

    @Test
    void COMMAND__set_executesWithoutArguments__true() {
        Command command = new Command("command");
        command.executesWithoutArguments(true);

        assertTrue(command.executesWithoutArguments());
    }

    // **** Command, Set Properties, PositionalParameters *********************************************************** //

    @Test
    void COMMAND__set_positional_parameter__null() {
        Command command = new Command("command");
        command.addPositionalParameter(null);

        assertNull(command.getPositionalParameters().get(0));
    }

    @Test
    void COMMAND__set_positional_parameter__label() {
        String expected = "label";
        PositionalParameter positionalParameter = new PositionalParameter(expected, "description");

        Command command = new Command("command");
        command.addPositionalParameter(positionalParameter);

        String actual = command.getPositionalParameters().get(0).getLabel();
        assertEquals(expected, actual);
    }

    @Test
    void COMMAND__set_positional_parameter__synopsis() {
        String expected = "description";
        PositionalParameter positionalParameter = new PositionalParameter("label", expected);

        Command command = new Command("command");
        command.addPositionalParameter(positionalParameter);

        String actual = command.getPositionalParameters().get(0).getSynopsis();
        assertEquals(expected, actual);
    }

    @Test
    void COMMAND__set_positional_parameter__value__string() {
        String expected = "value";
        PositionalParameter positionalParameter = new PositionalParameter("label", "description");
        positionalParameter.setValue(expected);

        Command command = new Command("command");
        command.addPositionalParameter(positionalParameter);

        String actual = command.getPositionalParameters().get(0).getValue().toString();
        assertEquals(expected, actual);
    }

    @Test
    void COMMAND__set_positional_parameter__value__boolean() {
        boolean expected = true;
        PositionalParameter positionalParameter = new PositionalParameter("label", "description");
        positionalParameter.setValue(expected);

        Command command = new Command("command");
        command.addPositionalParameter(positionalParameter);

        boolean actual = (boolean) command.getPositionalParameters().get(0).getValue();
        assertEquals(expected, actual);
    }

    // **** Command, Set Properties, Options ************************************************************************ //

    @Test
    void COMMAND__set_option__null() {
        Command command = new Command("command");
        command.addOption(null);

        assertNull(command.getOptions().get(0));
    }

    @Test
    void COMMAND__set_option__longName__no_shortName() {
        String expected = "--long-option";
        Option option = new Option(expected, "Synopsis for --long-option");

        Command command = new Command("command");
        command.addOption(option);

        String actual = command.getOptions().get(0).getLongName();
        assertEquals(expected, actual);
    }

    @Test
    void COMMAND__set_option__synopsis__no_shortName() {
        String expected = "Synopsis for --long-option";
        Option option = new Option("--long-option", expected);

        Command command = new Command("command");
        command.addOption(option);

        String actual = command.getOptions().get(0).getSynopsis();
        assertEquals(expected, actual);
    }

    @Test
    void COMMAND__set_option__parameterLabel__no_shortName() {
        String expected = "<label>";
        Option option = new Option("--long-option", "Synopsis for --long-option");
        option.setParameterLabel(expected);

        Command command = new Command("command");
        command.addOption(option);

        String actual = command.getOptions().get(0).getParameterLabel();
        assertEquals(expected, actual);
    }

    @Test
    void COMMAND__set_option__value__string__no_shortName() {
        String expected = "value";
        Option option = new Option("--long-option", "Synopsis for --long-option");
        option.setValue(expected);

        Command command = new Command("command");
        command.addOption(option);

        String actual = command.getOptions().get(0).getValue().toString();
        assertEquals(expected, actual);
    }

    @Test
    void COMMAND__set_option__value__boolean__no_shortName() {
        boolean expected = true;
        Option option = new Option("--long-option", "Synopsis for --long-option");
        option.setValue(expected);

        Command command = new Command("command");
        command.addOption(option);

        boolean actual = (boolean) command.getOptions().get(0).getValue();
        assertEquals(expected, actual);
    }

    @Test
    void COMMAND__set_option__longName() {
        String expected = "--long-option";
        Option option = new Option(new String[]{expected, "-o"}, "Synopsis for --long-option");

        Command command = new Command("command");
        command.addOption(option);

        String actual = command.getOptions().get(0).getLongName();
        assertEquals(expected, actual);
    }

    @Test
    void COMMAND__set_option__shortName() {
        String expected = "-o";
        Option option = new Option(new String[]{"--long-option", expected}, "Synopsis for --long-option");

        Command command = new Command("command");
        command.addOption(option);

        String actual = command.getOptions().get(0).getShortName();
        assertEquals(expected, actual);
    }

    @Test
    void COMMAND__set_option__synopsis() {
        String expected = "Synopsis for --long-option";
        Option option = new Option(new String[]{"--long-option", "-o"}, expected);

        Command command = new Command("command");
        command.addOption(option);

        String actual = command.getOptions().get(0).getSynopsis();
        assertEquals(expected, actual);
    }

    @Test
    void COMMAND__set_option__parameterLabel() {
        String expected = "<label>";
        Option option = new Option(new String[]{"--long-option", "-o"}, "Synopsis for --long-option");
        option.setParameterLabel(expected);

        Command command = new Command("command");
        command.addOption(option);

        String actual = command.getOptions().get(0).getParameterLabel();
        assertEquals(expected, actual);
    }

    @Test
    void COMMAND__set_option__value__string() {
        String expected = "value";
        Option option = new Option(new String[]{"--long-option", "-o"}, "Synopsis for --long-option");
        option.setValue(expected);

        Command command = new Command("command");
        command.addOption(option);

        String actual = command.getOptions().get(0).getValue().toString();
        assertEquals(expected, actual);
    }

    @Test
    void COMMAND__set_option__value__boolean() {
        boolean expected = true;
        Option option = new Option(new String[]{"--long-option", "-o"}, "Synopsis for --long-option");
        option.setValue(expected);

        Command command = new Command("command");
        command.addOption(option);

        boolean actual = (boolean) command.getOptions().get(0).getValue();
        assertEquals(expected, actual);
    }

    // **** Command, Set Properties, Subcommands ******************************************************************** //

    @Test
    void COMMAND__set_subcommand__null() {
        Command command = new Command("command");
        command.addSubcommand(null);

        assertNull(command.getSubcommands().get(0));
    }
}
