package com.kodilla.testing.user;

import com.sun.javafx.collections.NonIterableChange;

public class SimpleUser {
    private String username;
    public SimpleUser(String username){
        this.username = username;
    }

    public String getUsername(){
        return username;
    }
}
