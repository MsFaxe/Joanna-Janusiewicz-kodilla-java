package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.socialMedia.FacebookPublisher;

public class Millenials extends User {
    public Millenials(String user) {
        super(user);
        this.socialPublisher = new FacebookPublisher();
    }
}
