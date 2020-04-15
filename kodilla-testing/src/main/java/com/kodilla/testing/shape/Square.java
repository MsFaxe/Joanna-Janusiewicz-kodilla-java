package com.kodilla.testing.shape;

public class Square implements Shape {
    private double side;

    private String name;
    private double field;

    public Square(double side) {
        this.side = side;
        getShapeName();
        getField();
    }

    @Override
    public String getShapeName() {
        name = "square";
        return name;
    }

    @Override
    public double getField() {
        field = Math.pow(side, 2);
        return field;
    }

    @Override
    public String toString() {
        return "Square{" +
                "name='" + name + '\'' +
                ", field=" + field +
                '}';
    }
}
