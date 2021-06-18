package com.thefisola.patterns.behavioral.strategy.model;


import com.thefisola.patterns.behavioral.strategy.route.CarRoute;

public class CarRoadMap extends RoadMap {
    public CarRoadMap() {
        this.setRoute(new CarRoute());
    }
}
