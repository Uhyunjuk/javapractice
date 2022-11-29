package com.kh.day05.exercise;

import java.util.Scanner;

public class Exercise_While {
	public void exercise1() {
		// while 문을 이용하여 1 ~ 100 사이의 홀수의 합을 출력하시오.
		int i = 1;
		int sum = 0;

		while (i < 100) {
			sum = sum + i;
			// i++;
			i += 2; // 복합대입연산자
			// i = i * 2; -> i *= 2;

		}
		System.out.println("합계 : " + sum);
	}

	public void exercise2() {
		// 정수를 하나 입력받아서 그 수가 1 ~ 9사이의 수일때만
		// 그 수의 구구단을 출력하세요
		// 단, 조건이 맞지 않으면 "1 ~ 9사이의 양수를 입력하여야 합니다."를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력해주세요 : ");
		int num = sc.nextInt();
		if ((num >= 1) && (num <= 9)) {
			int i = 1;
			while (i <= 9) {
				System.out.println(num + " * " + i + " = " + num * i);
				i++; // ☆☆☆중요☆☆☆
			}
		} else {
			System.out.println("1 ~ 9사이의 양수를 입력하여야 합니다.");
		}
	}

	private void exercise3() {
//		while문을 이용하여 -1이 입력될 때까지 정수를 입력받고 
//		-1이 입력되면 입력한 수의 합을 출력하시오.
//		정수 하나 입력 : 3
//		정수 하나 입력 : 4
//		정수 하나 입력 : 7
//		정수 하나 입력 : -1
//		입력하신 수의 합은 : 14

		Scanner sc = new Scanner(System.in);
		int input = 0;
		int sum = 0;

//		while (input != -1) { 	// input이 -1이 아니면 true = -1이 입력될때까지 돌아감!
//		System.out.print("정수 하나 입력 : ");
//		input = sc.nextInt();
////		sum += input; 	// sum = sum + input
//		if(input != -1) {
//			sum += input;
//		}
//	}

		// 무한반복코드
		while (true) {
			System.out.print("정수 하나 입력 : ");
			input = sc.nextInt();
			// 입력한 값을 더하고
			// 입력한 값이 -1이면 더하지 않고 무한반복 빠져나오기!
			if (input == -1)
				break;
			sum += input;
		}

		System.out.println("입력하신 수의 합은 : " + sum + "입니다.");
	}
}
