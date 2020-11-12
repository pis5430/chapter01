package com.javaex.ex03;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.println("숫자를 입력하세요");
		System.out.print("숫자: ");
		
		int num = sc.nextInt();
		int even_num = num%2; //나머지가 0이면 짝수 1이면 홀수
	

		if(even_num==0 && 0 != num) {
			System.out.println("짝수");
		}else if(even_num==1) {
			System.out.println("홀수");			
		}else if(num<0) {
			System.out.println("음수");			
		}else{
			System.out.println("0");			
		}
		*/
		
		
		
		// if안에 if가 들어가는 방법
		System.out.println("숫자를 입력하세요");
		System.out.print("숫자: ");
		
		int num = sc.nextInt();
		
		int even_num = num%2; //나머지가 0이면 짝수 1이면 홀수
		

		if(num>0) {
			if(even_num==0) {
				System.out.println("짝수");
			}else {
				System.out.println("홀수");				
			}

		}else if(num<0){
			System.out.println("음수");	
		}else {
			System.out.println("0");	
		}
		
		
		
		
		
		sc.close();

	}

}
