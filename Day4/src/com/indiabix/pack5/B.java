package com.indiabix.pack5;

class A 
{
    public double var=20;
    public int add(int a,int b)
    
    {
    	return a+b;
    }
}

public class B {

	public static void main(String[] args) {
		
		A obj=new A();
	     System.out.println(obj.var);
	     System.out.println(obj.add(20,30));
		

	}

}
