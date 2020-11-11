package com.javaex.ex02;

public class Ex01 {

	public static void main(String[] args) {
		
	int i = 2345;
		
	double d = 3.14;
	
	String str = "굿모닝";
	String str2 = " 랑 ";
	
	char c ='한';
	String s = "한"; 
	
	String name = "표이슬";
	
	System.out.println("안녕하세요");
	System.out.println(str);
	
	
	//print 명령어는 줄바꿈 안함
	System.out.print("안녕");
	System.out.print("하세요!");
	System.out.println("11/11");

	System.out.println(2+5);
	System.out.println(i+i);
	
	System.out.println(i+d);
	double result = i +d;
	System.out.println(result);
	
	
	// 더하기만 가능
	System.out.println(str+str);
	System.out.println(str+str+str+i);
	System.out.println(str+d+str+i);
	
	String resilt01 = str+d;
	System.out.println(result+01);
	
	//굿모닝 랑 2345 출력을 원할 경우
	System.out.println(str + " 랑 " +i);
	System.out.println(str + str2 +i);
	
	//제 이름은 표이슬 입니다.
	System.out.println("제 이름은 " + name + " 입니다."); // 혼자
	
	//제 이름은 표이슬 입니다.
	System.out.println(name); // 메모리 공간의 이름
	System.out.println("name");  //name 문자열
	System.out.println("제 이름은 " + name + " 입니다."); // 혼자

	
	//char --> +로 인해서 글자가 아닌 숫자로 인식해서 더해버림
	System.out.println(c);
	System.out.println(c+0);
	System.out.println(c+c);
	//char + String 이라서 문자열로 판별
	System.out.println(c+s);
	
	//안녕하세요
	System.out.println("안녕하세요");
	//안녕"하"세요
	System.out.println("안녕\"하\"세요"); // \" 역슬래시와 같이 쓰면 큰따옴표만 인식
	//안녕\하\세요
	System.out.println("안녕\\하\\세요"); // \두번 입력하면 하나로 보임
	//안녕    하세요
	System.out.println("안녕\t하세요"); // \t 띄워쓰기
	
	//줄바꿈
	System.out.println("안녕\n하\n세요"); // \n 줄바꿈
	
	//줄바꿈 같은 표현
	System.out.println("안녕");
	System.out.println("하");
	System.out.println("세요");
	
	
	}

}
