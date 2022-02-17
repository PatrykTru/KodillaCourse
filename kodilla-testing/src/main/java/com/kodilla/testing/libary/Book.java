package com.kodilla.testing.libary;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Book {
    private String title;
    private String author;
    private int publicationYear;
}
