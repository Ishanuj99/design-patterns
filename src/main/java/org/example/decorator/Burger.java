package org.example.decorator;

public abstract class Burger {
    protected int cost;
    protected String description;

    public int getCost() {
        return cost;
    }

    public String getDescription() {
        return description;
    }

    abstract int cost();
    abstract void description();
}
