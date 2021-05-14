package com.thefisola.patterns.behavioral.command;

import com.thefisola.patterns.behavioral.command.methods.*;
import com.thefisola.patterns.behavioral.command.runner.RemoteControl;
import com.thefisola.patterns.behavioral.command.service.Television;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        Television television = new Television();

        // Should turn tv on
        TurnTvOnCommand turnTvOnCommand = new TurnTvOnCommand(television);
        RemoteControl remoteControl = new RemoteControl(turnTvOnCommand);
        remoteControl.press();

        //Should undo
        remoteControl.undoPress();

        // Should turn tv off
        TurnTvOffCommand turnTvOffCommand = new TurnTvOffCommand(television);
        remoteControl = new RemoteControl(turnTvOffCommand);
        remoteControl.press();

        //Should undo
        remoteControl.undoPress();

        // Should increase tv volume to 4
        IncreaseTvVolumeCommand increaseTvVolumeCommand = new IncreaseTvVolumeCommand(television);
        remoteControl = new RemoteControl(increaseTvVolumeCommand);
        remoteControl.press();
        remoteControl.press();
        remoteControl.press();
        remoteControl.press();

        //Should undo once ((3))
        remoteControl.undoPress();

        // Should reduce volume to ((2))
        DecreaseTvVolumeCommand decreaseTvVolumeCommand = new DecreaseTvVolumeCommand(television);
        remoteControl = new RemoteControl(decreaseTvVolumeCommand);
        remoteControl.press();


        //test multiple commands(turn on > increase > increase > increase > turn off)
        LinkedList<Command> commands = new LinkedList<>();
        commands.add(turnTvOnCommand);
        commands.add(increaseTvVolumeCommand);
        commands.add(increaseTvVolumeCommand);
        commands.add(increaseTvVolumeCommand);
        commands.add(turnTvOffCommand);

        remoteControl = new RemoteControl(commands);

        remoteControl.pressAll();

    }
}
