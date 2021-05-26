package com.java.practice;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
	
	System.out.println("나이를 입력해주세요");
	System.out.print("나이 : ");
	
	int a = sc.nextInt();
	
	if(a<0) {
		System.out.println("오류입니다.");
	}
	
	else if(a>=19 && a<65) {
		System.out.println("1번그룹 입니다.");
	}
	
	else {
		System.out.println("2번그룹 입니다.");
	}
	
	sc.close();
	
	
	}

}
