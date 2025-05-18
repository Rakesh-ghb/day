package com.whileloop;

public class Armstrong {
	public void PrintArmstrong(int num) {
		
		int temp=num;
		int sum=0;
		while(num!=0) {
			int i=num%10;
			sum+=i*i*i;
			num=num/10;
		}
		if(temp==sum) {
			System.out.println(temp+":is a Armstrong number");
			
	}
		else {
			System.out.println(temp+":is not a Armstrong number");
		}
		
	}
		
		public static void main(String[] args) {
			
		
			Armstrong obj=new Armstrong();
			obj.PrintArmstrong(121);
			obj.PrintArmstrong(153);
		}
}
	
