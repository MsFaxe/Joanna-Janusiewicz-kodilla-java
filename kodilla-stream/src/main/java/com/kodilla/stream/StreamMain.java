package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.time.LocalDate.*;

public class StreamMain {
    public static void main (String[] args) {
        Forum forum = new Forum();
        forum.getUsersList().stream().forEach(System.out::println);

        System.out.println("\nFiltered users: ");
        Map<Integer, ForumUser> mapOfUsers= forum.getUsersList().stream()
                .filter(ForumUser -> ForumUser.getGender() == 'M')
                .filter(ForumUser -> ForumUser.getDataOfBirth().isBefore(LocalDate.of(2000,04,19)))
                .filter(ForumUser -> ForumUser.getPostsCount() != 0)
                .collect(Collectors.toMap(ForumUser::getIdentityNumber, forumUser -> forumUser));

        mapOfUsers.entrySet().stream().map(entry -> entry.getKey() + ": " + entry.getValue()).forEach(System.out::println);
    }
}
