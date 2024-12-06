package org.example.decorator;

public class AlooTikkiBurger extends Burger {
    public AlooTikkiBurger() {
        cost = 200;
        description = "This is a Aloo Tikki burger";
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
