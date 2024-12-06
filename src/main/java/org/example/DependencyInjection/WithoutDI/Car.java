package org.example.DependencyInjection.WithoutDI;

public class Car {
    private Engine engine;
    Car(){
        this.engine = new Engine();
    }
    void start(){
        engine.start();
        System.out.println("Car started");
    }
}
