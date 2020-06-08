package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;

public class BoardTestSuite {
    @Test
    public void testTaskAddToDoList() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        board.getToDoList().getTasks().add("task to do");
        //When
        String tasks = board.getToDoList().toString();
        //Then
        System.out.println(tasks);
        Assert.assertEquals("[task to do]", tasks);
    }
    @Test
    public void testTaskAddInProgressList() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        board.getInProgressList().getTasks().add("task in progress");
        //When
        String tasks = board.getInProgressList().toString();
        //Then
        System.out.println(tasks);
        Assert.assertEquals("[task in progress]", tasks);
    }
    @Test
    public void testTaskDoneList() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        board.getDoneList().getTasks().add("task done");
        //When
        String tasks = board.getDoneList().toString();
        //Then
        System.out.println(tasks);
        Assert.assertEquals("[task done]", tasks);
    }
}
