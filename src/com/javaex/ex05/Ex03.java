package com.javaex.ex05;

public class Ex03 {

	public static void main(String[] args) {
		
		//로또번호
		
		int[] lottoNums = new int[6]; //~개 갯수의 개념
		
		//int[] lottoNums = new int[] {1,2,3}; 바로 데이터 넣는법 축수버전
		//int[] lottoNums = {1,2,3}; 바로 데이터 넣는법 더한 축소버전 (나중에 보기 어려울수 있음- 익숙해진뒤 사용권장)
		
		
	/*	lottoNums[0] = (int)(Math.random()*45)+1; //배열은 무조건 0번부터시작
		lottoNums[1] = (int)(Math.random()*45)+1; 
		lottoNums[2] = (int)(Math.random()*45)+1; 
		lottoNums[3] = (int)(Math.random()*45)+1; 
		lottoNums[4] = (int)(Math.random()*45)+1;  //자료형이 안맞으면 못들어감 (자료형/실수형/정수형)
		lottoNums[5] = (int)(Math.random()*45)+1; 
		lottoNums[6] = (int)(Math.random()*45)+1; 
		lottoNums[7] = (int)(Math.random()*45)+1; */ //for형으로 대체 가능 [i]값으로
		
		
		//System.out.println(lottoNums); 변수 옆에 [] 넣어줘야함
		
		int i;
		
		
		//배열을 사용할 경우
		for(i=0; i<lottoNums.length; i++) {  //조건식에 변수.length를 넣을 경우 new int[6];의 숫자로 표시된다
			lottoNums[i] = (int)(Math.random()*45)+1;
		}
		
		
		for(i=0; i<lottoNums.length; i++) {  
			System.out.print(lottoNums[i]+"  "); 
		}
		
		
		

	}

}
