package org.example.builder;

public class Engine {
    String type;
    Engine(String type){
        this.type = type;
    }
    void hasEngine(){
        System.out.println("This car has a"+ type+" engine");
    }
    @Override
    public String toString(){
        return type.toString();
    }
}
