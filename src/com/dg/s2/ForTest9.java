package com.dg.s2;

import java.util.Scanner;

public class ForTest9 {

	public static void main(String[] args) {
		System.out.println("ForTest9 Start");
		
		
		
		//탄창 3개, 한 탄창에 30발
		Scanner sc = new Scanner(System.in);
		for(int m=0;m<3;m++) {
			System.out.println(m+1+"번째 탄창");
			System.out.println("모드를 선택해주세요 1.단발 or 2.점사");
			int mode = sc.nextInt();
			String sound ="탕";
			//int count = 30;
			int num=1;
			if(mode!=1) {
				sound="타타탕";
				//count =10;
				num = 3;
			}
			
			for(int i=30;i>0;i=i-num) {
				
				System.out.println(sound+(i-num)+"/"+i);				
				
			
				}
		
		}
		System.out.println("탄창이 모두 소진되었습니다");
}


/*if(mode==1) {
	System.out.println("단발을 선택하셨습니다");
	for(int mm =30;mm>0;mm--) {
		System.out.println("탕");
							
	}
}if(mode==2){
	System.out.println("점사를 선택하셨습니다");
	for(int mmm =30;mmm>0;mmm=mmm-3) {
		System.out.println("탕탕탕");
	}	*/								
}	