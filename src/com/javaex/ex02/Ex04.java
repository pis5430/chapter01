package com.javaex.ex02;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
	
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력해주세요");
		System.out.print("이름 : ");
		
		String name = sc.nextLine();
		
		System.out.println("당신의 이름은 "+ name + "입니다.");
		
		System.out.println("나이를 입력해주세요");
		System.out.print("나이 : ");
		
		int num = sc.nextInt();
		
		System.out.println("당신의 이름은 "+ name + " 나이는 " + num + " 입니다.");
		sc.close();
		
		*/
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요");
		System.out.print("나이 : ");
		
		int num = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("이름을 입력해주세요");
		System.out.print("이름 : ");
		
		String name = sc.nextLine();
		
		System.out.println("당신의 이름은 "+ name + " 나이는 " + num + " 입니다.");
		sc.close();
		
		
		//버그생김 (숫자를 입력받고 문자를 입력받는 경우에 생김)
		//	sc.nextLine(); 를 숫자열 다음 열에 써줌 아무의미 없는 개행문자를 받아 처리
		
		
		

	}

}
