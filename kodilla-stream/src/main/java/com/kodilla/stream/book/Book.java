package com.kodilla.stream.book;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Book {

    private final String author;
    private final String title;
    private final int yearOfPublication;
    private final String signature;


}
