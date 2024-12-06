package org.example.decorator;

public class ZingerBurger extends Burger {
    public ZingerBurger() {
        cost = 180;
        description = "This is a Zinger burger";
    }

    @Override
    void description() {
        System.out.println(description);
    }

    @Override
    int cost() {
        return cost;
    }
}
