package com.java.practice;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
	
	System.out.println("숫자2개를 입력해주세요");
	System.out.print("숫자1 : ");
	int a = sc.nextInt();
	
	System.out.print("숫자2 : ");
	int b = sc.nextInt();
	
	if(a>b) {
		System.out.println("큰수 : "+a+"           "+"작은수 : "+b);
	}
	
	else if(a<b) {
		System.out.println("큰수 : "+b+"           "+"작은수 : "+a);
	}
	
	else if(a==b) {
		System.out.println("동수입니다.");
	}
	
	sc.close();
	
	
	
	
	}

}
