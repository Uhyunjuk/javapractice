package com.kh.day11.wrapperex;

public class Exam_Wrapper {
// 여러가지 호출해서 쓸수있는 메소드들
	public static void main(String[] args) {
		int num = 0;
//		Integer soo = new Integer(0); // 예전에쓰던방법, 지금은권장x
		Integer su = Integer.valueOf(0);
		
		System.out.println(Character.toLowerCase('A')); // 소문자로 바꿔주는 메소드
		char c1 = '4', c2 = 'F';
		if(Character.isDigit(c1)) { // 
			System.out.println(c1 + "는 숫자");
		}
		if(Character.isAlphabetic(c2)) {
			System.out.println(c2 + "는 영문자");
		}
	}

}
