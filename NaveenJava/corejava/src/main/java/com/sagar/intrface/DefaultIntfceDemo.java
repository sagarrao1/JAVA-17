package com.sagar.intrface;

interface Vehicle {
    // Abstract method (must be implemented by classes)
    void start();

    // Default method (optional to override)
    default void stop() {
        System.out.println("Vehicle is stopping...");
    }
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting...");
    }
}

public class DefaultIntfceDemo {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start(); // Calls overridden method
        myCar.stop();  // Calls default method from interface
    }
}