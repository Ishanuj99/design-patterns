package org.example.factory;

public class ShapeFactory {
    Shape getShape(String shape){
        switch(shape) {
            case "SQAURE":
                return new Square();
            case "CIRCLE":
                return new Circle();
            default:
                return null;
        }
    }
}
