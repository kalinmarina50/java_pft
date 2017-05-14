package ru.stqa.pft.sandbox;

public class MyFirstProgram {

	public static void main(String[] args) {
	    hello("world");
	    hello("Denis");
	    hello("Malish");
	    double l = 5;
        System.out.println("Area of the square with the side of " + l + " = " + area(l));


        double a = 2;
        double b = 5;
        System.out.println("Area of a rectangle with the side of " + a + " and " + b + " = " + area(a, b));

	}

	public static void hello(String somestring) {
        System.out.println("Hello, " + somestring + "!");
    }

    public static double area(double length) {
        return length * length;

    }

    public static double area(double a, double b) {
	    return a * b;
    }
}
