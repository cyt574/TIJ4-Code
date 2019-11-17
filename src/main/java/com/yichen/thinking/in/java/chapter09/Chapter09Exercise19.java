package com.yichen.thinking.in.java.chapter09;

interface Tossing {
    boolean event();
}

interface TossingFactory {
    Tossing getTossing();
}

class CoinTossing implements Tossing {

    private int events;

    private static final int EVENTS = 2;

    @Override
    public boolean event() {
        System.out.println("Coin Tossing Event " + events);
        return ++events != EVENTS;
    }
}

class CoinTossingFactory implements TossingFactory {

    @Override
    public Tossing getTossing() {
        return new CoinTossing();
    }
}

class DiceTossing implements Tossing {

    private int events;

    private static final int EVENTS = 6;

    @Override
    public boolean event() {
        System.out.println("Dice Tossing Event " + events);
        return ++events != EVENTS;
    }
}

class DiceTossingFactory implements TossingFactory {

    @Override
    public Tossing getTossing() {
        return new DiceTossing();
    }
}

public class Chapter09Exercise19 {
    public static void main(String[] args) {
        simulate(new CoinTossingFactory());
        simulate(new DiceTossingFactory());
    }

    private static void simulate(TossingFactory tossingFactory) {
        Tossing tossing = tossingFactory.getTossing();
        while (tossing.event()) {
            ;
        }
    }
}
