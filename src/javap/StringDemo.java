package javap;

public class StringDemo
{
	public static void main(String args[])
	{
		String a="My name is Mayuri";
		
		System.out.println(a.length());
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		System.out.println(a.substring(0, 5));
		System.out.println(a.substring(8));
		System.out.println(a.replace('n','m' ));
		System.out.println(a.replaceAll("Mayuri", "pooo"));
		
		
		String b="my name is\"Mayuri\"kulkarni";
		System.out.println(b);
		
		//this \ character is called backslash character
		
		String c= "This \\ character is called backslash character";
		System.out.println(c);
		
		String c1= "This \n character is called backslash character";
		System.out.println(c1);
		
		String e= "i am from from latur";
		System.out.println(a.concat(e));
		
		System.out.println(a.equals(e));
		
		 	String myStr = "Hello";
		    System.out.println(myStr.contains("Hel"));
		    System.out.println(myStr.contains("e"));
		    System.out.println(myStr.contains("Hi"));
		
		
		
		
		String d="           Hello world   ";
		String d1="          Hello world    ";
		System.out.println(d);
		System.out.println(d1.trim());   //Removes whitespaces from both the end of strings.
		
		
		
		

		
		
		
	
			
		
		
	}
}
