package com.haresh.abstract1;

class Fruit
{
	String name="Mango";
}
class Apple extends Fruit
{
	String name="Apple-1";
	void print()
	{
		System.out.println(name);
		System.out.println(super.name);
	}
}

public class Example5 {

	public static void main(String[] args) {
		Apple a=new Apple();
		a.print();
		

	}

}
