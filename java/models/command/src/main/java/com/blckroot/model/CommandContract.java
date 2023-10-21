package com.blckroot.model;

import java.util.List;

interface CommandContract {
    String getCommandName();
    String getParentCommandName();
    void setParentCommandName(String parentCommandName);
    String getVersion();
    void setVersion(String version);
    String getSynopsis();
    void setSynopsis(String synopsis);
    String getDescription();
    void setDescription(String description);
    Boolean executesWithoutArguments();
    void executesWithoutArguments(Boolean executesWithoutArguments);
    List<PositionalParameter> getPositionalParameters();
    void addPositionalParameter(PositionalParameter positionalParameter);
    List<Option> getOptions();
    void addOption(Option option);
    List<Command> getSubcommands();
    void addSubcommand(Command subcommand);
    List<String> getArguments();
    void addArgument(String argument);
    Integer call() throws Exception;
}
