package com.Polymorphism;

public class MethodOverridingAxis extends MethodOverridingSBI
{
	public void getrateofinterest()
	{
		System.out.println("rate of interest is:9");
	}
	public static void main(String[] args)
	{
		 MethodOverridingAxis obj=new MethodOverridingAxis();
		 obj.getrateofinterest();
		 MethodOverridingSBI obje=new MethodOverridingSBI();
		 obje.getrateofinterest();
	}

}
