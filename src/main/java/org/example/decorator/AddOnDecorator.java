package org.example.decorator;

public abstract class AddOnDecorator extends Burger {
    protected Burger decoratedburger;

    AddOnDecorator(Burger burger) {
        this.decoratedburger = burger;
    }
}
