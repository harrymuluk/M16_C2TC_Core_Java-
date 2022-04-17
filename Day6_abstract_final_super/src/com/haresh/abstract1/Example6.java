package com.haresh.abstract1;

class Parent3
{
	void accept()
	{
		System.out.println("Muluk");
	}
}
class Child3 extends Parent3
{
	void accept()
	{
		System.out.println("Haresh");
	}
	void display()
	{
		accept();
		super.accept();
	}
}

public class Example6 {

	public static void main(String[] args) {
		Child3 c=new Child3();
		c.display();

	}

}
