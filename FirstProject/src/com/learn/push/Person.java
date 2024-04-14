package com.learn.push;

class Person implements InterfaceOne,InterfaceTwo
{
	 public static String ANSI_GREEN="\u001B[34m";
	 public static final String ANSI_RESET = "\u001B[0m"; 
	public static void main(String[] args) {
		Rectangle rectangle=new Rectangle(5, 10);
//		System.out.println(ANSI_GREEN + rectangle);
		InterfaceOne p=new Person();
		p.print();
	}
	@Override
	public void print() {
		InterfaceTwo.super.print();
		InterfaceOne.super.print();
		InterfaceOne.display();
	}
}
record Rectangle(double length, double width)
{
	
}
interface InterfaceOne
{
	default void print()
	{
		System.out.println("Intereface one");
	}
	public static void display()
	{
		System.out.println("display method");
	}
}
interface InterfaceTwo
{
	default void print()
	{
		System.out.println("Interface two");
	}
}