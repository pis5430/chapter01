package com.javaex.ex05;

public class Ex05 {

	public static void main(String[] args) {
	int num = 3;
	int num2 = num;
	
	System.out.println("num: " + num);
	System.out.println("num2: "+ num2);
	
	num2=7;
	System.out.println("num2 자체값을 num2 = 7; 으로 재선언 ");
	
	System.out.println("num2 변경후: "+ num2);
	
	num = 100;
	
	System.out.println("num 자체값을 num = 100; 으로 재선언 ");	
	System.out.println("num: " + num);

	}

}
