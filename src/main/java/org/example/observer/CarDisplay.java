package org.example.observer;

public class CarDisplay implements Observer{
    private Subject weatherStation;

    CarDisplay(Subject weatherStation){
        this.weatherStation = weatherStation;
        weatherStation.addObserver(this);
    }
    @Override
    public void updateTemperature(float temp) {
        System.out.println("From car display, Temperature in weather station has been updated to: "+ temp+ "degrees");
    }
}
