package org.example.factory;

public class Main {
    public static void main(String[] args){
        Shape shape = new ShapeFactory().getShape("CIRCLE");
        shape.draw();
    }
}
