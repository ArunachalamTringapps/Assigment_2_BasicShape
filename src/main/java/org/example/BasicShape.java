package org.example;

import java.util.*;

class BasicShape {
    int type;
    private double ar;
    private double per;
    private final double length;
    private final double breadth;
    private final double s1;
    private final double s2;
    private final double radius;
    private final double pi = 3.14;

    public BasicShape(int type, double length, double breadth, double side1, double side2, double radius) {
        this.type=type;
        this.length = length;
        this.breadth = breadth;
        this.s1 = side1;
        this.s2 = side2;
        this.radius = radius;
    }

    double perimeter() {
        if (type == 1) {
            per = 2 * (length + breadth);
        }
        if (type == 2) {
            per = breadth + s1 + s2;
        }
        if (type == 3) {
            per = 2 * pi * radius;
        }
        return per;
    }

    double area() {
        if (type == 1) {
            ar = length * breadth;
        }
        if (type == 2) {
            ar = (breadth * length) / 2;
        }
        if (type == 3) {
            ar = pi * radius * radius;
        }
        return ar;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome guys");
        System.out.println("choose one from below.");
        System.out.println("1.Rectangle\n2.Triangle\n3.Circle");
        System.out.println("Enter the shape type:");
        int type = sc.nextInt();
        System.out.println("Enter the length:");
        double length = sc.nextFloat();
        System.out.println("Enter the breadth:");
        double breadth = sc.nextFloat();
        System.out.println("Enter the side1:");
        double side1 = sc.nextFloat();
        System.out.println("Enter the side2:");
        double side2 = sc.nextFloat();
        System.out.println("Enter the radius:");
        double radius = sc.nextFloat();

        BasicShape bs = new BasicShape(type, length, breadth, side1, side2, radius);
        System.out.println("The perimeter of the given shape is:" + bs.perimeter());
        System.out.println("The area of the given shape is:" + bs.area());
        System.out.println("Thanks for coming");
        sc.close();
    }

}