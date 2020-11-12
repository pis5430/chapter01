package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		/*  조건문 연습문제 -1
		System.out.print("근무시간: ");
		
		int time = sc.nextInt();
		
		int over_time = time-8; //초과시간
		
		int over_time_p = (time-8)*12000; //초과시간*12000
		int low_time_p = (time - over_time)*10000;//8시간 미만 근무시간 * 10000
		
		int all_time = over_time_p+low_time_p; //8시간 이하 근무시간 시급 + 8시간 초과 근무시간 시급 
		
		if(time<=8) {
			System.out.println("임금은 "+(time*10000)+"원 입니다.");
		}else if(time>8){
			System.out.println("임금은 "+ all_time + "원 입니다.");
		}
		
		
		*/
		
		/*  조건문 연습문제 - 2 8시간 초과시 시간당 1.5배
		System.out.print("근무시간: ");
		
		int time = sc.nextInt();
		
		int over_time = time-8; //초과시간
		
		double over_time_p = (time-8)*(10000*1.5); //초과시간*12000
		int low_time_p = (time - over_time)*10000;//8시간 미만 근무시간 * 10000
		
		double all_time = over_time_p+low_time_p; //8시간 이하 근무시간 시급 + 8시간 초과 근무시간 시급 
		
		if(time<=8) {
			System.out.println("임금은 "+(time*10000)+"원 입니다.");
		}else if(time>8){
			System.out.println("임금은 "+ (int)all_time + "원 입니다.");
		}
		
		*/
		
		//조건문 연습문제 1 - 풀이
		
		/*
		int pay; //급여 
		
		System.out.print("근무시간: ");
		
		int time = sc.nextInt();
		
		if(time>8) {
			pay = 8*10000+(time-8)*12000;
			
		}else {
			pay = time*10000;
		}
		*/
		
		
		//조건문 연습문제 2 -풀이
		
		int pay; //급여
		int unit = 10000; //8시간 미만 시급
		
		System.out.print("근무시간: ");
		
		int time = sc.nextInt();
		
		if(time>8) {
			pay = 8*unit+(time-8)*(int)(unit*1.5);
			
		}else {
			pay = time*unit;
		}
		
		System.out.println("임금은 " + pay + "입니다.");
		
		sc.close();

	}

}
