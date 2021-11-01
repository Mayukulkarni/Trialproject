package com.Arrays;

public class TwoDimentionalArray {

	public static void main(String args[])
	{
					//0th Array    1st Array
		int[][] a= {{11,25,23,14,},{5,10,15,20}};
		/*System.out.println(a[0][1]);
		System.out.println(a[0][0]);
		System.out.println(a[0][2]);
		System.out.println(a[0][3]);
		System.out.println(a[1][0]);
		System.out.println(a[1][1]);
		System.out.println(a[1][2]);
		System.out.println(a[1][3]);*/
		
		for(int i=0;i<a.length;++i)
		{
			
			for(int j=0;j<a[i].length; ++j)
			{
				System.out.println(a[i][j]);
			}
		}
		
		//System.out.println(a[0].length);
		
		
	}
	

}

/*
 A multidimensional array is an array containing one or more arrays.
To create a two-dimensional array, add each array within its own set of curly braces:
*/

