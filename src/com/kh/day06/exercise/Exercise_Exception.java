package com.kh.day06.exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_Exception {
	public void practice1() {
//		for(;;) {}
//		while(true) {}
		while (true) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.print("정수 하나 입력해주세요 : ");
				int num1 = sc.nextInt();
				System.out.print("정수 하나 더 입력해주세요 : ");
				int num2 = sc.nextInt();
				System.out.println("나눠드릴게요 ^^");
				int result = num1 / num2; // 여기서 문제가 생기면
				System.out.println("몫은 " + result + "입니다~");
				break;
			} catch (ArithmeticException e) { // 이렇게 나오게 한다.
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
			}

		}

	}

	public void practice2() {
//		정수 3개를 입력하세요
//		0>>5
//		1>>R
//		정수가 아닙니다. 다시 입력하세요!
//		1>>4
//		2>>6
//		합은 15

		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int num = 0; // for문과 try문에서도 쓸 수 있게 전역변수로 설정해준다.
		System.out.println("정수 3개를 입력하세요.");
		for (int i = 0; i < 3; i++) {
			System.out.print(i + ">>");
			try {
				num = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("정수가 아닙니다. 다시 입력하세요!");
				sc.next(); // 잘못 입력된 값 제거 (변수에다가 저장안했으니까 그냥사라짐)
				i--; // 1로 다시 가도록 -1해줌, i++를 만나서 1이 되기위해 (다시 for문으로가서 숫자 받게함)
				continue; // 밑에있는코드(sum+=num;)를 스킵하도록함
			}
			sum += num;
		}
		System.out.println("합은 " + sum);
	}

}
