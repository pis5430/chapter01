package com.javaex.ex01;

public class Ex01 {
	
	public static void main(String[] args) {
		
	int myAge ;
	myAge = 25;
	System.out.println(myAge);
	
	myAge ++;
	
	System.out.println(myAge);
	
	
	//정수형
	//자료형 (int 를 정확하게 써야한다)
	
	int var01 = 3;
	double var02 = -3.4;
	
	System.out.println(var01);
	System.out.println(var02);
	
	//메모리 크기 확인
	
	int var03 = 12345678;
	byte var04 = 123;
	short var05 = 12345;
	long var06 = 12345678;
	
	System.out.println(var03);
	
	//long형
	int var07 = 2147483647; //int의 범위보다 큰값(2147483648~) , 2147483647 보다 크면 못씀
	
	long var08 = 2147483648L; //long형에 대입이 안됨???---> L기호를 붙여야함
	
	long var09 = 2147483647L; 
	//int의 범위안에 들어가는 값은 L안붙여도 됨 (헷갈릴수 잇으면 무조건 붙여도됨)
	}

}
