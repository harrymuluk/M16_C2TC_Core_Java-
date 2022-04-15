package com.indiabix.inheritance;

class Animal{
	void Animals()
	{
		System.out.println("It belongs to animal");
		
	}
}
class pet extends Animal{
	
	void petanimals(String x) {
		
		System.out.println(x + " is a pet");
	}
}

public class Singleinheritance {

	public static void main(String[] args) {
		pet dog = new pet();
		dog.petanimals("Puppy");
		dog.Animals();

	}

}
