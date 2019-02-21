package com.learning;

public class Fibonacci {  // Fibonacci series

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n=10, a=0, b=1;
       System.out.println("First +n terms");
       for(int i=1; i<=n; ++i)
       {
    	   System.out.println(a+ "+");
               int sum = a+b;
               a = b;
               b = sum;
       }
    	   
	}

}
