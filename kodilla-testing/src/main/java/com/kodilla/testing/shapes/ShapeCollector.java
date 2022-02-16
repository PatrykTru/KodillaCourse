package com.kodilla.testing.shapes;

import com.kodilla.testing.shapes.POJO.*;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    List<Shape> shapes = new ArrayList<>();

    void addFigure(Shape shape){

        if(shape != null) {
            shapes.add(shape);
        }

    }
    boolean removeFigure(Shape shape){
        boolean result = false;

        if(shapes.contains(shape)) {
            shapes.remove(shape);
            result = true;
        }
         return result;
    }

    Shape getFigure(int n){

        if(n<=shapes.size()) {
            return shapes.get(n);
        }

    return null;
    }
    String showFigures(){
        String figures = "";

        if(shapes.size()>0) {

            for (int i = 0; i < shapes.size(); i++) {
                figures = figures  + shapes.get(i).getShapeName();
            }
            return figures;
        }
        return null;
    }


}
