package com.javaex.ex04;

public class Ex11 {

	public static void main(String[] args) {
		
		
		/*
		//continue문 사용
		for(int num=1; num<=20; num++) {
			
			
			if(num%2==0 || num%3==0) {
				continue;
			}
			
			
			System.out.println(num);
		*/
		
		/*
		//if문 사용
		for(int num=1; num<=20; num++) {
			
			
			if(num%2==0 || num%3==0) {
				
			}else {
				System.out.println(num);
			}
		*/
		
		
		//그외 다른 표현
		for(int num=1; num<=20; num++) {
			
			
			if(!(num%2==0 || num%3==0)) { // !는 부정의 의미 ~이 아니면
				System.out.println(num);
				
			}
			
		}System.out.println("종료");

	}

}
