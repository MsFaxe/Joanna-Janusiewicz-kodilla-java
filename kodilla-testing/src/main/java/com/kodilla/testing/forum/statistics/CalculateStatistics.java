package com.kodilla.testing.forum.statistics;

public class CalculateStatistics {
    int usersCount;
    int postsCount;
    int commentsCount;
    double postsPerUser;
    double commentsPerUser;
    double commenstPerPost;

    public int getUsersCount() {
        return usersCount;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public double getPostsPerUser() {
        return postsPerUser;
    }

    public double getCommentsPerUser() {
        return commentsPerUser;
    }

    public double getCommenstPerPost() {
        return commenstPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics){
        this.usersCount = statistics.usersNames().size();
        this.postsCount = statistics.postsCount();
        if (postsCount != 0 && usersCount!= 0) {
            this.commentsCount = statistics.commentsCount();
            this.postsPerUser = Double.valueOf(postsCount)/Double.valueOf(usersCount);
            this.commentsPerUser = Double.valueOf(commentsCount)/Double.valueOf(usersCount);
            this.commenstPerPost = Double.valueOf(commentsCount)/Double.valueOf(postsCount);
        } else if (postsCount == 0){
            this.commentsCount =  0;
        } else if (usersCount == 0){
            this.postsCount = 0;
            this.commentsCount =  0;
        }
    }


    public String showStatistics() {
        if (usersCount  == 0){
            return "No registered users on the forum.";

        } else if ( postsCount == 0) {
            return "No posts here." + "\nCalculateStatistics{" + "userCount=" + usersCount +" }\n";
        }else{
            return "CalculateStatistics{" +
                    "userCount=" + usersCount +
                    ", postsCount=" + postsCount +
                    ", commentsCount=" + commentsCount +
                    ", postsPerUser=" + postsPerUser +
                    ", commentsPerUser=" + commentsPerUser +
                    ", commenstPerPost=" + commenstPerPost +
                    "}";
        }
    }
}
