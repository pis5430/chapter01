package com.javaex.ex01;

public class Ex04 {
	
	public static void main(String[] args) {
		
		char ch01 = 'A'; //무조건 한글자 (두글자 이상은 에러남)
		System.out.println(ch01);

		char ch02 = '한';
		System.out.println(ch02);
		
		//비교
		
		char ch03 = 75; //코드표에 잇는 숫자에 맞는 글자 (모든 유니코드 문자)
 		int ch04 = 75;
		char ch05 = 6;
		char ch06 = '6';
		
		System.out.println(ch03);
		System.out.println(ch04);
		System.out.println(ch05);
		System.out.println(ch06);
		
		
		//문자열
		
		String str = "안녕하세요"; 
		// 한글자는 작은따음표'' , 두글자 이상은 큰따옴표 ""
		
		System.out.println(str);
		
		char str01 = '안';
		String str02 = "안";
		
		System.out.println(str01);
		System.out.println(str02);
		
		System.out.println(); //sysout + ctrl + 스페이스 = 자동완성
		
		
	
	}
	

}
