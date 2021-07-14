package com.dg.s1;

public class Test9 {
	

	public static void main(String [] args) {
		
		System.out.println("Test9 Start");
		boolean check = true;
		
		check =!check;
		
		if(!check) {
			System.out.println("test");
		}
		
		System.out.println(check);
		
		int age = 30;
		
		String result = age > 19 ? "성년" : "미성년";
		System.out.println(result);
		
		
		
		System.out.println(1+'1'+"1");
	}

}
