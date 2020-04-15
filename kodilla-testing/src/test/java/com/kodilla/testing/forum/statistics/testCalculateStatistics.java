package com.kodilla.testing.forum.statistics;

import org.junit.*;
import java.util.*;
import java.lang.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class testCalculateStatistics {
    CalculateStatistics cal = new CalculateStatistics();
    Statistics statisticsMock = mock(Statistics.class);

    ArrayList<String> usersList = new ArrayList<>();
    int postsCount;
    int commentsCount;

    public void whenThen() {
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        cal.calculateAdvStatistics(statisticsMock);
        System.out.println(cal.showStatistics());

        CalculateStatistics calculateStatistics = new CalculateStatistics();
        calculateStatistics.calculateAdvStatistics(statisticsMock);
    }

    int testNumber = 0;

    @Before
    public void startTest() {
        System.out.println("start test: " + testNumber++);
    }

    @Test
    public void testZeroPosts() {
        usersList.add("user1");
        usersList.add("user2");
        usersList.add("user3");

        postsCount = 0;
        commentsCount = 6;

        whenThen();
    }

    @Test
    public void testThousandPosts() {
        usersList.add("user1");
        usersList.add("user2");
        usersList.add("user3");

        postsCount = 1000;
        commentsCount = 6;

        whenThen();
    }

    @Test
    public void testZeroComments() {
        usersList.add("user1");
        usersList.add("user2");
        usersList.add("user3");

        postsCount = 260;
        commentsCount = 0;

        whenThen();
    }

    @Test
    public void testMorePostsThanComments() {
        usersList.add("user1");
        usersList.add("user2");
        usersList.add("user3");

        postsCount = 100;
        commentsCount = 16;

        whenThen();
    }

    @Test
    public void testMoreCommentsThanPosts() {
        usersList.add("user1");
        usersList.add("user2");
        usersList.add("user3");

        postsCount = 10;
        commentsCount = 56;

        whenThen();
    }

    @Test
    public void testZeroUsers() {

        postsCount = 20;
        commentsCount = 65;

        whenThen();
    }

    @Test
    public void testThousandUsers() {
        for (int i = 0; i<100 ; i++){
            usersList.add("user" + i);
        }

        postsCount = 500;
        commentsCount = 1265;

        whenThen();
    }

}

