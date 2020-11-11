package com.javaex.ex02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //연결해주기 --> 경로도 확인해주기
		
		System.out.println("이름을 입력해주세요");
		System.out.print("이름 : ");
		
		
		String name = sc.nextLine(); //실제로 텍스트를 받아오기 위한부분
		
		System.out.println("당신의 이름은 "+ name +" 입니다.");
		
		
		sc.close();
		

	}

}
