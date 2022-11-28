package com.kh.day03.exercise;

import java.util.Scanner;

public class Exercise_Calculator {

	public static void main(String[] args) {
		// 두개의 정수를 입력받고 연산자를 입력받아서
		// 계산하는 계산기 프로그램을 작성하세요
		// 정수를 입력해주세요 : 11
		// 정수를 한번 더 입력해주세요 : 22
		// 연산자를 입력해주세요(+,-,*,/,%) : %
		// 결과 : 11 % 22 = 11

		Scanner sc = new Scanner(System.in);

		// 1. 정수 하나 입력 받음
		System.out.print("정수를 입력해주세요. :");
		int num1 = sc.nextInt();

		// 2. 정수 하나 더 입력 받음
		System.out.print("정수를 한번 더 입력해주세요. :");
		int num2 = sc.nextInt();

		// 3. 연산자 입력 받음
		System.out.print("연산자를 입력해주세요. (+,-,*,/,%) :");
		char operator = sc.next().charAt(0);

		// 4. 연산자 판별 후 연산 수행 후 결과 저장
		int result = 0;

		if (operator == '+') {
			result = num1 + num2;
		} else if (operator == '-') {
			result = num1 - num2;
		} else if (operator == '*') {
			result = num1 * num2;
		} else if (operator == '/') {
			result = num1 / num2;
		} else if (operator == '%') {
			result = num1 % num2;
		}

		// 5. 결과 출력
		System.out.println("결과 : " + num1 + " " + operator + " " + num2 + " = " + result);

		/*
		 * int result = 0;
		 * 
		 * switch (oper) { 
		 * case "+" : 
		 * result = (num1 + num2); break; case "-" : result =
		 * (num1 - num2); break; case "*" : result = (num1 * num2); break; case "/" :
		 * result = (num1 / num2); break; case "%" : result = (num1 % num2); break; }
		 * if(result != 0) { System.out.print("결과 : " + num1 + oper + num2 + " = " +
		 * result);
		 * 
		 * sc.close(); }
		 */

	}

}
