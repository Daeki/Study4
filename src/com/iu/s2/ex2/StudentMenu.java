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
		StudentView sv = new StudentView();
		
		System.out.println("학생 수를 입력하세요");//2
		int count = sc.nextInt();
		
		//학생을 모을 배열 선언
		Student [] students = new Student[count];
		
		
		for(int i=0;i<students.length;i++) {
			Student student = new Student();
			System.out.println("이름을 입력하세요");
			student.name = sc.next();
			System.out.println("번호 입력");
			student.num = sc.nextInt();
			System.out.println("국어 입력");
			student.kor = sc.nextInt();
			System.out.println("영어 입력");
			student.eng = sc.nextInt();
			System.out.println("수학 입력");
			student.math = sc.nextInt();
			student.total = student.kor + student.eng + student.math;
			student.avg = student.total / 3.0;
			students[i]=student;
		}
		
		
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
				sv.viewAll(students);
				break;
			
			case 2:
				System.out.println("학생 번호 입력");
				int num = sc.nextInt();
				
				Student student=null;
				for(int i=0;i<students.length;i++) {
					if(students[i].num == num) {
						student = students[i];
						break;
					}
				}
				
				if(student != null) {
					sv.viewOne(student);
				}
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