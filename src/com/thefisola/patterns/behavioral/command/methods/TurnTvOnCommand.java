package com.thefisola.patterns.behavioral.command.methods;

import com.thefisola.patterns.behavioral.command.service.Television;

public class TurnTvOnCommand implements Command {

    private final Television television;

    public TurnTvOnCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.turnOn();
    }

    @Override
    public void undo() {
        television.turnOff();
    }
}
