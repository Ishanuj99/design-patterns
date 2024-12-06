package org.example.decorator;

public class ExtraCheeseBurger extends AddOnDecorator {
    private final int extraCost = 10;

    ExtraCheeseBurger(Burger burger) {
        super(burger);
    }

    @Override
    void description() {
        System.out.print(decoratedburger.getDescription());
        System.out.println(" with extra cheese");
    }

    @Override
    int cost() {
        return decoratedburger.getCost() + extraCost;
    }
}
