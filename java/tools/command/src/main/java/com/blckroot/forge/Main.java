package com.blckroot.forge;

public class Main {
    public static void main(String[] args) {
        ForgedCommand forgedCommand = new ForgedCommand("command");
        forgedCommand.setVersion("1.0.0");
        CommandLineForge commandLineForge = new CommandLineForge(forgedCommand);
        int exitCode = commandLineForge.execute(args);
        System.exit(exitCode);
    }
}
