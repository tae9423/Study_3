package com.dg.s2;

import java.util.Scanner;

public class ForTest3 {
	
	public static void main(String [] args) {
		
		System.out.println("ForTest3 Start");
		
		Scanner sc = new Scanner(System.in);
		int goal=0;
		
		System.out.println("종료 시간을 입력해주세요");
		goal = sc.nextInt();
		
		
		
		for(int sec=0;sec<60;sec++) {
			
			
			System.out.println(sec);
			if(sec==goal) {
				break;
			}
			
		}
		
		
		System.out.println("ForTest3 Finish");
	}

}
