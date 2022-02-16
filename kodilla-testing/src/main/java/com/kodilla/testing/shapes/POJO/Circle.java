package com.kodilla.testing.shapes.POJO;

import com.kodilla.testing.shapes.Shape;

public class Circle implements Shape {

    @Override
    public String getShapeName() {
        return "Circle";
    }

    @Override
    public int getField() {

        return 5;
    }
}
