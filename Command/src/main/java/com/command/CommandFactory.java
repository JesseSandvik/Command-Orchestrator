package com.command;

import com.command.handlers.CommandExecutesHandler;
import com.command.handlers.CommandExistsHandler;
import com.command.handlers.Handler;

import java.util.ArrayList;
import java.util.List;

public class CommandFactory {
    private final List<Command> commands;

    public CommandFactory() {
        this.commands = new ArrayList<>();
    }
    public List<Command> getCommands() {
        return commands;
    }
    public void addcommand(Command command) throws InvalidCommandException {
        Handler handler = new CommandExistsHandler(command)
                .setNextHandler(new CommandExecutesHandler(command));

        if (handler.handle(command)) {
            this.commands.add(command);
        } else {
            throw new InvalidCommandException("An invalid command has been provided.");
        }
    }
}
