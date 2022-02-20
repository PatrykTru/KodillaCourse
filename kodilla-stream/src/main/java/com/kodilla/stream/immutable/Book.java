package com.kodilla.stream.immutable;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Book {
    private final String title;
    private final String author;
    private final int yearOfPublication;
}
