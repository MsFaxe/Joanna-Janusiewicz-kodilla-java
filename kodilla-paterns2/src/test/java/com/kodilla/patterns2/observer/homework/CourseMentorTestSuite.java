package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class CourseMentorTestSuite {
    @Test
    public void testCourseMentor() {
        //Given
        StudentTasks student1Tasks = new Student1();
        StudentTasks student2Tasks = new Student2();

        CourseMentor mentor1 = new CourseMentor("John Smith");
        CourseMentor mentor2 = new CourseMentor("Jack Sparrow");

        student1Tasks.registerObserver(mentor1);
        student2Tasks.registerObserver(mentor2);
        //When
        student1Tasks.addTask("task 1");
        student1Tasks.addTask("task 2");
        student2Tasks.addTask("task 3");

        //Then
        assertEquals(2, mentor1.getUpdateCount());
        assertEquals(1, mentor2.getUpdateCount());
    }
}