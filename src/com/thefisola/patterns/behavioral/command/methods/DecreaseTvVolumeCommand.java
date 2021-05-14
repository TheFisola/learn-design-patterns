package com.thefisola.patterns.behavioral.command.methods;

import com.thefisola.patterns.behavioral.command.service.Television;

public class DecreaseTvVolumeCommand implements Command {

    private final Television television;

    public DecreaseTvVolumeCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.decreaseVolume();
    }

    @Override
    public void undo() {
        television.increaseVolume();
    }
}
