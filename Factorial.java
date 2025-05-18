package com.whileloop;

public class Factorial{
	public int printFactorial(int num) {
		if(num<=0) {
			System.out.println("not a factorial");
		}
		if(num==0) {
			System.out.println("is factorial ");
		}
	
		int fact=1;
		int i=1;
		while(i<=num) {
			fact=fact*i;
			i++;
			}
		
		return fact;
	}
public static void main(String[]args) {
	 Factorial obj=new  Factorial();
	System.out.println("Factorial of 5 is :"+obj.printFactorial(5));
	 System.out.println("Factorial of 7 is :"+obj.printFactorial(7));
		
}
}
