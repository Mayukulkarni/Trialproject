package com.Polymorphism;

public class OverloadingDemo
{
	public void method1(int age,String name)
	{
		System.out.println(21);
		System.out.println("Mayuri");
		
	}
	public void method1(int age,String name,int height)
	{
		System.out.println(20);
		System.out.println("bhagi");
	}
	public static void main(String args[])
	{
		OverloadingDemo obj=new OverloadingDemo();
		obj.method1(21,"Mayuri");
		obj.method1(20,"bhagi");
	}
}
/*
 There are two ways to overload the method in java

	By changing number of arguments
	By changing the data type
*/
//method overloading, multiple methods can have the same name with different parameters
