package com.java.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("���(����)�� �Է����ּ���");
		System.out.print("��� : ");
		int a = sc.nextInt();
		
		if(a <= 0 ) {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}
		
		else if(a%3 == 0) {
			System.out.println("A���Դϴ�.");
		}
		
		else if(a%3 == 1) {
			System.out.println("B���Դϴ�.");
		}
		
		else if(a%3 == 2) {
			System.out.println("C���Դϴ�.");
		}
		
		
		
		
		
		sc.close();
	
	
	
	}

}
