package com.javaex.ex01;

public class Ex08 {

	public static void main(String[] args) {
		
		//대입연산자
		int a = 7;
		int b = 2;
		
		
		//산술연산자
		System.out.println("산술연산자");
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(b-a);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b); // 7 나누기 2 = 3 . . .나머지 1
		System.out.println("==========");
		
		System.out.println(7.0/2.0);
		System.out.println(7.0%2.0);
		System.out.println("==========");
		
		//부호연산자
		
		int var01 = -3;

		
		System.out.println(var01);
		System.out.println(-var01);
		System.out.println(+var01);
		
		//증감연산자 (a=7 , b=2)
		
		int var001 = 2147483647;
		
		System.out.println(a);
		System.out.println(++a); //실제 실수 값이 변경된다 1이 증가
		System.out.println(a);
		
		System.out.println("====b======");	
		
		System.out.println(b);
		System.out.println(--b);  //실제 실수 값이 변경된다 1이 감소
		System.out.println(b);
		
		System.out.println("==========");	
		
		System.out.println(a);
		System.out.println(a++);  // 증가 이전 값 대입 --> 이후 a값 출력하면 1 증가
		System.out.println(a); 
	
		System.out.println("====b======");	
		
		System.out.println(b);
		System.out.println(b--);  // 증가 이전 값 대입 --> 이후 b값 출력하면 1 감소
		System.out.println(b);
		
		b--;  //출력되진 않지만 연산됨 (--b, b-- 값 같음)
			
		System.out.println("==========");	
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(var001++);
		System.out.println(var001);
		
		System.out.println(var001++);
		System.out.println(var001);
		
		
		System.out.println(++var001);
		System.out.println(var001);
		
		System.out.println("==========");		
		
		

	}

}
