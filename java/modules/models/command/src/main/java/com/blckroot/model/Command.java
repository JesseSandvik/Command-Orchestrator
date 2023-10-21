package com.blckroot.model;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class Command implements CommandContract, Callable<Integer> {
    private final String commandName;
    private String parentCommandName;
    private String version;
    private String synopsis;
    private String description;
    private Boolean executesWithoutArguments = false;
    private final List<PositionalParameter> positionalParameters = new ArrayList<>();
    private final List<Option> options = new ArrayList<>();
    private final List<Command> subcommands = new ArrayList<>();
    private final List<String> arguments = new ArrayList<>();

    public Command(String commandName) {
        this.commandName = commandName;
    }

    @Override
    public String getCommandName() {
        return commandName;
    }

    @Override
    public String getParentCommandName() {
        return parentCommandName;
    }

    @Override
    public void setParentCommandName(String parentCommandName) {
        this.parentCommandName = parentCommandName;
    }

    @Override
    public String getVersion() {
        return version;
    }

    @Override
    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String getSynopsis() {
        return synopsis;
    }

    @Override
    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public Boolean executesWithoutArguments() {
        return executesWithoutArguments;
    }

    @Override
    public void executesWithoutArguments(Boolean executesWithoutArguments) {
        this.executesWithoutArguments = executesWithoutArguments;
    }

    @Override
    public List<PositionalParameter> getPositionalParameters() {
        return positionalParameters;
    }

    @Override
    public void addPositionalParameter(PositionalParameter positionalParameter) {
        this.positionalParameters.add(positionalParameter);
    }

    @Override
    public List<Option> getOptions() {
        return options;
    }

    @Override
    public void addOption(Option option) {
        this.options.add(option);
    }

    @Override
    public List<Command> getSubcommands() {
        return subcommands;
    }

    @Override
    public void addSubcommand(Command subcommand) {
        if (subcommand != null) {
            subcommand.setParentCommandName(commandName);
        }
        this.subcommands.add(subcommand);
    }

    @Override
    public List<String> getArguments() {
        return arguments;
    }

    @Override
    public void addArgument(String argument) {
        this.arguments.add(argument);
    }

    @Override
    public Integer call() {
        return 0;
    }
}
