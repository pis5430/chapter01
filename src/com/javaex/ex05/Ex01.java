package com.javaex.ex05;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*  //왜 숫자가 중복되지?
		
		int num = (int)(Math.random()*45)+1;
		int i;
		
		
		for(i=1; i<=5; i++) {  //for문으로할 경우는 같은수만 중복됨
			
			System.out.print(no+i); (변수값이 숫자일때 정렬안됨)
			//-->그래서 배열사용
		}
		*/
		
		
		//강사님 풀이
		
		int n01, n02, n03, n04, n05, n06;
		
		n01 = (int)(Math.random()*45)+1;
		n02 = (int)(Math.random()*45)+1;
		n03 = (int)(Math.random()*45)+1;
		n04 = (int)(Math.random()*45)+1;
		n05 = (int)(Math.random()*45)+1;
		n06 = (int)(Math.random()*45)+1;
		
			
			System.out.print(n01 + "  ");
			System.out.print(n02 + "  ");
			System.out.print(n03 + "  ");
			System.out.print(n04 + "  ");
			System.out.print(n05 + "  ");
			System.out.print(n06 + "  ");
		

	}

}
