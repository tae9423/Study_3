package com.dg.s4;

import java.util.Scanner;

public class Array_8 {

	public static void main(String[] args) {
		int [] ids = {1234, 4567, 4356, 1258};
		int [] pws = {6789, 5437, 1235, 9874};

		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		boolean neww = true;
		
		while(flag) {
			System.out.println("번호를 눌러주세요");
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 종료");
			int a = sc.nextInt();
			switch(a) {
			case 1 :
				System.out.println("id를 입력해주세요");
				int idd = sc.nextInt();		
				
				System.out.println("pw를 입력해주세요");
				int ppw = sc.nextInt();
				
				for(int i=0;i<ids.length;i++) {	
					if(idd==ids[i]){						
							if(ppw==pws[i]) {
								System.out.println("로그인 성공");	
								while(neww) {
									
									System.out.println("1. 로그아웃");
									System.out.println("2. 회원탈퇴");
									System.out.println("3. 종료");
									int as = sc.nextInt();
									
									//여기부터
									switch(as) {
									case 1 :
										System.out.println("로그아웃 합니다.");
										neww=!neww;
										
										break;
										
									case 2 :
										int []ar3 = new int [ids.length-1];
										System.out.println("회원탈퇴할 아이디를 입력해주세요");
										int removeId = sc.nextInt();
										int index=0;
										
										for(i=0;i<ids.length-1;i++) {
											if(ids[i]==removeId) {
												continue;
											}
											ar3[index]=ids[i];	
											index++;
										}	
										ids=ar3;
										break;
										
									default :
										System.out.println("종료합니다.");
										neww=!neww;
										flag=!flag;
									}
									//여기까지
								}
								
								break;														
							} else {	
								System.out.println("로그인 실패");	
							}
						}
					}					
				break;
				
			case 2 :
						
				boolean check= true;
				while(check) {
					System.out.println("회원가입을 선택하셨습니다");
					System.out.println("id를 입력해주세요");
					int id = sc.nextInt();				
					System.out.println("pw를 입력해주세요");
					int pw = sc.nextInt();	
					
					for(int i=0;i<ids.length;i++) {
					if(id==ids[i]) {
						System.out.println("중복된 값입니다.");
						check = false;
					}
				}				
				if(check) {
					int []ar1 = new int [ids.length+1];
						for(int i=0;i<ids.length;i++) {
							ar1[i]=ids[i];							
						}	
					ar1[ids.length]=id;
					ids = ar1;
					int []ar2 = new int [pws.length+1];
						for(int i=0;i<pws.length;i++) {
							ar2[i]=pws[i];							
						}	
					ar2[pws.length]=pw;
					pws = ar2;		
				
					System.out.println("회원가입 성공!!");
					break;					
				}
			}
			break;
				
			default :
				System.out.println("종료하겠습니다.");
				flag = !flag;
			}
		}	
	}
}
