package com.javaex.ex03;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("월을 입력하세요");
		
		int month = sc.nextInt();
		int day_28 = 28;
		int day_30 = 30;
		int day_31 = 31;
		
		switch(month){
			case 4 : //브레이크 없는 스위치 문은 권장하지 않음
			case 6 :
			case 9 :
			case 11 :
				System.out.println(day_30+"일 입니다.");
				break;
			case 2 :
				System.out.println(day_28+"일 입니다.");
				break;
			case 1 :
			case 3 :
			case 5 :
			case 7 :
			case 8 :
			case 10 :
			case 12 :
				System.out.println(day_31+"일 입니다.");
				break;

			default :
				System.out.println("해당월은 존재하지 않습니다.");
				break;
				
		}
		
		
		
		
		sc.close();

	}

}
