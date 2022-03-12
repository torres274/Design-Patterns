package com.example.design.pattern.factory;

public class PolygonFactory {
    public Polygon getPolygon(String type) {
        switch (type) {
            case "Triangle":
                return new Triangle();
            case "Square":
                return new Square();
            default:
                return null;
        }
    }
}
