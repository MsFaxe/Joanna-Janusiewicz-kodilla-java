package com.kodilla.testing.forum.statistics;

import org.junit.*;
import java.util.*;
import java.lang.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateAdvStatisticsTestSuite {

    private static int testNumber = 0;
    @Before
    public void startTest() {
        testNumber++;
        System.out.println("\nstart test: " + testNumber);
    }

    @Test
    public void testZeroPosts() {
        System.out.println("testZeroPosts");

        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics cal = new CalculateStatistics();
        ArrayList<String> usersList = new ArrayList<>();
        usersList.add("user1");
        usersList.add("user2");
        usersList.add("user3");

        int postsCount = 0;
        int commentsCount = 6;

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        cal.calculateAdvStatistics(statisticsMock);
        System.out.println(cal.showStatistics());

        Assert.assertEquals(0, cal.getPostsCount());
        Assert.assertEquals(0, cal.getCommentsCount());
    }

    @Test
    public void testThousandPosts() {
        System.out.println("testThousandPosts");

        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics cal = new CalculateStatistics();
        ArrayList<String> usersList = new ArrayList<>();
        usersList.add("user1");
        usersList.add("user2");
        usersList.add("user3");

        int postsCount = 1000;
        int commentsCount = 6;

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        cal.calculateAdvStatistics(statisticsMock);
        System.out.println(cal.showStatistics());

        Assert.assertTrue(cal.getPostsPerUser()>0);
    }

    @Test
    public void testZeroComments() {
        System.out.println("testZeroComments");

        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics cal = new CalculateStatistics();
        ArrayList<String> usersList = new ArrayList<>();
        usersList.add("user1");
        usersList.add("user2");
        usersList.add("user3");

        int postsCount = 20;
        int commentsCount = 0;

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        cal.calculateAdvStatistics(statisticsMock);
        System.out.println(cal.showStatistics());

        Assert.assertEquals(0, cal.getCommentsCount());
        Assert.assertTrue(cal.getCommenstPerPost()==0);
        Assert.assertTrue(cal.getCommentsPerUser()==0);
    }

    @Test
    public void testMorePostsThanComments() {
        System.out.println("testMorePostsThanComments");

        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics cal = new CalculateStatistics();
        ArrayList<String> usersList = new ArrayList<>();
        usersList.add("user1");
        usersList.add("user2");
        usersList.add("user3");

        int postsCount = 10;
        int commentsCount = 6;

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        cal.calculateAdvStatistics(statisticsMock);
        System.out.println(cal.showStatistics());

        Assert.assertTrue(cal.getPostsCount()> cal. getCommentsCount());
        Assert.assertTrue(cal.getCommenstPerPost()<1);
    }

    @Test
    public void testMoreCommentsThanPosts() {
        System.out.println("testMoreCommentsThanPosts");

        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics cal = new CalculateStatistics();
        ArrayList<String> usersList = new ArrayList<>();
        usersList.add("user1");
        usersList.add("user2");
        usersList.add("user3");

        int postsCount = 3;
        int commentsCount = 17;

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        cal.calculateAdvStatistics(statisticsMock);
        System.out.println(cal.showStatistics());

        Assert.assertTrue(cal.getPostsCount()< cal. getCommentsCount());
        Assert.assertTrue(cal.getCommenstPerPost()>1);    }

    @Test
    public void testZeroUsers() {
        System.out.println("testZeroUsers");

        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics cal = new CalculateStatistics();
        ArrayList<String> usersList = new ArrayList<>();

        int postsCount = 20;
        int commentsCount = 61;

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        cal.calculateAdvStatistics(statisticsMock);
        System.out.println(cal.showStatistics());

        Assert.assertEquals(0, cal.getUsersCount());
        Assert.assertEquals(0, cal.getPostsCount());
        Assert.assertEquals(0, cal.getCommentsCount());
    }

    @Test
    public void testThousandUsers() {
        System.out.println("testThousandUsers");

        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics cal = new CalculateStatistics();
        ArrayList<String> usersList = new ArrayList<>();
        for (int i = 0; i<100 ; i++){
            usersList.add("user" + i);
        }
        int postsCount = 500;
        int commentsCount = 1265;

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        cal.calculateAdvStatistics(statisticsMock);
        System.out.println(cal.showStatistics());

        Assert.assertEquals(100, cal.getUsersCount());
    }
}

