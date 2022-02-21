package com.kodilla.stream.forumuser;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
@ToString
public class ForumUser {

    private final int id, postCount;
    private final String userName;
    private final char sex;
    private final LocalDate birthDate;

}
