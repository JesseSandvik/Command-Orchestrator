package com.command.handlers;

import com.command.Command;

public class CommandExistsHandler extends BaseHandler {
    private final Command command;
    public CommandExistsHandler(Command command) {
        this.command = command;
    }
    @Override
    public boolean handle(Command command) {
        return command.exists() && handleNext(command);
    }
}
