package com.command.handlers;

import com.command.Command;

public abstract class BaseHandler implements Handler {
    private Handler next;
    public Handler setNextHandler(Handler next) {
        this.next = next;
        return next;
    }
    protected boolean handleNext(Command command) {
        return next == null || next.handle(command);
    }
    @Override
    public abstract boolean handle(Command command);
}
