package com.javaex.ex04;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			/*
			
			while(true) {
				
				System.out.println("숫자를 입력하세요");
				int num = sc.nextInt();
				
				if(num%3==0 && num!=0) { //num값이 0일 경우는 빼줘야함
					
					System.out.println("3의 배수입니다.");
				}else if(num!=0){
					System.out.println("3의 배수가 아닙니다.");
					
				}else {
					System.out.println("종료");
					break;
				}
				*/
			
			boolean action = true; //true 값을 false로 바꿔서 while문 안으로 들어갈수 없게 끊어줌
									// 눈으로 보이는 결과는 위의 결과와 다르지 않음
			
			
			while(action) {
				
				System.out.println("숫자를 입력하세요");
				int num = sc.nextInt();
				
				if(num%3==0 && num!=0) { //num값이 0일 경우는 빼줘야함
					
					System.out.println("3의 배수입니다.");
				}else if(num!=0){
					System.out.println("3의 배수가 아닙니다.");
					
				}else {
					System.out.println("종료");
					action=false;
				}
				
			}
			
			
			
			
			
			
			sc.close();
		
		

	}

}
