package com.dg.s1;

import java.util.Scanner;

public class Test11 {
	
	public static void main(String [] args) {
		
		System.out.println("Test11 Start");
		
		//국어, 영어, 수학 입력
		
		Scanner sc = new Scanner(System.in);
		int kor, eng, math;
		int total;
		double avg;
		
	
		System.out.println("국어 점수를 입력해주세요");
		kor = sc.nextInt();
		System.out.println("영어 점수를 입력해주세요");
		eng = sc.nextInt();
		System.out.println("수학 점수를 입력해주세요");
		math = sc.nextInt();
		
		total = kor + eng + math;
		avg = total /3.0;
		
		if(avg>=90) {
			System.out.println("A");
		} else if(avg>=80) {
			System.out.println("B");
		} else if(avg>=70) {
			System.out.println("C");
		} else if(avg>=60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
		
		System.out.println("Test11 Finish");
	}

}
