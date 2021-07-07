package com.thefisola.patterns.structural.proxy;

import com.thefisola.patterns.structural.proxy.model.StudentProxyInternet;

public class Main {

    public static void main(String[] args) {

        Internet proxyInternet = new StudentProxyInternet();

        // social media sites are banned, so access denied
        proxyInternet.connectTo("twitter.com");

        // news site are not banned so connects fine
        proxyInternet.connectTo("cnn.com");

    }
}
