package com.java.practice;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ���� : ");
		int a = sc.nextInt();
		
		System.out.print("�ι�° ���� : ");
		int b = sc.nextInt();
		
		if(a>b) {
			if(a%b == 0)
			{System.out.println(b+ " ��(��) " + a + " �� ����Դϴ�.");}

			else if(a%b != 0) 
			{System.out.println(b+ " ��(��) " + a + " �� ����� �ƴմϴ�.");}
			}
		
		if(a<b) {
			if(b%a == 0)
			{System.out.println(a+ " ��(��) " + b + " �� ����Դϴ�.");}

			else if(b%a != 0) 
			{System.out.println(a+ " ��(��) " + b + " �� ����� �ƴմϴ�.");}
			}
		
		
		
		sc.close();
	
	System.out.println();
	
	}

}
