package com.javaex.ex01;

public class Ex06 {

	public static void main(String[] args) {
		
		//자동형변환
		
		int num1 = 1;
		float num2 = 1.0f;
		float result = num1 + num2; //num1이 임시적으로 1.0으로 변환된다 (자동형변환)
		
		System.out.println(result);
		
		
		//자동형변환2
		
		long num03 = 121345L;
		float num04 = 1.1F;
		
		
		float result02 = num03 + num04; 
		//double을 넣어도 결과값은 나오지만 더 정확하게 나옴 소수점 1.1 뒷자리까지 나옴
		System.out.println(result02);
		
		
		////////////
		
		//강제형변환
		
		float i = (int)111.242323;  //소수점을 버려도 되는 경우 (111.0 나옴)
		System.out.println(i);
		
		float g = (char)111.1111111;  //실수형을 문자형으로 변환햇을때 (111.0 나옴)
		System.out.println(g);
		
		float ssum = i + g;
		System.out.println(ssum); // g를 문자형으로 변환했는데 실수형과 정수형을 더했더니 222.0 값이 나옴 (더하기성)
		
		
		
		char t = (int)111.1111111;  //문자형을 실수형으로 변환햇을때(16진수로 변환됫을 가능성)
		System.out.println(t);
		
		
		
		int o = 222;
		char y = '명'; 
		
		char sum = 'o' + 'y'; //정수형 + 문자형의 경우 유니코드에 적힌 숫자로 찾음 (문자를 정수로 변환했나?)
		System.out.println(sum);
		
		
		float var01 = 15.1f;
		double var02 = var01;
				
		System.out.println(var01);
		System.out.println(var02);
		
		
		//강제형변환 : 확대변환
		
		byte v01 = 10;
		int v02 = (int)v01;
		System.out.println(v02);
		
		//원본 v01 은 byte의 값을 계속 가지고 잇으면서
		//v02에서 적용될떄만 v01의 값을 임시로 int로 넓혀주는 경우
		
		
		//강제형변환 : 축소변환 (정상)
		int v03 = 10;
		byte v04 = (byte)v03;
		System.out.println(v04);
		
		
		//강제형변환 : 축소변환 (비정상)
		int v05 = 123023290;
		byte v06 = (byte)v05;
		System.out.println(v06);
		
		
		//강제형변환 : 실수 --> 정수 (소수점 이하 없어짐)
	    double v07 = 124.57555;
	    int v08 = (int)v07;
		System.out.println(v08);
		
		
		//강제형변환 : 정수 --> 실수 (실수형으로 보여준다)
	    int v09 = 12345;
	    double v10 = (double)v09;
		System.out.println(v10);
		
		
	}

}
