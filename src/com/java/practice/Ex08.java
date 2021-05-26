package com.java.practice;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
	System.out.print("숫자1 : ");
	int a = sc.nextInt();
	
	System.out.print("숫자2 : ");
	int b = sc.nextInt();
	
	System.out.print("숫자3 : ");
	int c = sc.nextInt();
	
	if(a == b && b== c) {
		System.out.println("동수입니다.");
	}
	
	else if(a <= b && a <= c){
		System.out.println("가장 작은수는 "+a+" 입니다.");
	}

	else if(b <= a && b <= c){
		System.out.println("가장 작은수는 "+b+" 입니다.");
	}
	
	else if(c <= a && c <= b ){
		System.out.println("가장 작은수는 "+c+" 입니다.");
	}
	
	
	
	
	sc.close();
	
	
	}

}
