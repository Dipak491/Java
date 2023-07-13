package com.operators;

public class LogicalOperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//&&, ||, !
		
		System.out.println((5>3)&&(5<3)); //false

		System.out.println((5>3)||(5<3));  //true
		System.out.println((5<3)||(5<9));  //true
		System.out.println((0>1)&&(1<0));  //false

		System.out.println(!(5==3));  //true

		


	}

}
