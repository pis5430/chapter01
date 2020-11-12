package com.javaex.ex03;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요");
		
		int point = sc.nextInt();
		
		/*  0을 입력햇을때도 배수라고 나오는 문제점이 있음
		if((double)(point%3)==0) {
			System.out.println(point + "은(는) 3의 배수 입니다.");
		}else {
			System.out.println(point + "은(는) 3의 배수가 아닙니다.");
		}
		*/
		
		/* 0부터 빼면 나머지를 순서대로 분류할수 있음
		
		if(point==0) {
			System.out.println(point + "은(는) 0입니다.");
		}else if((double)(point%3)==0){
			System.out.println(point + "은(는) 3의 배수 입니다.");
		}else {
			System.out.println(point + "은(는) 3의 배수가 아닙니다.");
		}
		
		*/
		
		//0 값을 관계 연산자로 걸러준다
		
		if((double)(point%3)==0 && 0 != point) { // point가 3의 배수인 경우와 point 입력값 자체가 0이 아닌경우 를  모두 충족  --> 그래야 0값이 내려감
			System.out.println(point + "은(는) 3의 배수 입니다.");
		}else if((point%3)!=0){
			System.out.println(point + "은(는) 3의 배수가 아닙니다.");
		}else {
			System.out.println(point + "은(는) 0입니다.");
		}
		
		sc.close();


	}

}
