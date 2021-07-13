package com.dg.s1;

import java.util.Scanner;

public class Test4 {
	
	public static void main(String [] args) {
		
		System.out.println("Test4 Start");
		//10대 유무 판별
		//나이가 10보다 크고, 20 미만
		//나이를 입력
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요");
		
		int age = sc.nextInt();
		
		if(age>=10 && age<20)	{
					
		System.out.println("청소년");
		
		}
		
		System.out.println("종료");
	}
	
		
}
