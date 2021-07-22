package com.dg.s4;

import java.util.Scanner;

public class Array_5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		boolean flag = true;
		
		int [] ar= {45, 52, 76};
		
			while(flag) {
				System.out.println("1. 정보출력 2. 정보추가 3. 정보삭제 4. 검색해서 삭제 5. 종료");
				System.out.println("무엇을 선택하시겠습니까?");
				int select = sc.nextInt();
				
				switch(select) {
				case 1 :
					System.out.println("1. 정보출력을 선택하셨습니다");
					for(int i=0;i<ar.length;i++) {
						System.out.println(ar[i]);
					}					
				if(ar.length==0) {
					System.out.println("값이 존재하지 않습니다");
				}
					break;
				case 2 :
					System.out.println("2. 정보추가를 선택하셨습니다");
					System.out.println("추가할 숫자를 입력해주세요");
					int plus = sc.nextInt();
					int []ar2 = new int [ar.length+1];
					for(int i=0;i<ar.length;i++) {
						ar2[i]=ar[i];							
					}	
					ar2[ar.length]=plus;
					ar = ar2;
					break;
				case 3 :
					if(ar.length==0) {
						System.out.println("더이상 삭제할 값이 없습니다.");
						System.out.println("값을 먼저 추가해주십시오");
						break;
						}
					System.out.println("3. 정보삭제를 선택하셨습니다");
					System.out.println("마지막 값을 삭제합니다.");
					int []ar3 = new int [ar.length-1];
					for(int i=0;i<ar.length-1;i++) {
						ar3[i]=ar[i];							
					}	
					ar = ar3;
					break;
					
				case 4 :
					if(ar.length==0) {
						System.out.println("data가 없어요");
						break;
					}
					
					System.out.println("삭제할 인덱스 번호 입력");
					int num = sc.nextInt();
					
					if(num >=ar.length || num < 0) {
						System.out.println("배열의 범위를 벗어났습니다");
						break;
						
					}
					int []ar4 = new int[ar.length-1];
					int index = 0;
					for(int i=0;i<ar.length;i++) {
						if(num==i) {
							continue;							
						}
						ar4[index]=ar[i];
						index++;
					}
					ar=ar4;
					break;
					
							
				default :
					System.out.println("프로그램을 종료합니다");
					flag=!flag;
					
				}
				
			}
	
	}

}
