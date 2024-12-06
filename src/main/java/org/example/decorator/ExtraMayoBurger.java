package org.example.decorator;

public class ExtraMayoBurger extends AddOnDecorator {
    private final int extraCost = 20;

    ExtraMayoBurger(Burger burger) {
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
