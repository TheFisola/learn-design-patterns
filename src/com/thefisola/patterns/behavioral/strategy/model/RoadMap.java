package com.thefisola.patterns.behavioral.strategy.model;

import com.thefisola.patterns.behavioral.strategy.route.Route;

public class RoadMap {
    Route route;

    public void setRoute(Route route) {
        this.route = route;
    }

    public void displayRoute() {
        this.route.buildRoute();
    }
}
