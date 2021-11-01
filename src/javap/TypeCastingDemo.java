package javap;

public class TypeCastingDemo 
{
	public static void main(String args[])
	{
		//Widening casting
		byte a=60;
		
		double myDouble= a;   // byte to double
		System.out.println(a);
		System.out.println(myDouble);
		
		short myShort=a;      // byte to short 
		System.out.println(myShort);
		
		int myInt=a;          //byte to int
		System.out.println(myInt);      
		
		long myLong=a;         //byte to long
		System.out.println(myLong);
		
		float myFloat=a;       //byte to float
		System.out.println(myFloat);
		
		char h='M';
		int q=h;              //charactor to int
		System.out.println(q);            

		//Narrowing Casting
		double b=9.999;
		
		byte myByte=(byte)b;     	//Double to byte
		System.out.println(b);
		System.out.println(myByte);
		
		float myFl=(float)b;		 //Double to float
		System.out.println(myFl); 
		
		int myIn=(int)b;			//Double to int 
		System.out.println(myIn);  
		
		double p=65.1;
		char myChar=(char)p;      //Double to char
		System.out.println(myChar);  
		
		//Exception
		short d=200;
		char mychar=(char)d;
		System.out.println(d);
		System.out.println(mychar);
			
	}
}





/*
Widening Casting (automatically) - converting a smaller type to a larger type size--implicit type casting
byte -> short -> char -> int -> long -> float -> double

Narrowing Casting (manually) - converting a larger type to a smaller size type----explicit type casting
double -> float -> long -> int -> char -> short -> byte*/