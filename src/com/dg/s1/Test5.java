package com.dg.s1;

import java.util.Scanner;

public class Test5 {
	
	public static void main(String [] args) {
		
		System.out.println("Test5 Start");
		Scanner sc = new Scanner(System.in);
		
		//회원가입시 입력한 ID
		int id = 1234;
		int pw = 5678;
		
		
		//ID 입력 후 저장
		
		
		int yid;
		int ypw;
		
		System.out.println("ID를 입력하세요");
		yid = sc.nextInt();
		
		System.out.println("PW를 입력하세요");
		ypw = sc.nextInt();
		
				
		
		if (yid == id && ypw == pw) {
			
			System.out.println("로그인 성공");
					
		}
		
		
					
		
		
		System.out.println("Test5 Finish");
	}

}
