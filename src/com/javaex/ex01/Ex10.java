package com.javaex.ex01;

public class Ex10 {

	public static void main(String[] args) {
		
		//논리연산자
		
		
		//&&
		
		System.out.println("&&연산자");
		System.out.println(true&&true); // T&&T  --> T
		System.out.println(true&&false); // T&&F  --> F
		System.out.println(false&&true); // F&&T  --> F
		System.out.println(false&&false); // F&&F  --> F
		
		
		//||
		
		System.out.println("||연산자");
		System.out.println(true||true); // T||T  --> T
		System.out.println(true||false); // T||F  --> T
		System.out.println(false||true); // F||T  --> T
		System.out.println(false||false); // F||F  --> F
		
		
		//응용
		
		int a = 5;
		int b = 7; //코드짤때 변수들은 위쪽에 모아두는 경우가 많음
		
		
		System.out.println("응용"); 
		
		System.out.println((a>b)&&(a<b)); // 5>7 --> f && 5<7 --> t  => f (a<b) 가로는 명확함을 위해 넣어준것
		System.out.println((a>b)&&(a>b)); // 5>7 --> f && 5>7 --> f  => f
		System.out.println((a>b)||(a>b)); // 5>7 --> f && 5<7 --> t  => t
		
		System.out.println("! 연산자"); //반대로 뒤집어라 f-->t t-->f
		System.out.println((a>b));  // 5>7 --> f
		System.out.println(!(a>b)); // 5>7 --> t
		
		//System.out.println(!a >b)); --> 오류 발생 a=5 , 5의 반대는 존재 x
	}

}
