package com.blckroot.forge;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class CommandLineForgeTest {
    final PrintStream originalOut = System.out;
    final PrintStream originalErr = System.err;
    final ByteArrayOutputStream out = new ByteArrayOutputStream();
    final ByteArrayOutputStream err = new ByteArrayOutputStream();

    @BeforeEach
    public void setUpStreams() {
        out.reset();
        err.reset();
        System.setOut(new PrintStream(out));
        System.setErr(new PrintStream(err));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    // **** Command Line Forge, Usage Help ************************************************************************** //

    @Test
    void COMMANDLINE_FORGE_usage_help__option__shortName() {
        ForgedCommand forgedCommand = new ForgedCommand("command");
        CommandLineForge commandLineForge = new CommandLineForge(forgedCommand);
        commandLineForge.execute(new String[]{"-h"});

        assertTrue(out.toString().contains("-h"));
        assertTrue(out.toString().contains("--help"));
    }

    @Test
    void COMMANDLINE_FORGE_usage_help__option__longName() {
        ForgedCommand forgedCommand = new ForgedCommand("command");
        CommandLineForge commandLineForge = new CommandLineForge(forgedCommand);
        commandLineForge.execute(new String[]{"--help"});

        assertTrue(out.toString().contains("-h"));
        assertTrue(out.toString().contains("--help"));
    }

    @Test
    void COMMANDLINE_FORGE_usage_help__includes__commandName() {
        ForgedCommand forgedCommand = new ForgedCommand("command");
        CommandLineForge commandLineForge = new CommandLineForge(forgedCommand);
        commandLineForge.execute(new String[]{"-h"});

        assertTrue(out.toString().contains(forgedCommand.getCommandName()));
    }

    // **** Command Line Forge, Version Help ************************************************************************ //

    @Test
    void COMMANDLINE_FORGE_version_help__usage_help__no_version() {
        ForgedCommand forgedCommand = new ForgedCommand("command");
        CommandLineForge commandLineForge = new CommandLineForge(forgedCommand);
        commandLineForge.execute(new String[]{"-h"});


        assertFalse(out.toString().contains("-v"));
        assertFalse(out.toString().contains("--version"));
    }

    @Test
    void COMMANDLINE_FORGE_version_help__usage_help__version() {
        ForgedCommand forgedCommand = new ForgedCommand("command");
        forgedCommand.setVersion("1.0.0");

        CommandLineForge commandLineForge = new CommandLineForge(forgedCommand);
        commandLineForge.execute(new String[]{"-h"});

        assertTrue(out.toString().contains("-v"));
        assertTrue(out.toString().contains("--version"));
    }

    @Test
    void COMMANDLINE_FORGE_version_help__option__shortName() {
        ForgedCommand forgedCommand = new ForgedCommand("command");
        forgedCommand.setVersion("1.0.0");

        CommandLineForge commandLineForge = new CommandLineForge(forgedCommand);
        commandLineForge.execute(new String[]{"-v"});

        assertTrue(out.toString().contains(forgedCommand.getVersion()));
    }

    @Test
    void COMMANDLINE_FORGE_version_help__option__longName() {
        ForgedCommand forgedCommand = new ForgedCommand("command");
        forgedCommand.setVersion("1.0.0");

        CommandLineForge commandLineForge = new CommandLineForge(forgedCommand);
        commandLineForge.execute(new String[]{"-version"});

        assertTrue(out.toString().contains(forgedCommand.getVersion()));
    }
}
