package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private double side;
    private double height;

    private String name;
    private double field;

    public Triangle(double side, double height) {
        this.side = side;
        this.height = height;

        getShapeName();
        getField();
    }

    @Override
    public String getShapeName() {
        name = "triangle";
        return name;
    }

    @Override
    public double getField() {
        field = (side*height)/2;
        return field;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "name='" + name + '\'' +
                ", field=" + field +
                '}';
    }
}
