package com.practice1.collateral_lpp;

public class prime_number {

	int n1;
	static int flag=0;
	
	public static void main(int n1) {
		
		
		//int n2=n1/2;
	
		for(int i=2;i<n1;i++) {
			if(n1%i==0) {
				System.out.println("is not prime number");
				flag=1;
				break;
			}
			
		
	
	
	}
		if(flag==0)
		{
			System.out.println("prime");
		}
	}
	public static void main(String[] args) {
		main(2);
		
		
		
	}
	
}
