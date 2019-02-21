package com.learning;

public class Swap {  // Class name should always be in caps

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a = 10; // definition
       int b = 20;
       System.out.println("Before Swapping");
       System.out.println("Value of a is : "+a);
       System.out.println("Value of b is : "+b);
       swap(a,b);
	}
	public static void  swap(int a, int b)
	{
		int temp = a; // having a temporary container to hold the values
		a = b;
		b = temp;
		System.out.println("After Swapping");
		System.out.println("Value of a is : " +a);
		System.out.println("Value of b is : " +b);
	}
}	
	
