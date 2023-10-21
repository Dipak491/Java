// Enter number 
// 34
// 0 1 2 3 4 5 6 7 8 9 10 12 21 23 32

import java.util.*;
import java.Math.*;

class JumpingNumber
{
	static void Jump(int num)
	{
		int i,rem,check=0;
		int temp = num;

		for(i=0;i<temp;i++)
		{
			if(i<10)
			{
				System.out.println(i);
			}
			rem = temp%10;  
			temp= temp/10;

			while(temp != 0)
			{
				if(Math.abs(rem-temp%10) !== 1)
				{
					check=1;
					break;
				}
				rem = temp%10;
				temp = temp/10;
			}

			if(check != 1)
			{
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		Jump(i);
		
	}
}