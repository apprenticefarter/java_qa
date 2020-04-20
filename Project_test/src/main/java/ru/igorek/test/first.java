package ru.igorek.test;


public class first {

    public static void main(String[] args) {

        greet("Vasya");

        Cube c = new Cube(3);
        System.out.println("square of cube with side " + c.len + " = " + c.cube());

        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        System.out.println("Distance between " + p1.x + " and " + p2.x + " is  " + p2.distance(p1, p2));


        Rectangle r = new Rectangle(2, 3);
        System.out.println("rectangle with sides: " + r.a + " and " + r.b + " square = " + r.ract());

    }

    public static void greet(String name) {
        System.out.println("hello " + name);
    }


}
