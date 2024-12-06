package org.example.strategy;

public class SportsVehicle extends Vehicle{
    SportsVehicle(){
        super(new SpecialDriveStrategy());
    }
}
