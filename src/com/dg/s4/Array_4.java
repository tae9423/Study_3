package com.dg.s4;

public class Array_4 {

	public static void main(String[] args) {
		int [] ar1 = new int[3];
		ar1[0] = 1;
		ar1[1] = 2;
		ar1[2] = 3;
		
		int [] ar2 = new int[ar1.length+1];		
			
		
	for(int i=0;i<ar2.length;i++) {
			if(i<ar1.length) {
			ar2[i] = ar1[i];
			}else{
				ar2[i] = 4;
			}
			System.out.println(ar2[i]);
		}

	}

}
