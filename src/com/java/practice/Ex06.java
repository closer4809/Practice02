package com.java.practice;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
	
	System.out.println("����2���� �Է����ּ���");
	System.out.print("����1 : ");
	int a = sc.nextInt();
	
	System.out.print("����2 : ");
	int b = sc.nextInt();
	
	if(a>b) {
		System.out.println("ū�� : "+a+"           "+"������ : "+b);
	}
	
	else if(a<b) {
		System.out.println("ū�� : "+b+"           "+"������ : "+a);
	}
	
	else if(a==b) {
		System.out.println("�����Դϴ�.");
	}
	
	sc.close();
	
	
	
	
	}

}
