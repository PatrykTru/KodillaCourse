package com.kodilla.testing.shapes.POJO;

import com.kodilla.testing.shapes.Shape;

public class Triangle implements Shape {
    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public int getField() {
        return 8;
    }
}
