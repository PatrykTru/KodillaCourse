package com.kodilla.stream.immutable;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public final class ForumUser {
    private final String username;
    private final String realName;
}
