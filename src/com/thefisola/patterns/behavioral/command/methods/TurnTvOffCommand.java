package com.thefisola.patterns.behavioral.command.methods;

import com.thefisola.patterns.behavioral.command.service.Television;

public class TurnTvOffCommand implements Command {

    private final Television television;

    public TurnTvOffCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.turnOff();
    }

    @Override
    public void undo() {
        television.turnOn();
    }
}
