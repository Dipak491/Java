package com.pattern;


//# $ $ $
//$ # $ $
//$ $ # $
//$ $ $ #

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 0 ; i<4; i++)
		{
			for(int j = 0; j<4; j++)
				
			{
				if(i==j)
					System.out.print(" #");
				else if(i>j)
					System.out.print(" $");
				else
					System.out.print(" &");
			}
			
			System.out.println();
		}

	}

}
