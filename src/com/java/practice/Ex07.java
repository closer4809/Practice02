package com.java.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
	
	System.out.print("ù��° ���� : ");
	int a = sc.nextInt();

	System.out.print("�ι�° ���� : ");
	int b = sc.nextInt();
	
	if(a<0 || b<0) {
		System.out.println("�����Դϴ�");
	}
	
	
	else if(a>b) {
		System.out.println("�� : "+a/b);
		System.out.println("������ : "+a%b);
	}
	
	else if(a<b) {
		System.out.println("�� : "+b/a);
		System.out.println("������ : "+b%a);
	}
	
	else if(a==b) {
		System.out.println("�� : "+b/a);
		System.out.println("������ : "+b%a);		
	}	
	
	
	sc.close();
	
	
	
	}

}
