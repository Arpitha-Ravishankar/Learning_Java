package com.learning;

public class Fibonacci {  // Its a series where next term is the sum of previous 2 terms

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n=10, a=0, b=1;     //n= 10, checking for first 10 values and started with 0 and 1
       System.out.println("First +n terms");
       for(int i=1; i<=n; ++i)
       {
    	   System.out.println(a+ ",");
               int sum = a+b;
               a = b;
               b = sum;
       }
    	   
	}

}
