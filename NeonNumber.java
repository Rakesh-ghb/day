package com.whileloop;

public class NeonNumber {
	public void isneonnumber(int num) {
		
		int result=num*num;
		int sum = 0;
		while(result>0) {
			 sum +=result%10;
			result=result/10;
		}
		if(sum==num) {
			System.out.println(num+":is a neon");
			
	}
		else {
			System.out.println(num+":is not a neon");
		}
		
		
		}
		public static void main(String[] args) {
			NeonNumber obj=new NeonNumber();
			obj.isneonnumber(9);
			obj.isneonnumber(12);
		
	}

}

