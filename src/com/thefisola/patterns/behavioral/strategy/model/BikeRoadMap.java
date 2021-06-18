package com.thefisola.patterns.behavioral.strategy.model;


import com.thefisola.patterns.behavioral.strategy.route.BikeRoute;

public class BikeRoadMap extends RoadMap {
    public BikeRoadMap() {
        this.setRoute(new BikeRoute());
    }
}
