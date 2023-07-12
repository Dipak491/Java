package com.corejava;

public class Student {
	
	static int id;
	static String name;
	
//	static
//	{
//		System.out.println("Hello");
//	}
//	
	 static void getData()
	{
		id = 1;
		name = "Dipak";
	}
	
	static void displayData()
	{
		System.out.println("id ="+id);
		System.out.println("Name = "+name);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		getData();
		displayData();
		

	}

}
