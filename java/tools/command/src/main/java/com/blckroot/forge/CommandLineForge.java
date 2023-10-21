package com.blckroot.forge;

public class CommandLineForge implements CommandLineForgeContract {
    private final CommandLineForgeUtility commandLineForgeUtility;

    public CommandLineForge(ForgedCommand forgedCommand) {
        this.commandLineForgeUtility = new CommandLineForgeUtility(forgedCommand);
    }

    @Override
    public Integer execute(String[] arguments) {
        return commandLineForgeUtility.execute(arguments);
    }
}
