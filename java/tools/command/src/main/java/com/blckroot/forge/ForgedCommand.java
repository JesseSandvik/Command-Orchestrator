package com.blckroot.forge;

import com.blckroot.model.Command;


public class ForgedCommand extends Command {
    public ForgedCommand(String commandName) {
        super(commandName);
    }

    @Override
    public Integer call() {
        return 0;
    }
}
