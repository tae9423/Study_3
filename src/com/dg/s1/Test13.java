package com.dg.s1;

import java.util.Scanner;

public class Test13 {
	public static void main(String [] args) {
		
		System.out.println("Test13 Start");
		
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("요금조회는 1번");
		System.out.println("상품가입은 2번");
		System.out.println("고장신고는 3번");
		System.out.println("상담원연결 0번");
		num = sc.nextInt();
				
		switch(num) {
		case 1: 
			System.out.println("요금조회을 선택하셨습니다");
			break;
		case 2:
			System.out.println("상품가입을 선택하셨습니다");
			break;
		case 3:
			System.out.println("고장신고을 선택하셨습니다");
			break;
		case 0:
			System.out.println("상담원연결을 선택하셨습니다");
			break;
		default :
			System.out.println("잘못누르셨습니다 다시 선택해주세요");
		}
		
		System.out.println("Test13 Finish");
	}
}
