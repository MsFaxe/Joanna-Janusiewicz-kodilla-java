package com.kodilla.testing.shape;

import com.sun.jmx.snmp.SnmpUnknownAccContrModelException;

public class Circle implements Shape{
    private double radius;

    private String name;
    private double field;

    public Circle(double radius) {
        this.radius = radius;
        getShapeName();
        getField();
    }


    @Override
    public String getShapeName() {
        name = "circle";
        return name;
    }

    @Override
    public double getField() {
        field = Math.pow(radius, 2)*Math.PI;
        return field;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "name='" + name + '\'' +
                ", field=" + field +
                '}';
    }
}
