package com.java.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("��µǴ� ������ �Է��ϼ���");
		
		System.out.print("��ȣ : ");
		String a = sc.nextLine();
		
		
		
		System.out.print("����1 : ");
		int b = sc.nextInt();
		
		System.out.print("����2 : ");
		int c = sc.nextInt();
		
		switch(a) {
		
		case"+" : System.out.println("����� : " + (double)(b+c) );
		break;
		
		case"-" : System.out.println("����� : " + (double)(b-c) );
		break;
		
		case"*" : System.out.println("����� : " + (double)(b*c) );
		break;
		

		
		case"/" : if(c==0) {System.out.println("����� �� �����ϴ�.");}
				else if(c>0){System.out.println("����� : " + ((double)b/(double)c) );}
		break;
		
		default : System.out.println("����� �� �����ϴ�.") ;	
	}
		
		
		
		
		
		
		
		sc.close();
		
		
		
		
		
		
		
	}

}
