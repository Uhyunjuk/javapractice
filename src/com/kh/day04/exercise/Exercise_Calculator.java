package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("정수 하나 더 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("연산자 입력(+,-,*,/,%) : ");
		char operator = sc.next().charAt(0);
		int result = 0;
		
		switch (operator) {
			case '+' : 
				result = num1 + num2;
				break;
			case '-' : 
				result = num1 - num2;
				break; 
			case '*' : 
				result = num1 * num2;
				break; 
			case '/' : 
				result = num1 / num2;
				break; 
			case '%' : 
				result = num1 % num2;
				break; 
		}
		
		System.out.println("결과 : " + num1 + " " + operator + " " + num2 + " = " + result);
		// 출력은 switch문 밖에다가 해주기(어차피 break 뒤에는 적어도 실행되지않는다)

	}

}
