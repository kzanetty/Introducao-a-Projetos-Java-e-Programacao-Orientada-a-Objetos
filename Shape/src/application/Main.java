package application;

import entities.Circle;
import entities.enums.Color;
import entities.Rectangle;
import entities.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Shape> list = new ArrayList<>();

        System.out.println("Inform the number of shapes: ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            System.out.println(" === Info about shape " + (i+1) + " ===");
            System.out.print("Color: (Black,White, Red, Blue, Green): ");
            Color color = Color.valueOf(sc.next());
            System.out.print("Circle or Rectangle: ");
            char ch = sc.next().charAt(0);
            if(ch == 'r' || ch == 'R'){
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                list.add(new Rectangle(color, width,height));
            } else {
                System.out.print("radius of the circle: ");
                double radius = sc.nextDouble();
                list.add(new Circle(color, radius));
            }
        }

        System.out.println();
        System.out.println("== Shapes ==");
        for(Shape shape: list){
            System.out.println(shape);
        }

    }
}
