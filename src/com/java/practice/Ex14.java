package com.java.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
	
	System.out.println("수익을 입력해 주세요");
	System.out.print("금액 : ");
	
	double a = sc.nextDouble();
	
	 if(a<=0) {
		System.out.println("잘못 입력했습니다.");
	}
	
	else if(a>0 && a<=1000) {
		System.out.println("소득세는 "+(a*0.09)+" 입니다.");
	}
	
	else if(a>1000 && a<=4000) {
		System.out.println("소득세는 "+(1000*0.09+0.18*(a-1000))+" 입니다.");
	}
	
	else if(a>4000 && a<=8000) {
		System.out.println("소득세는 "+(1000*0.09+3000*0.18+0.27*(a-4000))+" 입니다.");
	}
	
	else if(a>8000) {
	
		System.out.println("소득세는 "+(1000*0.09+3000*0.18+4000*0.27+0.36*(a-8000))+" 입니다.");
	}
	
	sc.close();
	
	
	}

}
