package com.thefisola.patterns.behavioral.strategy.route;

public class CarRoute implements Route {
    @Override
    public void buildRoute() {
        System.out.println("Returns the ideal route to be taken by a car");
    }
}
