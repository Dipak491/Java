package com.operators;

public class BitwiseOperatorDemo {

	public static void main(String[] args) {
		
		int a = 5; //(001)
		int b = 7; //(111)
		
		int c = (a&b);    // 101  =5
						//&  111  =7
						//=	 101  =5
		System.out.println(c);
		
		
		
		int d = (a|b);  //101
						//111
					//=	  111  //7
		System.out.println(d);
		
		
		int e = (a^b);  //101
						//111
						//010   //2
		System.out.println(e);
		
		int f = (~b);	//111  //7
					//=	 7+1
						//-8
		System.out.println(f);

	}

}
