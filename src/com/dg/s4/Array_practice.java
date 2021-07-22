package com.dg.s4;

import java.util.Scanner;

public class Array_practice {

	public static void main(String[] args) {
		int [] ids = {1234, 4567, 4356, 1258};
		int [] pws = {6789, 5437, 1235, 9874};
		
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		
		while(check) {
			System.out.println("번호를 눌러주세요");
			System.out.println("1. 로그인 2. 회원가입 3. 종료");
			int select = sc.nextInt();
			
			switch(select) {
			
			case 1 :
				
				System.out.println("ID를 입력해주세요");
				int id = sc.nextInt();
				System.out.println("PW를 입력해주세요");
				int pw = sc.nextInt();
				for(int i=0;i<ids.length;i++) {
					if(id==ids[i]) {
						if(pw==pws[i]) {
							System.out.println("로그인에 성공했습니다.");
							//로그인 후 메인화면
							boolean flag2 =true;
							while(flag2) {
								System.out.println("번호를 눌러주세요");
								System.out.println("1. 로그아웃 2. 회원탈퇴 3. 종료");
								int select2 = sc.nextInt();
								switch(select2) {
								case 1 :
									System.out.println("로그아웃 합니다.");
									System.out.println("메인화면으로 돌아갑니다.");
									flag2=!flag2;
									break;
									
								case 2 :
									System.out.println("회원탈퇴할 ID를 입력해주세요");
									int iidd = sc.nextInt();
									int [] idss = new int[ids.length-1];
									int idx = 0;
									for(i =0;i<ids.length;i++) {
										if(iidd==ids[i]) {
											continue;
										}
										idss[idx] = ids[i];
										idx++;
									}
									ids = idss;
									System.out.println("회원탈퇴 성공");
									flag2=!flag2;
									break;									
								
								case 3:									
									flag2=!flag2;								
								}
							}
							break;
						}
						System.out.println("로그인에 실패했습니다.");
						break;					
					}
				}
				break;
			case 2 :
				boolean flag = true;
				System.out.println("회원가입하실 ID를 입력해주세요");
				int iid=sc.nextInt();
				System.out.println("회원가입하실 PW를 입력해주세요");
				int ppw=sc.nextInt();
				
				for(int i=0;i<4;i++) {
					if(iid==ids[i]) {
						System.out.println("ID가 중복되었습니다.");
						flag=!flag;
						break;
					}else {
						int [] iar = new int[ids.length+1];
						int [] par = new int[pws.length+1];						
						
						for( i=0;i<ids.length;i++) {
							iar[i]=ids[i];							
						}	
							iar[ids.length]=iid;
							ids = iar;
					
						for(i=0;i<pws.length;i++) {
							par[i]=pws[i];							
						}	
							par[pws.length]=ppw;
							pws = par;
							System.out.println("회원가입 성공");							
					}					
				}			
				break;
				
			case 3:
				System.out.println("종료합니다.");
				check =!check;
			}
		}
		

	}

}
