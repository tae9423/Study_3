package com.dg.s2;

import java.util.Scanner;

public class ForTest6 {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int id = 1234;
		
		int pw = 5678;
		int i=0;
		//5번의 기회
		//1. 최대 5번 로그인 시도
		
		for(i=1;i<=5;i++) {
			System.out.println(i+"번째 시도");
			System.out.println("아이디를 입력하세요");
			int iid = sc.nextInt();
			System.out.println("비밀번호를 입력하세요");
			int ppw = sc.nextInt();
			if(iid==id && ppw==pw) {
				
				break;
			}
			{
				System.out.println("로그인 실패");
				
				}
			}				
	
			if(i==6) {
				System.out.println("잠금 되었습니다.");
		} else {
			System.out.println("로그인 성공");
		}
	
	}

}
