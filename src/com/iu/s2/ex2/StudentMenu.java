package com.iu.s2.ex2;

import java.util.Scanner;

public class StudentMenu {
	
	
	//메서드명 start
	//1. 전체 정보 출력
	//2. 학생 번호 검색 
	//3. 학생 정보 추가 - 학생 한명을 배열에 추가
	//4. 성적 순서 출력
	//5. 프로 그램 종료
	
	public void start() {
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		
		while(flag) {
			System.out.println("1. 전체 정보 출력");
			System.out.println("2. 학생 번호 검색");
			System.out.println("3. 학생 정보 추가");
			System.out.println("4. 성적 순서 출력");
			System.out.println("5. 프로 그램 종료");
			int select = sc.nextInt();
			
			switch(select) {
			case 1:
				System.out.println("정보 출력");
				break;
			
			case 2:
				System.out.println("번호 검색");
				break;
				
			case 3 : 
				System.out.println("정보 추가");
				break;
			case 4:
				System.out.println("성적순 출력");
				break;
			default:
				System.out.println("종료합니다");
				flag = false;
			
			}
			
			
		}
	}

}
