package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testExecuteTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task drivingTask = taskFactory.makeTask(TaskFactory.DRIVING_TASK);
        System.out.println(drivingTask.executeTask());
        //Then
        Assert.assertEquals( "Holiday, Destination: Bahama, transport: boat", drivingTask.executeTask());
    }

    @Test
    public void testGetTaskName() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task paintingTask = taskFactory.makeTask(TaskFactory.PAINTING_TASK);
        System.out.println("Task to do: " + paintingTask.getTaskName());
        //Then
        Assert.assertEquals( "Paint the walls", paintingTask.getTaskName());

    }

    @Test
    public void testIsTaskExecuted() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shoppingTask = taskFactory.makeTask(TaskFactory.SHOPPING_TASK);
        System.out.println("Task executed: " + shoppingTask.isTaskExecuted());
        //Then
        Assert.assertEquals( true, shoppingTask.isTaskExecuted());
    }

}
