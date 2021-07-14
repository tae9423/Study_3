package com.dg.s2;

import java.util.Scanner;

public class ForTest8 {
	
	public static void main(String[] args) {
		System.out.println("ForTest8 Start");
		// 분초 출력
		// 0분 1초 ~ 0분 59초,
		
		Scanner sc = new Scanner(System.in);
		System.out.println("분을 입력하세요");
		int min=sc.nextInt();
		System.out.println("초를 입력하세요");
		int sec=sc.nextInt();		
		int s=0;
		
		for(int m=0;m<60;m++) {
			
			for(s=0;s<60;s++) {
				System.out.println(m+"분 "+s+"초");
				
				if(sec==s) 
					break;					
							
		}
			if(m==min) 
				break;
				
		}
		
		
		System.out.println("ForTest8 Finish");
	}

}
