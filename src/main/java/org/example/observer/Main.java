package org.example.observer;

public class Main {
    public static void main(String args[]){
        WeatherStation weatherStation = new WeatherStation(25);

        Observer carDisplay = new CarDisplay(weatherStation);
        Observer phoneDisplay = new PhoneDisplay(weatherStation);

        weatherStation.setTemperature(35);
        weatherStation.removeObserver(carDisplay);
        weatherStation.setTemperature(40);
    }
}
