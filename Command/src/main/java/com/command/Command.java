package com.command;

public interface Command {
    boolean exists();
    boolean executes();
    void execute(String[] args);
}
