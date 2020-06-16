package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String DRIVING_TASK = "DrivingTask";
    public static final String PAINTING_TASK = "PaintingTask";
    public static final String SHOPPING_TASK = "ShoppingTask";

    public final Task makeTask(final String taskClass) {
        switch(taskClass) {
            case DRIVING_TASK:
                return new DrivingTask("Holiday", "Bahama", "boat");
            case PAINTING_TASK:
                return new PaintingTask("Paint the walls", "green", "Walls");
            case SHOPPING_TASK:
                return new ShoppingTask("Shopping", "flippers", 2);
            default:
                return null;
        }
    }
}
