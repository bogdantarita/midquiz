package ro.siit.midquiz;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(4, 3);
        Square s1 = new Square(4.5);
        Circle c1 = new Circle(3);
        Triangle t1 = new Triangle(3, 4, 5);

        double perimeterSum = 0,surfaceSum = 0;

        List<Object> shapes = new ArrayList<Object>();
        shapes.add(r1);
        shapes.add(s1);
        shapes.add(c1);
        shapes.add(t1);

    }

}
