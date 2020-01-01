package com.yichen.thinking.in.java.chapter10.exercise16;

interface Cycle {
    int wheels();
}

interface CycleFactory {
    Cycle getCycle();
}

class Unicycle implements Cycle {
    @Override
    public int wheels() {
        return 1;
    }

    public static CycleFactory factory = () -> new Unicycle();
}

class Bicycle implements Cycle {

    @Override
    public int wheels() {
        return 2;
    }

    public static CycleFactory factory = () -> new Bicycle();
}

class Tricycle implements Cycle {

    @Override
    public int wheels() {
        return 3;
    }

    public static CycleFactory factory = () -> new Tricycle();
}

public class Ch10ex16 {
    public static void main(String[] args) {
        ride(Unicycle.factory);
        ride(Bicycle.factory);
        ride(Tricycle.factory);
    }

    private static void ride(CycleFactory factory) {
        System.out.println("Nums of wheels:" + factory.getCycle().wheels());
    }
}
