package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.socialMedia.TwitterPublisher;

public class XGeneration extends User {
    public XGeneration(String user) {
        super(user);
        this.socialPublisher = new TwitterPublisher();
    }
}
