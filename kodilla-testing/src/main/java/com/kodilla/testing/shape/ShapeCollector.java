package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private ArrayList<Shape> allFigures = new ArrayList<>();

    //getter
    public ArrayList<Shape> getAllFigures() {
        return allFigures;
    }

    public void addFigure(Shape shape){
        allFigures.add(shape);
    }

    public boolean removeFigure(Shape shape){
        boolean result = false;

        if (allFigures.contains(shape)){
            allFigures.remove(shape);
            result = true;
        }

        return result;
    }

    public Shape getFigure(int n){
        return allFigures.get(n);
    }

    public String showFigures(){
        return allFigures.toString();
    }
}
