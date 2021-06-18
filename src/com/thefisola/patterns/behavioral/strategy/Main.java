package com.thefisola.patterns.behavioral.strategy;

import com.thefisola.patterns.behavioral.strategy.model.*;

public class Main {

    public static void main(String[] args) {

        // Displays car route
        RoadMap roadMap = new CarRoadMap();
        roadMap.displayRoute();

        // Displays bus route
        roadMap = new BusRoadMap();
        roadMap.displayRoute();

        // Displays train route
        roadMap = new TrainRoadMap();
        roadMap.displayRoute();

        // Displays bike route
        roadMap = new BikeRoadMap();
        roadMap.displayRoute();

        // This way a new route algorithm can be added easily
    }
}
