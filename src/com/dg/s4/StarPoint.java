package com.dg.s4;

import java.util.Scanner;

public class StarPoint {

	public static void main(String[] args) {		
			
        int i, j = 0;
        int star = 0;
        //처음위에 삼각형
        for (i = 0; i < 9; i += 2) {    //윗삼각형의 높이는 밑변개수의 1/2를 만들기위해 i를 2씩 증가시킴
            for (j = 9; j >= i; j -= 2) {   // 아이는 계속 2씩 증가하므로 제이는 밑변개수(n)으로 두고 2씩 감소시키면 줄이 바뀔때마다 공백이 한개씩 줄어들게 됨
                System.out.print("  ");
            }
            for (star = 0; star <= i ; star++) { //찍을 별의 개수를 2개씩증가시킴
                System.out.print("* ");
            }
            System.out.println();   //줄바꿈
        }
	}
}
