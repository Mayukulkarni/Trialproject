package com.abstraction;

public class ChildClassOfInterface implements WithInterfaceDemo
{

	public static void main(String[]args) 
	{
		ChildClassOfInterface obj=new ChildClassOfInterface();
		obj.method1();
		obj.method2();
				
		
	}

	@Override
	public void method1() 
	{
		System.out.println("hellooo");
		
	}

	@Override
	public void method2() 
	{
		
		System.out.println("world");
	}
}
