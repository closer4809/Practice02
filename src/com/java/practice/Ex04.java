package com.java.practice;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
	
	System.out.println("���̸� �Է����ּ���");
	System.out.print("���� : ");
	
	int a = sc.nextInt();
	
	if(a<0) {
		System.out.println("�����Դϴ�.");
	}
	
	else if(a>=19 && a<65) {
		System.out.println("1���׷� �Դϴ�.");
	}
	
	else {
		System.out.println("2���׷� �Դϴ�.");
	}
	
	sc.close();
	
	
	}

}
