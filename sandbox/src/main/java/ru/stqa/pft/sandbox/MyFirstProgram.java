package ru.stqa.pft.sandbox;

public class MyFirstProgram {

	public static void main(String[] args) {
	    hello("world");
	    hello("Denis");
	    hello("Malish");


	    Square s = new Square(5);
        System.out.println("Area of a square with the side of " + s.l + " equals " + s.area());


        Rectangle r = new Rectangle(3,4);
        System.out.println("Area of a rectangle with the sides of " + r.a + " and " + r.b + " equals " + r.area());

	}

	public static void hello(String somestring) {
        System.out.println("Hello, " + somestring + "!");
    }

}