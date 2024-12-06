package org.example.decorator;

public class Main {
    public static void main(String[] args) {
        Burger burger = new ZingerBurger();
        Burger cheeseburger = new ExtraCheeseBurger(burger);
        cheeseburger.description();
        cheeseburger.cost();
    }
}
