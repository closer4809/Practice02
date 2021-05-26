package com.java.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
	
	System.out.println("숫자를 입력해 주세요");
	System.out.print("숫자 : ");
	
	int a = sc.nextInt();
	
	if(a<=0) {
		System.out.println("계산결과는 "+(double)(a*a*a-9*a+2)+" 입니다.");
	}
	else if(a>0) {
		System.out.println("계산결과는 "+(double)(7*a+2)+" 입니다.");
	}
	
	
	
	sc.close();
	
	
	
	
	}

}
