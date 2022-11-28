package com.kh.day04.exercise;

public class Exercise_PrintSample {

	public static void main(String[] args) {
		// 정수 + 문자열 -> 문자열
		System.out.println(1 + "1");
		// "1" + "1" =  문자열 "11"로 나오는것임
		
		// 문자 + 문자 -> 문자
		System.out.println('1' + '1');
		// 49 + 49 = 98이 되어버린다(문자 아스키코드 계산)
		
		// 정수 + 정수 + 문자열 + 정수 -> 문자열!
		// 중간에 문자열이 있으면 최종적으로 문자열이 된다
		System.out.println(10 + 20 + "hello" + 10);
		
		//printf에 대해서 알아보자
		//println, print -> 줄바꿈의 차이
		System.out.print("정수 입력 : "); // 바로 옆에 입력받음
		System.out.println("정수 입력 : "); // 줄바꾸고 입력받음
		System.out.printf("정수 출력 : %d \n", 1); // ,뒤에 출력하고싶은거 적기
		System.out.printf("문자열 출력 : %s", "Hello World");
		// 정수는 %d, 문자열은 %s, 줄바꿈:\n
	}
}
