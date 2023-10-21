package com.blckroot.forge;

import picocli.CommandLine;
import picocli.CommandLine.Model.*;

class CommandLineBuilder implements CommandLineBuilderContract {
    private final ForgedCommand forgedCommand;
    private final CommandSpec commandSpec;

    CommandLineBuilder(ForgedCommand forgedCommand) {
        this.forgedCommand = forgedCommand;
        this.commandSpec = CommandSpec.create().name(forgedCommand.getCommandName());
    }

    @Override
    public CommandLineBuilder addStandardUsageHelpOption() {
        commandSpec.addOption(OptionSpec
                .builder("--help", "-h")
                .usageHelp(true)
                .build());
        return this;
    }

    @Override
    public CommandLineBuilder addStandardVersionHelpOption() {
        commandSpec.addOption(OptionSpec
                .builder("--version", "-v")
                .versionHelp(true)
                .build());
        return this;
    }

    @Override
    public CommandLine build() {
        addStandardUsageHelpOption();

        if (forgedCommand.getVersion() != null) {
            commandSpec.version(forgedCommand.getVersion());
            addStandardVersionHelpOption();
        }

        return new CommandLine(commandSpec);
    }
}
