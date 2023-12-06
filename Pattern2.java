package com.pattern;


//&  1 &  3
//&  1 &  3
//&  1 &  3
//&  1 &  3


//&&&&
//1111
//&&&&
//3333


public class Pattern2 {

	public static void main(String[] args) {

		for(int i = 0; i<4; i++)
		{
			for(int j=0; j<4;j++)
			{
				//if(j%2==0)
				if(i%2==0)
				{
					System.out.print("&");
				}
				else
				{
					System.out.print(i);
				}
			}
			System.out.println();
		}
	}

}
