package com.corejava;

public class Demo {
	
	String s = "Welcome to java";
	
	void display()
	{
		System.out.println(s);
		System.out.println(s.length());
	}
	public static void main(String args[])
	{
		Demo obj = new Demo();
		obj.display();
	}

}
