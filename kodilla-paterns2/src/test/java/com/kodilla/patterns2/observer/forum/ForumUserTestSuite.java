package com.kodilla.patterns2.observer.forum;

import org.junit.Test;

import static org.junit.Assert.*;

public class ForumUserTestSuite {
    @Test
    public void testUpdate() {
        //Given
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();
        ForumUser johnSmith = new ForumUser("John Smith");
        ForumUser markLizardberg = new ForumUser("Mark Lizardberg");
        ForumUser user3 = new ForumUser("user 3");
        javaHelpForum.registerObserver(johnSmith);
        javaHelpForum.registerObserver(markLizardberg);
        javaToolsForum.registerObserver(markLizardberg);
        javaToolsForum.registerObserver(user3);
        //When
        javaHelpForum.addPost("post 1");
        javaToolsForum.addPost("post 2");
        javaHelpForum.addPost("post 3");
        javaToolsForum.addPost("post 4");
        javaHelpForum.addPost("post 5");
        //Then
        assertEquals(3, johnSmith.getUpdateCount());
        assertEquals(5, markLizardberg.getUpdateCount());
        assertEquals(2, user3.getUpdateCount());
    }
}