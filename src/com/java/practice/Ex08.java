package com.java.practice;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
	System.out.print("����1 : ");
	int a = sc.nextInt();
	
	System.out.print("����2 : ");
	int b = sc.nextInt();
	
	System.out.print("����3 : ");
	int c = sc.nextInt();
	
	if(a == b && b== c) {
		System.out.println("�����Դϴ�.");
	}
	
	else if(a <= b && a <= c){
		System.out.println("���� �������� "+a+" �Դϴ�.");
	}

	else if(b <= a && b <= c){
		System.out.println("���� �������� "+b+" �Դϴ�.");
	}
	
	else if(c <= a && c <= b ){
		System.out.println("���� �������� "+c+" �Դϴ�.");
	}
	
	
	
	
	sc.close();
	
	
	}

}
