package com.thefisola.patterns.behavioral.strategy.model;


import com.thefisola.patterns.behavioral.strategy.route.BusRoute;

public class BusRoadMap extends RoadMap {
    public BusRoadMap() {
        this.setRoute(new BusRoute());
    }
}
