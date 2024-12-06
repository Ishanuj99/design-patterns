package org.example.DependencyInjection.WithDI;

public class Car {
    private Engine engine;
    Car(Engine engine){
        this.engine = engine;
    }
    void start(){
        engine.start();
        System.out.println("car started");
    }
}
