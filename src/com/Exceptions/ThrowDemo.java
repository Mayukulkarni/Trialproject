package com.Exceptions;

public class ThrowDemo
{

	public static void main(String[] args)
	{
		int age=20;
		if(age<=20)
		{
			throw new ArithmeticException("Access Granted");
		}
		else
		{
			System.out.println("Access Denied");
		}
	}

}

/*The throw statement allows you to create a custom error.

The throw statement is used together with an exception type. 
There are many exception types available in Java: ArithmeticException, FileNotFoundException, ArrayIndexOutOfBoundsException, 
SecurityException, etc:
*/
