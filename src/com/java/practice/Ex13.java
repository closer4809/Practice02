package com.java.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
	
	System.out.println("���ڸ� �Է��� �ּ���");
	System.out.print("���� : ");
	
	int a = sc.nextInt();
	
	if(a<=0) {
		System.out.println("������� "+(double)(a*a*a-9*a+2)+" �Դϴ�.");
	}
	else if(a>0) {
		System.out.println("������� "+(double)(7*a+2)+" �Դϴ�.");
	}
	
	
	
	sc.close();
	
	
	
	
	}

}
