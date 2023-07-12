package com.corejava;

public class Calculator {
	
	int a = 20;
	int b = 10;
	void add()
	{
		System.out.println("Addition is "+(a+b));
	}
	
	void sub()
	{
		System.out.println("Substraction is "+(a-b));
	}
	
	int mul(int a, int b)
	{
		return a*b;
	}
	
	void div()
	{
		System.out.println("Division is "+(a/b));
	}
	
	void mod()
	{
		System.out.println("reminder is "+(a%b));
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cobj = new Calculator();
		cobj.add();
		cobj.sub();
		System.out.println(cobj.mul(10,20));
		cobj.div();
		cobj.mod();

	}

}
