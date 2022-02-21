package com.kodilla.stream.forumuser;

import lombok.Getter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Getter
public class Forum {


    public List<ForumUser> getUsersList() {
        List<ForumUser> forumUsers = new ArrayList<>();
        forumUsers.add(new ForumUser(1,100, "User1" , 'M' ,LocalDate.of(1988,2 , 5)));
        forumUsers.add(new ForumUser(2,200, "User2" , 'K' ,LocalDate.of(1994,2 , 5)));
        forumUsers.add(new ForumUser(3,300, "User3" , 'M' ,LocalDate.of(1972,2 , 5)));
        forumUsers.add(new ForumUser(4,1, "User4" , 'K' ,LocalDate.of(1999,2 , 5)));
        forumUsers.add(new ForumUser(5,10, "User5" , 'M' ,LocalDate.of(2010,2 , 5)));
        forumUsers.add(new ForumUser(6,30, "User6" , 'M' ,LocalDate.of(1988,2 , 5)));
        forumUsers.add(new ForumUser(7,360, "User7" , 'K' ,LocalDate.of(1994,2 , 5)));
        forumUsers.add(new ForumUser(8,15, "User8" , 'M' ,LocalDate.of(2011,2 , 5)));
        forumUsers.add(new ForumUser(9,14, "User9" , 'K' ,LocalDate.of(1988,2 , 5)));


        return forumUsers;

    }
}
