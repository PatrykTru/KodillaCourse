package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemDecoratorImpl;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.person.People;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
//        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
//        PoemDecoratorImpl poemDecorator = new PoemDecoratorImpl();
//        String abc = "ABC";
//
//        expressionExecutor.executeExpression(10,5,(a,b) -> a + b);
//        expressionExecutor.executeExpression(10,5,(a,b) -> a - b);
//        expressionExecutor.executeExpression(10,5,(a,b) -> a * b);
//        expressionExecutor.executeExpression(10,5,(a,b) -> a / b);
//
//        poemDecorator.beautify("poem1", string   -> string +"ABC");
//        poemDecorator.beautify("poem1", string   -> "DEF" + string +"ABC");
//        poemDecorator.beautify("pOEm1", string   -> string.toLowerCase());
//        poemDecorator.beautify("poem1", string   -> string.replaceFirst("A", "Z"));
//        poemDecorator.beautify("poem1", string   -> string.toUpperCase() +"ABC");
//        poemDecorator.beautify("poem1", string   -> string.substring(3));
//
//        System.out.println("Using Stream to generate even numbers from 1 to 20");
//        NumbersGenerator.generateEven(20);
//
//        People.getList().stream()
//                .map(String::toUpperCase)
//                .filter(s -> s.length() > 11)
//                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
//                .filter(s -> s.substring(0, 1).equals("M"))
//                .forEach(System.out::println);

//
//        BookDirectory theBookDirectory = new BookDirectory();
//        List<Book> theResultListOfBooks = theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .collect(Collectors.toList());
//
//        System.out.println("# elements: " + theResultListOfBooks.size());
//        theResultListOfBooks.stream()
//                .forEach(System.out::println);

//        BookDirectory theBookDirectory = new BookDirectory();
//
//        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .collect(Collectors.toMap(Book::getSignature, book -> book));
//
//        System.out.println("# elements: " + theResultMapOfBooks.size());
//        theResultMapOfBooks.entrySet().stream()
//                .map(entry -> entry.getKey() + ": " + entry.getValue())
//                .forEach(System.out::println);
/*
        BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));

        System.out.println(theResultStringOfBooks);*/

        Forum forum = new Forum();
       forum.getUsersList().stream()
                .filter(forumUser -> (2022 - forumUser.getBirthDate().getYear()) >20 )
                .filter(forumUser -> forumUser.getPostCount()>1)
               .filter(forumUser -> forumUser.getSex()=='M')
                .collect(Collectors.toMap(ForumUser::getId , forumUser -> forumUser))
                .forEach((integer, forumUser) -> {
                    System.out.println(forumUser.toString());
                });

    }
}
