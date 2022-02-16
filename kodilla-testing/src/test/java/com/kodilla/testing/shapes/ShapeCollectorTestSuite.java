package com.kodilla.testing.shapes;

import com.kodilla.testing.shapes.POJO.Circle;
import com.kodilla.testing.shapes.POJO.Square;
import com.kodilla.testing.shapes.POJO.Triangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("TDD: Shape Collector Test Suite \uD83D\uDE31")
public class ShapeCollectorTestSuite {

    @DisplayName("Testing Shapes")
    @Nested
    class Shapes{

        @Test
        void addFigureTest() {
            //Given
            Circle circle = new Circle();
            ShapeCollector shapeCollector = new ShapeCollector();
            //When
            shapeCollector.addFigure(circle);
            //Then
            Assertions.assertEquals(1,shapeCollector.shapes.size());
        }
        
        @Test
        void removeFigureTest() {
            //Given
            Triangle triangle = new Triangle();
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(triangle);
            //When
            boolean result = shapeCollector.removeFigure(triangle);
            //Then
            Assertions.assertTrue(result);
        }

        @Test
        void getFigureTest() {
            //Given
            Shape square = new Square();
            Shape testSquare;
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(square);
            //When
            testSquare = shapeCollector.getFigure(0);
            //Then
            Assertions.assertEquals(square,testSquare);

        }


        @Test
        void showFiguresTest() {
            //Given
            Square square = new Square();
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(square);
            //When
            String testFigureString = shapeCollector.showFigures();
            //Then
            Assertions.assertEquals(square.getShapeName(),testFigureString);

        }
    }
    
}
