package com.javaex.ex03;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("과목코드를 입력하세요");
		
		System.out.println("과목코드: ");
		int code = sc.nextInt();
		
		switch(code) {
			case 1 : 
				System.out.println("R101호");
				break;
			case 2 : 
				System.out.println("R102호");
				break;
			case 3 : 
				System.out.println("R103호");
				break;
			case 4 : 
				System.out.println("R104호");
				break;
			default :  //break 안들어 가도 되지만 문법상 넣어줌
				System.out.println("상담원 문의");
				break;
		}
		
		
		
		sc.close();

	}

}
