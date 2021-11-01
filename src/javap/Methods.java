package javap;

public class Methods
{
	public void test1() //this is void method      non static
	{
		System.out.println("Method one");
	}
	
	//Static method
	public static void test2() //void method does not have return type means it does not return anything
	{
		System.out.println("Method two");
		
	}
	public void test3()  //non static
	{
		System.out.println("Method three");
	}
	public static int test4() //Method with return type
	{
		int a=6;
		return a;
		
	}
	//This is parameterized method
	public void paraMethod(String name, int age)
	{
		System.out.println(name);
		System.out.println(age);
	}
	public static void main(String args[])
	{
		//How to create object of class:
		//className objectName=new className();
		Methods obj=new Methods();
		obj.test1();
		test2();
		obj.test3();
		System.out.println(test4());
		obj.paraMethod("Mayuri",21);
		
		
	}

}
