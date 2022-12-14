package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_While3 {

	public static void main(String[] args) {
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

		//무한반복코드
		while(true) {
			System.out.print("정수 하나 입력 : ");
			input = sc.nextInt();
			// 입력한 값을 더하고
			// 입력한 값이 -1이면 더하지 않고 무한반복 빠져나오기!
			if(input == -1) break;
			sum += input;
		}
		

		System.out.println("입력하신 수의 합은 : " + sum + "입니다.");
	}
}
