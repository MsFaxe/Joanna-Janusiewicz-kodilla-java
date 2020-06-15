package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.socialMedia.FacebookPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User jack = new XGeneration("Jack Dorsey");
        User lizard = new Millenials("Mark Zuckerberg");
        User kylie = new ZGeneration("Kylie Jenner");

        //When
        String jackPrefers = jack.sharePost();
        System.out.println("Jack Dorsey prefers sharing post on " + jackPrefers);
        String lizardPrefer = lizard.sharePost();
        System.out.println("Mark Zuckerberg prefers sharing post on " + lizardPrefer);
        String kyliePrefers = kylie.sharePost();
        System.out.println("Kylie Jenner prefers sharing post on " + kyliePrefers);

        //Then
        Assert.assertEquals("Twitter", jackPrefers);
        Assert.assertEquals("Facebook", lizardPrefer);
        Assert.assertEquals("Snapchat", kyliePrefers);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User kylie = new ZGeneration("Kylie Jenner");

        //When
        String kyliePrefers = kylie.sharePost();
        System.out.println("Kylie Jenner prefers sharing post on " + kyliePrefers);

        kylie.setSocialPublisher(new FacebookPublisher());
        kyliePrefers = kylie.sharePost();
        System.out.println("Kylie Jenner prefers sharing post on " + kyliePrefers);

        //Then
        Assert.assertEquals("Facebook", kyliePrefers);
    }
}
