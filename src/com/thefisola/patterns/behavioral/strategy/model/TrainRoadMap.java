package com.thefisola.patterns.behavioral.strategy.model;


import com.thefisola.patterns.behavioral.strategy.route.TrainRoute;

public class TrainRoadMap extends RoadMap {
    public TrainRoadMap() {
        this.setRoute(new TrainRoute());
    }
}
