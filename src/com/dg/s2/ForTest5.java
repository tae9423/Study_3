package com.dg.s2;

import java.util.Scanner;

public class ForTest5 {
	
	public static void main(String [] args) {
		
		System.out.println("ForTest5 Start");
		//과목 수 입력
		//과목 수 만큼 점수 입력
		//총점 평균 계산 후 출력
		
		Scanner sc =  new Scanner(System.in);
		int subNum;
		System.out.println("과목수를 입력해주세요");
		subNum = sc.nextInt();
		int total =0;
		for(int i=1;i<=subNum;i++) {
			
			System.out.println(i+"번째 점수를 입력해주세요");
			int zum = sc.nextInt();
			total = zum + total;
			
		}
				
		double avg = total/subNum;
		System.out.println("Total : "+total);
		System.out.println("Avg : "+avg);	
		
		
		
	}

}
