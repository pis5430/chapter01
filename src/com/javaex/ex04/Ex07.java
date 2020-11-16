package com.javaex.ex04;

public class Ex07 {

	public static void main(String[] args) {
		
		
		
		String t="*";
		int i;
		int j;
		
		
		for(i=1; i<=6; i++ ) { 
			
			for(j=1; j<=i; j++) { //i=1 , j=1 , 1<=1 , 1++ --> 한번 반복
				
				
				System.out.print(i + t + j); 
				// System.out.print(j+"*"); 숫자 넣어서 반복되는 구간 확인, 증감값 확인
			}
			
			System.out.println(" "); //줄바꿈
		}
		


	}

}
