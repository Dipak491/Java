package com.main;


interface A
{
	public void add();
}

interface B
{
	public void mul
	();
}

class AB implements A,B
{
	public void add()
	{
		System.out.println("add");
	}
	public void mul()
	{
		System.out.println("Multiplication");
	}
}

public class InterfaceDemo {
	public static void main(String[] args) 
	{
		AB obj = new AB();
		obj.add();
		obj.mul();
	}

}
