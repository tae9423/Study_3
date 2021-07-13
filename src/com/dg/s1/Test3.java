package com.dg.s1;

import java.util.Scanner;

public class Test3 {
	
	public static void main(String [] args) {
		
		System.out.println("Test3 Start");
		//쇼핑몰의 총주문금액 입력
		//주문금액이 30000원 이하면 배송비 3천원이 추가
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주문 금액을 입력해주세요");
		
		int money = sc.nextInt();
		
		
		if (money <= 30000) {
			
			money = money + 3000;
			
																
		}
		System.out.println(money);
		
		System.out.println("Test3 Finish");
		
	}

}
