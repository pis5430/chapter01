package ex06;

public class Ex01 {

	public static void main(String[] args) {
		
		/*
		for(int i =0; i<args.length; i++) {
			
			System.out.println(args[i]);
			
		}
		*/
		
		if("-version".equals(args[0])) {
			System.out.println("ver 1.1, pyo i seul");
		} //cmd 에서는 확인 가능한데 출력은 안됨?
		

	}

}
