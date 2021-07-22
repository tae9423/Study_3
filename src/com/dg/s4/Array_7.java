package com.dg.s4;

public class Array_7 {

	public static void main(String[] args) {
		String [] names = new String [3];
		names[0] = "iu";
		names[1] = "choa";
		names[2] = "suzy";
		
		int [] nums = new int [3];
		nums[0] = 5;
		nums[1] = 29;
		nums[2] = 2;
		
	
		for(int idx=0; idx<nums.length-1; idx++) {
			for(int i=idx+1;i<nums.length;i++) {
				if(nums[idx]>nums[i]) {
					int tmp = nums[i];
					nums[i] = nums[idx];
					nums[idx] = tmp;	
					
					//이름 자리 바꾸기
					String t = names[i];
					names[i] = names[idx];
					names[idx]=t;
					
					
					
				}
			}
		}
				for(int i=0;i<nums.length;i++) {
					System.out.println("======================");
					System.out.println(names[i]);
					System.out.println(nums[i]);
					System.out.println("======================");
				}				
			}			
		}
	

