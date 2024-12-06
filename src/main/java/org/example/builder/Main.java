package org.example.builder;

public class Main {
    public static void main(String args[]){
        Engine engine = new Engine("V8");
        Car Bugati = new Car.CarBuilder(engine, 4).musicSystem(true).sunroof(true).build();
        System.out.println(Bugati.toString());
    }
}
