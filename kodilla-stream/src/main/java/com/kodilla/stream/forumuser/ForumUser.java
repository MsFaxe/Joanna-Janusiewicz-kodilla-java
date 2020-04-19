package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.Objects;

public final class ForumUser {
    private final int identityNumber;
    private final String username;
    private final char gender;
    private final LocalDate dataOfBirth;
    private final int postsCount;

    public ForumUser(int identityNumber, String username, char gender, int y, int m, int d, int postsCount) {
        this.identityNumber = identityNumber;
        this.username = username;
        this.gender = gender;
        this.dataOfBirth = LocalDate.of(y,m,d);
        this.postsCount = postsCount;
    }

    public int getIdentityNumber() {
        return identityNumber;
    }

    public String getUsername() {
        return username;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getDataOfBirth() {
        return dataOfBirth;
    }

    public int getPostsCount() {
        return postsCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForumUser forumUser = (ForumUser) o;
        return identityNumber == forumUser.identityNumber &&
                gender == forumUser.gender &&
                postsCount == forumUser.postsCount &&
                username.equals(forumUser.username) &&
                dataOfBirth.equals(forumUser.dataOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identityNumber, username, gender, dataOfBirth, postsCount);
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "identityNumber=" + identityNumber +
                ", username='" + username + '\'' +
                ", gender=" + gender +
                ", dataOfBirth=" + dataOfBirth +
                ", postsCount=" + postsCount +
                '}';
    }
}
