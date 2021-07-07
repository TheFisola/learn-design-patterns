package com.thefisola.patterns.structural.proxy.model;

import com.thefisola.patterns.structural.proxy.Internet;

import java.util.ArrayList;
import java.util.List;

public class StudentProxyInternet implements Internet {

    private static final List<String> bannedSites = new ArrayList<>();

    static {
        bannedSites.add("twitter.com");
        bannedSites.add("facebook.com");
    }

    @Override
    public void connectTo(String url) {
        if (bannedSites.contains(url)) {
            System.out.println("This site has been banned. Access denied: " + url);
            return;
        }
        RealInternet realInternet = new RealInternet();
        realInternet.connectTo(url);
    }
}
