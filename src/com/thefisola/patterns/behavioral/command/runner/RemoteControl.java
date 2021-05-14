package com.thefisola.patterns.behavioral.command.runner;

import com.thefisola.patterns.behavioral.command.methods.Command;

import java.util.List;

public class RemoteControl {

    private Command command;
    private List<Command> commands;

    public RemoteControl(Command command) {
        this.command = command;
    }

    public RemoteControl(List<Command> commands) {
        this.commands = commands;
    }

    public void press() {
        command.execute();
    }

    public void pressAll() {
        for (Command c : commands) {
            c.execute();
        }
    }

    public void undoPress() {
        command.undo();
    }
}
