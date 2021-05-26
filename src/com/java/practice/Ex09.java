package com.java.practice;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 : ");
		int a = sc.nextInt();
		
		System.out.print("두번째 숫자 : ");
		int b = sc.nextInt();
		
		if(a>b) {
			if(a%b == 0)
			{System.out.println(b+ " 는(은) " + a + " 의 약수입니다.");}

			else if(a%b != 0) 
			{System.out.println(b+ " 는(은) " + a + " 의 약수가 아닙니다.");}
			}
		
		if(a<b) {
			if(b%a == 0)
			{System.out.println(a+ " 는(은) " + b + " 의 약수입니다.");}

			else if(b%a != 0) 
			{System.out.println(a+ " 는(은) " + b + " 의 약수가 아닙니다.");}
			}
		
		
		
		sc.close();
	
	System.out.println();
	
	}

}
