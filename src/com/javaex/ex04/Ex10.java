package com.javaex.ex04;

public class Ex10 {

	public static void main(String[] args) {
		
		
		for(int num=1; num<=20; num++) {
			
			
			if(num%2==0 && num%3==0) {
				continue;
				//break;
				//system.out.println("break문") --> break문 다음에 나오면 표시되지 않음
			}
			
			
			System.out.println(num);
		}System.out.println("종료");

	}	

}
