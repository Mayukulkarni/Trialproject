package com.abstraction;

public class AccessTwoInterfaces implements Interface1, Interface2
{

	public static void main(String[] args) 
	{
		AccessTwoInterfaces obj= new AccessTwoInterfaces();
		obj.method1();
		obj.method2();

	}

	@Override
	public void method2()
	{
		System.out.println("Mayuri");
		
	}

	@Override
	public void method1()
	{
		System.out.println("Kulkarni");
		
	}

}
