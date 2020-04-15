package com.kodilla.testing.forum.statistics;

public class CalculateStatistics {
    int usersCount;
    int postsCount;
    int commentsCount;
    int postsPerUser;
    int commentsPerUser;
    int commenstPerPost;


    public void calculateAdvStatistics(Statistics statistics){
        this.usersCount = statistics.usersNames().size();
        this.postsCount = statistics.postsCount();
        this.commentsCount = statistics.commentsCount();

        this.postsPerUser = postsCount/usersCount;
        this.commentsPerUser = commentsCount/usersCount;
        this.commenstPerPost = commentsCount/postsCount;
    }


    public String showStatistics() {
        return "CalculateStatistics{" +
                "userCount=" + usersCount +
                ", postsCount=" + postsCount +
                ", commentsCount=" + commentsCount +
                ", postsPerUser=" + postsPerUser +
                ", commentsPerUser=" + commentsPerUser +
                ", commenstPerPost=" + commenstPerPost +
                '}';
    }
}
