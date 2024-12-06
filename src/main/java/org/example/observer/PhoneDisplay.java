package org.example.observer;

public class PhoneDisplay implements Observer{
    private Subject weatherStation;
    PhoneDisplay(Subject weatherStation){
        this.weatherStation = weatherStation;
        weatherStation.addObserver(this);
    }
    @Override
    public void updateTemperature(float temp) {
        System.out.println("From phone display, Temperature in weather station has been updated to: "+ temp+ "degrees");
    }
}
