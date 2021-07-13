package com.dg.s1;

import java.util.Scanner;

public class Test6 {
	
	public static void main(String [] args) {
		
		
		int kor, eng, math;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어점수를 입력해주세요");
		kor = sc.nextInt();
		System.out.println("영어점수를 입력해주세요");
		eng = sc.nextInt();
		System.out.println("수학점수를 입력해주세요");
		math = sc.nextInt();
		
		int total = kor + eng + math;
		double avg = total / 3.0;
		String mes = "불합격";
		
		
		if(avg >= 60) {
			mes = "합격";
					
		}
		System.out.println("결과 : "+mes);
		
		
		/*
		System.out.println("Test6 Start");
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		System.out.println("숫자를 입력해주세요");
		
		num=sc.nextInt();
		
		if(num%2 !=0) {
			System.out.println("홀수");
			
		} else
			System.out.println("짝수");
		
		*/
		
		System.out.println("Test6 Finish");
		
	}

}
