package com.thefisola.patterns.behavioral.command.methods;

import com.thefisola.patterns.behavioral.command.service.Television;

public class IncreaseTvVolumeCommand implements Command {

    private final Television television;

    public IncreaseTvVolumeCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.increaseVolume();
    }

    @Override
    public void undo() {
        television.decreaseVolume();
    }
}
