package com.blckroot.forge;

import picocli.CommandLine;

class CommandLineForgeUtility implements CommandLineForgeContract {
    private final ForgedCommand forgedCommand;

    CommandLineForgeUtility(ForgedCommand forgedCommand) {
        this.forgedCommand = forgedCommand;
    }

    @Override
    public Integer execute(String[] arguments) {
        CommandLine commandLine = new CommandLineBuilder(forgedCommand).build();

        return commandLine.execute(arguments);
    }
}
