package com.javaex.ex04;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("입력하는 숫자범위의 합을 구하시오");
		System.out.print("숫자: ");
		int num = sc.nextInt();
	
		int sum = 0;
		
		for(int i=1; i<=num; i++ ) {  // Scanner를 사용하여 입력값이 조건식이 되게 하여 멈추게함
			
			sum=sum+i; //검증해볼것
			
			//1 = 0 + 1
			//3 = 1 + 2
			//6 = 3 + 3
			//10 = 6 + 4 ...
			
			System.out.println(i +  "까지의 합은" + sum); //이 println값이 없으면 아래 결과값만 출력됨 1번문제

		}
		
		System.out.println("1부터 " + num +"까지의 정수의 합은 " + sum + " 입니다.");
		
		sc.close();

	}

}
