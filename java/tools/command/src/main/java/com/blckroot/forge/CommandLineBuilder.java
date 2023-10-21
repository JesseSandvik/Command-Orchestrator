package com.blckroot.forge;

import picocli.CommandLine;
import picocli.CommandLine.Model.*;

class CommandLineBuilder implements CommandLineBuilderContract {
    private final CommandSpec commandSpec;

    CommandLineBuilder() {
        this.commandSpec = CommandSpec.create();
    }

    @Override
    public CommandLine build() {
        return null;
    }
}
