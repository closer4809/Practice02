package com.java.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ĺ� 1����(�ҹ���)�� �Է��ϼ���");
		System.out.print("���ĺ� : ");
		
		String a = sc.nextLine();
		
		switch(a) {
		
		case"a" :
		case"e" : 
		case"i" :
		case"o" :
		case"u" : System.out.println("�����Դϴ�.");
		break;
		
		
		
		default : System.out.println("�����Դϴ�");
		
		
		}
		
		
		
		
		
		
		
		sc.close();
	
	
	}

}
