package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.socialMedia.SnapchatPublisher;

public class ZGeneration extends User {
    public ZGeneration(String user) {
        super(user);
        this.socialPublisher = new SnapchatPublisher();
    }
}
