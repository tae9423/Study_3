package com.dg.s1;

import java.util.Scanner;

public class Test8 {
public static void main(String [] args) {
		
		System.out.println("Test8 Start");
		int kor, eng, math = 0;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어점수를 입력해주세요");
		kor = sc.nextInt();
		System.out.println("영어점수를 입력해주세요");
		eng = sc.nextInt();
		System.out.println("수학점수를 입력해주세요");
		math = sc.nextInt();
		int total = kor + eng + math;
		double avg = total / 3.0;
		String result="불합격";
		
		if(kor>=40 && eng>=40 && math >= 40) {
			if(avg>=60) {
				
				result ="합격";
				
			}
			
		}
		System.out.println(result);
}

}
