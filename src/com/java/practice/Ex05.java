package com.java.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ű�� �����Ը� �Է����ּ���.");
		
		System.out.print("Ű : ");
		int a = sc.nextInt();
		
		System.out.print("������ : ");
		int b = sc.nextInt();
		
		if((a-100)*0.9>b) {
			System.out.println("��ü�� �Դϴ�.");
			System.out.println((a-100)*0.9);
		}
		
		else if((a-100)*0.9==b) {
			System.out.println("ǥ�� �Դϴ�.");
			System.out.println((a-100)*0.9);
		}
		
		else {
			System.out.println("��ü�� �Դϴ�.");
			System.out.println((a-100)*0.9);
		}
		
		sc.close();
		
		
	}

}
