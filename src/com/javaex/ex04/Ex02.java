package com.javaex.ex04;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		
		
		System.out.println("단을 입력해 주세요");
		System.out.print("단: ");
		
		int dan = sc.nextInt();
		int i = 0; // 횟수의 의미
		int num = 1; // 보이는 숫자의 의미
		int all = dan*num;
		
		// num = 1; 으로 두고 조건식을 num<10 을 정할경우 횟수의 의미와 보이는 숫자의 의미를 모두 가질수 잇음 
		
		
		while(i<9) {  //i<==9 , i<10 초기값이 1일 경우
			System.out.println(dan + "*" + num + "=" + all);
			
			
			i++;
			num++;
		}
		
		
		sc.close();
	}

}
