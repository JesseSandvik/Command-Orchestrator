package com.command.handlers;

import com.command.Command;

public class CommandExecutesHandler extends BaseHandler {
    private final Command command;

    public CommandExecutesHandler(Command command) {
        this.command = command;
    }
    @Override
    public boolean handle(Command command) {
        return command.executes() && handleNext(command);
    }
}
