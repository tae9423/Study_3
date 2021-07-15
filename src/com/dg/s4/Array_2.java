package com.dg.s4;

import java.util.Scanner;

public class Array_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("과목의 수를 입력하세요");
		int count = sc.nextInt();
		int [] nums = new int[count];
		int total = 0;
		
		for(int i=0;i<nums.length;i++) {
			System.out.println((i+1)+"번째 점수를 입력하세요");
			nums[i]=sc.nextInt();			
			total = total +nums[i];
		}
			System.out.println("Total : "+total);
			double avg = total /(double)nums.length;
			System.out.println("Avg : "+avg);
		}

	}

