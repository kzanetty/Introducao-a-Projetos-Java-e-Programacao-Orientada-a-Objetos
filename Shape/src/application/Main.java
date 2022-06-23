package application;

import entities.Circle;
import entities.enums.Color;
import entities.Rectangle;
import entities.Shape;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Shape> list = new ArrayList<>();

        Shape s1 = new Circle(Color.valueOf("Black"), 3.21);
        Shape s2 = new Circle(Color.valueOf("Green"), 3.0);
        Shape s3 = new Rectangle(Color.valueOf("White"), 4.0, 5.0);
        Shape s4 = new Rectangle(Color.valueOf("Red"), 1.12, 5.4);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        for(Shape shape: list){
            System.out.println(shape);
        }

    }
}
