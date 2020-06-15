package com.kodilla.patterns.strategy.social;

public class User {
    final private String User;
    protected SocialPublisher socialPublisher;

    public User(final String user) {
        User = user;
    }

    public String getUser() {
        return User;
    }

    public String sharePost() {
        return socialPublisher.share();
    }

    public void setSocialPublisher(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }
}
