package com.javaex.ex01;

public class Ex02 {
	
	public static void main(String[] args) {
		
		//실수형
		
		double var01 = 3.14;
		System.out.println(var01);
		
		float var02 = 3.14f; //정수 뒤에 f값을 넣어줘야함
		System.out.println(var02);
		
		//double형이 좀 더 정확
		
		double var03;
		float var04;
		
		var03 = 0.1234567890123456789;
		var04 = 0.1234567890123456789f;
		
		
		System.out.println(var03);
		System.out.println(var04);
		
		//변수표현
		
		int var11;
		
		var11 = 25;
		System.out.println(var11);
		
		int var12 = 25;
		System.out.println(var12);
		
	
		//////////
		
		//변수선언 --> 값대입
		
		/*
		int v01; //변수부터 잡기
	    int v02;
	    int v03;
	    */
		
		int v01, v02, v03;
	  
	    
	    v01 = 23;
	    v02 = 24;
	    v03 = 25;
	    
		System.out.println(v01);
		System.out.println(v02);
		System.out.println(v03);
	    
	    //변수선언 + 값대입
	    //v01 = 3; --> 기존 v01값을 변경
	    //int v01 = 3 --> 변수명 v01이 2개가 되서 오류
	    
		/*
	    int v04 =3;
	    int v05 =4;
	    int v06 =5;
	   */
		
		int v04 = 3, v05 = 4, v06 = 5;
		
		System.out.println(v04);
		System.out.println(v05);
		System.out.println(v06);
	    
	    
	    
		
	}

}
