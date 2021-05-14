package com.thefisola.patterns.behavioral.command.service;

public class Television implements ElectronicDevice {

    int tvVolume = 0;

    @Override
    public void turnOn() {
        System.out.println("Turns On Television");
    }

    @Override
    public void turnOff() {
        System.out.println("Turns off Television");
    }

    @Override
    public void increaseVolume() {
        tvVolume++;
        System.out.println("Increase Television Volume: " + tvVolume);
    }

    @Override
    public void decreaseVolume() {
        tvVolume--;
        System.out.println("Decrease Television Volume: " + tvVolume);
    }
}
