package com.dg.s3;

import java.util.Scanner;

public class WhileTest2 {

	public static void main(String[] args) {
		System.out.println("WhileTest2 Start");
		
		int id =1234;
		int pw =5678;
		
		boolean check = true;
		
		
		
		while(check) {
			Scanner sc = new Scanner(System.in);
			System.out.println("1.로그인 " + "2.종료");
			int rog=sc.nextInt();
			if(rog==1) {
				System.out.println("아이디를 입력해주세요");
				int iid = sc.nextInt();
				System.out.println("비밀번호를 입력해주세요");
				int ppw = sc.nextInt();
				if(iid==id && ppw==pw) {				
					
					System.out.println("로그인 되었습니다");
					break;
				}else {
					System.out.println("로그인 실패");							
				}}
				
				else {
				System.out.println("종료하겠습니다");
				check=!check;
			}
		}
		if(check) {
		System.out.println("로그인 성공 게임을 시작");
		int gold = 0;
		
		for(int i=1;i<15;i++) {
			if(i%5==0) {
				gold=gold+i/5*1000;
				System.out.println(i/5*1000+"gold 지급");
				
			}
				
			System.out.println("현재레벨 : "+i);
			for(int r=1;r<=i*3;r++) {
				System.out.println("몬스터"+r+"마리사냥");	
			}
			System.out.println("축!! 레벨업");
		
			if(i==14) {
				gold=gold + 3000;
				System.out.println("3000gold 지급");
				System.out.println("최종 Gold : "+gold);
			}
			
			
		}
		System.out.println("15렙은 만렙입니다");	
		}
		
			

	}
}

	

	
	

