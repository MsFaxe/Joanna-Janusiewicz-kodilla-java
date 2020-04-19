package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class Forum {
    private final List<ForumUser> usersList = new ArrayList<>();

    public Forum() {
        Random randomGenerator = new Random ();
        char gender;
        
        for (int i = 1; i<20; i++) {
            int randomGender = randomGenerator.nextInt(2);

            if (randomGender == 0){gender = 'M';}
            else {gender = 'F';}

            usersList.add(new ForumUser(000+i ,
                    "user"+i ,
                    gender ,
                    randomGenerator.nextInt(85)+1920 ,
                    randomGenerator.nextInt(11)+1 ,
                    randomGenerator.nextInt(28)+1 ,
                    randomGenerator.nextInt(50)));
        }
    }

    public List<ForumUser> getUsersList() {
        return usersList;
    }
}
