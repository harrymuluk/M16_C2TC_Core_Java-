package com.haresh.abstract1;

class Bike
{
	final void accept()
	{
		System.out.println("Bikes are coming in your direction");
	}
}  

class Example4 extends Bike
{  
	void run()
	{
		System.out.println("running safely with 100kmph");
	}  
  
	public static void main(String args[])
	{  
		Example4 honda= new Example4();  
		honda.run();
		honda.accept();
	}  
}