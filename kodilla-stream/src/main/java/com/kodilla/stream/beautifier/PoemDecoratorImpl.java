package com.kodilla.stream.beautifier;

public class PoemDecoratorImpl {


    public String beautify(String string ,PoemDecorator poemDecorator) {
        String newString = poemDecorator.beautify(string);
        System.out.println(newString);
        return newString;
    }
}
