package com.kodilla.testing.shapes.POJO;

import com.kodilla.testing.shapes.Shape;

public class Square implements Shape {

    @Override
    public String getShapeName() {
        return "Square";
    }

    @Override
    public int getField() {
        return 14;
    }
}
