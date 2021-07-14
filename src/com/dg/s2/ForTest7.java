package com.dg.s2;

public class ForTest7 {
	
	public static void main(String[] args) {
		
		System.out.println("ForTest7 Start");
		
		for(int dan=2;dan<10;dan++) {
			System.out.println(dan+"단");
			
			for(int i=1;i<10;i++) {
				System.out.println(dan +" * "+i + " = "+dan*i);
			}
			System.out.println("=============");
		}
		
		System.out.println("ForTest7 Finish");
	}

}
