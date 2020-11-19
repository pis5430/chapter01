package com.javaex.ex05;

public class Ex02 {

	public static void main(String[] args) {
		
		
		
		
		int[] intArray = new int[5];
		
		intArray[0] = 3; //배열은 무조건 0번부터시작
		intArray[1] = 6; 
		intArray[2] = 9; 
		intArray[3] = 12; 
		intArray[4] = 55;  //자료형이 안맞으면 못들어감 (자료형/실수형/정수형)
 		
		System.out.println(intArray[0]);
		System.out.println(intArray[1]);
		System.out.println(intArray[2]);
		System.out.println(intArray[3]);
		System.out.println(intArray[4]);
		
		for(int i=0; i<=4; i++) {
			System.out.println(intArray[i]);
		}
		
	}

}
