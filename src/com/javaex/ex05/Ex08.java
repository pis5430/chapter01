package com.javaex.ex05;

public class Ex08 {

	public static void main(String[] args) {
		
		int[] arrA = new int[] {11,20,305};
		int[] arrB = new int[] {10,25,30};
		
		
		//내가푼거
			
		if(arrA==arrB) {
			//두배열의 값이 같으면 공백
			  
		}else if(arrA.length!=arrB.length){
			System.out.println("두 배열의 크기가 다릅니다");
		}else{
				
			for(int i = 0; i<arrA.length; i++) {
				if(arrA[i]!=arrB[i]) {
					System.out.println(i + "번째 값이 다릅니다.");}
			}
		}
		
		
		
		// 선생님이 푼것
		
//		if (arrA.length == arrA.length) {
			//세부비교
			
//			for(int i=0; i<arrA.length; i++) {
				
//				if(arrA[i]!=arrB[i]) {
//					System.out.println(i+"번쨰 값이 다릅니다.");
//				}
//			}
//		}else {
//			System.out.println("배열의 크기가 다릅니다.");
//		}

	}

}
