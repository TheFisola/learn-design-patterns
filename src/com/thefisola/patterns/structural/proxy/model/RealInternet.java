package com.thefisola.patterns.structural.proxy.model;

import com.thefisola.patterns.structural.proxy.Internet;

public class RealInternet implements Internet {
    @Override
    public void connectTo(String url) {
        System.out.println("Internet connecting to....." + url);
    }
}
