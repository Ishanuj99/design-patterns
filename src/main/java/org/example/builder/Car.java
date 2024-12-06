package org.example.builder;

public class Car {
    Engine engine;
    int brakes;
    boolean musicSystem; //optional
    boolean sunroof; //optional
    private Car(CarBuilder carBuilder){
        this.engine = carBuilder.engine;
        this.brakes = carBuilder.brakes;
        this.sunroof = carBuilder.sunroof;
        this.musicSystem = carBuilder.musicSystem;
    } //private constructor to enforce use of carBuilder to build Car object

    //static inner class
    static class CarBuilder{
        Engine engine;
        int brakes;
        boolean musicSystem = false; //optional
        boolean sunroof = false; //optional
        public CarBuilder(Engine engine, int brakes){
            this.engine = engine;
            this.brakes = brakes;
        }
        CarBuilder musicSystem(boolean musicSystem){
            this.musicSystem = musicSystem;
            return this;
        }
        CarBuilder sunroof(boolean sunroof){
            this.sunroof = sunroof;
            return this;
        }
        Car build(){
            return new Car(this);
        }
    }
    public String toString(){
        return "Car has: "+
                engine.toString()+" engine, " +
                brakes+" brakes, " +
                sunroof+" sunroof, " +
                musicSystem+" musicSystem";
    }
}
