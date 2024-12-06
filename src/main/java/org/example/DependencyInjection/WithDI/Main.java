package org.example.DependencyInjection.WithDI;

public class Main {
    public static void main(String[] args){
        Engine V8 = new Engine();
        Car Porche = new Car(V8);
        Porche.start();
    }
}
