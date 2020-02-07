package ru.stqa.pft.sandbox;

public class MyFirstProgram {
	public static void main (String[] args) {
		System.out.println("Hello, world");
		System.out.println(2 + 2);
		Square s = new Square(10);
		Rectangle r=new Rectangle(4,6);

		System.out.println(s.area());
		System.out.println(r.area());
	}

}