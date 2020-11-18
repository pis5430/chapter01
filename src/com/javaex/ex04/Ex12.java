package com.javaex.ex04;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int num; //사용자가 입력한값
	int sum=0;
	
	System.out.println("숫자를 입력하세요.[0이면 종료]");

	/*
	do { //무조건 한번은 실행하는 구간 , 조건에 맞으면 반복되는구간 
		num = sc.nextInt();
		sum += num;
		System.out.println("합계: "+sum);
		
	}while(num!=0);
	*/
	
	//다른표현
	
	while(true) {
		num = sc.nextInt();
		sum += num;
		System.out.println("합계: "+sum);
		
		if(num==0) {
			break;
		}
	}
	
	
	System.out.println("종료");
	
	sc.close();

	}

}
