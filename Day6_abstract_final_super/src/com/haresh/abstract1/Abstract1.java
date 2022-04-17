package com.haresh.abstract1;

abstract class A{
	
	abstract void print();
}
class B extends A{
	
	void print()
	{
		System.out.println("Welcome Man");
	}
}

public class Abstract1 {

	public static void main(String[] args) {
		
		B obj = new B();
		obj.print();

	}

}
