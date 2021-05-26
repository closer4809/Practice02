package com.java.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
	
	System.out.print("첫번째 숫자 : ");
	int a = sc.nextInt();

	System.out.print("두번째 숫자 : ");
	int b = sc.nextInt();
	
	if(a<0 || b<0) {
		System.out.println("오류입니다");
	}
	
	
	else if(a>b) {
		System.out.println("몫 : "+a/b);
		System.out.println("나머지 : "+a%b);
	}
	
	else if(a<b) {
		System.out.println("몫 : "+b/a);
		System.out.println("나머지 : "+b%a);
	}
	
	else if(a==b) {
		System.out.println("몫 : "+b/a);
		System.out.println("나머지 : "+b%a);		
	}	
	
	
	sc.close();
	
	
	
	}

}
