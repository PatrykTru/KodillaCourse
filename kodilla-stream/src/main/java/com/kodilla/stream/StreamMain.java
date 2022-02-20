package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemDecoratorImpl;
import com.kodilla.stream.lambda.*;

public class StreamMain {

    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        PoemDecoratorImpl poemDecorator = new PoemDecoratorImpl();
        String abc = "ABC";

        expressionExecutor.executeExpression(10,5,(a,b) -> a + b);
        expressionExecutor.executeExpression(10,5,(a,b) -> a - b);
        expressionExecutor.executeExpression(10,5,(a,b) -> a * b);
        expressionExecutor.executeExpression(10,5,(a,b) -> a / b);

        poemDecorator.beautify("poem1", string   -> string +"ABC");
        poemDecorator.beautify("poem1", string   -> "DEF" + string +"ABC");
        poemDecorator.beautify("pOEm1", string   -> string.toLowerCase());
        poemDecorator.beautify("poem1", string   -> string.replaceFirst("A", "Z"));
        poemDecorator.beautify("poem1", string   -> string.toUpperCase() +"ABC");
        poemDecorator.beautify("poem1", string   -> string.substring(3));
    }
}
