package com.javaex.ex03;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요");
		
		int point = sc.nextInt();
		
		/*
		if((double)(point%3)==0) {
			System.out.println(point + "은(는) 3의 배수 입니다.");
		}else {
			System.out.println(point + "은(는) 3의 배수가 아닙니다.");
		}
		*/
		
		/*
		
		if(point==0) {
			System.out.println(point + "은(는) 0입니다.");
		}else if((double)(point%3)==0){
			System.out.println(point + "은(는) 3의 배수 입니다.");
		}else {
			System.out.println(point + "은(는) 3의 배수가 아닙니다.");
		}
		
		*/
		
		if((double)(point%3)==0 && 0 != point) {
			System.out.println(point + "은(는) 3의 배수 입니다.");
		}else if((point%3)!=0){
			System.out.println(point + "은(는) 3의 배수가 아닙니다.");
		}else {
			System.out.println(point + "은(는) 0입니다.");
		}
		
		sc.close();


	}

}
