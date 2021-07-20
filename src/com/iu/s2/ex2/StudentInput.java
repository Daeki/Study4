package com.iu.s2.ex2;

import java.util.Scanner;

public class StudentInput {
	
	//makeStudent
	//학생 한명 생성
	//이름, 번호, 국어, 영어, 수학 입력받고
	//총점, 평균
	
	public Student makeStudent() {
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		System.out.println("이름 입력");
		student.name=sc.next();
		System.out.println("번호 입력");
		student.num = sc.nextInt();
		System.out.println("국어 입력");
		student.kor=sc.nextInt();
		System.out.println("영어 입력");
		student.eng=sc.nextInt();
		System.out.println("수학 입력");
		student.math=sc.nextInt();
		student.total= student.kor + student.eng + student.math;
		student.avg = student.total / 3.0;
		
		return student;
		
	}

}
