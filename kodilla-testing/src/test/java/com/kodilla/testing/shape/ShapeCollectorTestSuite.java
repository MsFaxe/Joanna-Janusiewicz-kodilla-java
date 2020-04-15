package com.kodilla.testing.shape;

import org.junit.*;
import java.lang.*;
import java.util.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @After
    public void afterEveryTest() {
        System.out.println("Test finished.");
    }

    @Test
    public void testAddFigure(){
        ShapeCollector shape1 = new ShapeCollector();
        shape1.addFigure(new Circle(4));

        ArrayList<Shape> test = shape1.getAllFigures();

        Assert.assertEquals(1, test.size() );
    }

    @Test
    public void testRemoveFigure() {
        ShapeCollector shape2 = new ShapeCollector();
        Triangle t1 = new Triangle(4, 3);
        shape2.addFigure(t1);

        boolean result = shape2.removeFigure(t1);

        Assert.assertTrue(result);
    }

    @Test
    public void testGetFigure(){
        ShapeCollector shape3 = new ShapeCollector();
        Square s1 = new Square(6);
        shape3.addFigure(s1);

        Assert.assertEquals(s1, shape3.getFigure(0));
    }

    @Test
    public void testShowFigures(){
        ShapeCollector shape3 = new ShapeCollector();
        Square square = new Square(6);
        shape3.addFigure(square);

        String show = "["+ square.toString() + "]";

        Assert.assertEquals(show, shape3.showFigures());
    }
}
