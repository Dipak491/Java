package com.main;

class ClassDemo
{
//	int add(double d, int b)
//	{
//		System.out.println("Add method double x, int b");
//		return -1;
//	}
//	
//	void add(float a, int y)
//	{
//		System.out.println("add method float a, int y");
//		
//	}
//	
//	String add(String s, int b)
//	{
//		System.out.println("Add method string s, int b");
//		return "String";
//	}
	
	float add(int b, double y)
	{
		System.out.println("add method int b, float y");
		return -1;
	}
	


	
}


public class OverrideDemo {
	

	public static void main(String[] args) 
	{
		
		double a = 10.90;
		
		double b = a;
		System.out.println(b);
		
		
		ClassDemo obj = new ClassDemo();
		
//		obj.add(17.898, 10);
//		obj.add(12.50, 11);
//		obj.add("String", 78);
//		obj.add(12,99.9);
//		
		obj.add(12, 2.30);
	}

}
