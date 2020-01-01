package com.yichen.thinking.in.java.chapter10.exercise17;

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

    static TossingFactory factory = new TossingFactory() {
        @Override
        public Tossing getTossing() {
            return new CoinTossing();
        }
    };
}

class DiceTossing implements Tossing {

    private int events;

    private static final int EVENTS = 6;

    @Override
    public boolean event() {
        System.out.println("Dice Tossing Event " + events);
        return ++events != EVENTS;
    }

    static TossingFactory factory = new TossingFactory() {
        @Override
        public Tossing getTossing() {
            return new DiceTossing();
        }
    };
}

public class Ch10ex17 {
    public static void main(String[] args) {
        simulate(DiceTossing.factory);
        simulate(CoinTossing.factory);
    }

    private static void simulate(TossingFactory factory) {
        Tossing t = factory.getTossing();
        while (t.event()) {
        }
    }
}
