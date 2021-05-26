package com.java.practice;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력해주세요");
		System.out.print("나이 : ");
//		age = sc.nextInt(); 앞에 자료형 설정 안함
		int age = sc.nextInt();
		
		if(age>20) {
			System.out.println("\"1번 그룹\"");
		}
		
		else {
			System.out.println("\'2번 그룹\'");
		}
		
		
		
		sc.close();
	
	
	
	
	
	
	}

}
