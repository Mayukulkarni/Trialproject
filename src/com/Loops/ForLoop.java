package com.Loops;

public class ForLoop {

	public static void main(String args[])
	{
		/*for (int i = 0; i <= 10; i++) 
		{
			System.out.println(i);
		}*/
		
		// to calculate sum of first ten numbers
		int sum=0;
		for(int i=0;i<=10;i++)
		{
			sum +=i;
		}
		System.out.println("sum==" +sum);

	}

}


/*
 * for (statement 1; statement 2; statement 3) { // code block to be executed }
 */
