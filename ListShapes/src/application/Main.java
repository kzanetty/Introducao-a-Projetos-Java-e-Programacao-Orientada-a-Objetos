package application;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Shape> list = new ArrayList<>();
        Circle circle = new Circle(7.0);
        Rectangle rectangle = new Rectangle(4.5, 7.0);
        list.add(new Circle(3.0));
        list.add(new Circle(5.7));
        list.add(new Rectangle(3.0, 2.7));
        list.add(new Rectangle(4.0, 3.6));
        list.add(circle);
        list.add(rectangle);

        List<Circle> listCircle = new ArrayList<>();
        listCircle.add(new Circle(3.0));
        listCircle.add(new Circle(7.0));
        listCircle.add(new Circle(2.0));

        System.out.println("Total Area: " + totalArea(list));
        System.out.println("Total Area circle: " + totalArea(listCircle));
    }

    public static double totalArea(List<? extends Shape> list) {
        if (list.isEmpty()) {
            throw new IllegalStateException("List must not be empty.");
        }
        double sum = 0;
        for (Shape element : list) {
            sum += element.area();
        }
        return sum;
    }
}
