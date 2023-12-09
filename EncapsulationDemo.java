package com.main;

class Test1
{
	private int value;
	
	public void setMethod(int x)
	{
		String s = (x<10) ? "Yes" : "No";
		
		System.out.println("Inside set method   "+ s);	
	}
	public int getMethod()
	{
		System.out.println("Inside get method"+value);
		
		return value;		
	}
}

public class EncapsulationDemo {

	public static void main(String[] args) 
	{
		Test1 obj = new Test1();
		obj.setMethod(-100);
		obj.getMethod();
		

	}

}
