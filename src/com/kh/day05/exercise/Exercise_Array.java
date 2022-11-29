package com.kh.day05.exercise;

import java.util.Scanner;

public class Exercise_Array {
	public void exercise1() {
		// 길이가 100인 배열을 선언하고 1부터 100까지의 값을
		// 순서대로 넣어 그 값을 출력하는 코드를 작성하시오.
		int[] nums = new int[100]; // nums[0]~nums[99]
		for (int i = 1; i < nums.length; i++) { 
			nums[i] = i; // 1~99만큼 집어넣고 출력
			System.out.print(nums[i] + " ");
		}
	}

	public void exercise2() {
		// 길이가 5인 String 배열을 선언하고
		// "딸기", "복숭아", "키위", "사과", "바나나"로
		// 초기화 한 후, for문을 활용해서 바나나가 있으면 바나나를 출력해보세요!

		String[] fruits = new String[5];
		// 수작업
		fruits[0] = "딸기";
		fruits[1] = "복숭아";
		fruits[2] = "키위";
		fruits[3] = "사과";
		fruits[4] = "바나나";

		// 편하게하는법 -> 할당과 초기화를 동시에 !
		String[] fruitGoods = { "딸기", "복숭아", "키위", "사과", "바나나" };
		for (int i = 0; i < fruitGoods.length; i++) {
			if (fruitGoods[i] == "복숭아") {
				System.out.println(fruitGoods[i]);
			}
		}
	}

	public void exercise3() {
		// 양의 정수 5개를 입력받아 배열에 저장하고
		// 입력받은 값들의 평균을 구하는 프로그램을 작성하시오.
		int[] arrs = new int[5];
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("양의 정수 5개를 입력하세요. : ");
		for (int i = 0; i < arrs.length; i++) {
			arrs[i] = sc.nextInt();
			sum += arrs[i]; // sum = sum + arrs[i];
		}
		// 평균은 총합 / 데이터개수
		// System.out.println("평균은 " + sum/5 + "입니다.");
		System.out.println("평균은 " + (double)sum / arrs.length + "입니다.");
	}

	public void exercise4() {
		// 양의 정수 5개를 입력받아 배열에 저장하고
		// 제일 큰 수를 출력하는 프로그램을 작성하시오.
		int[] nums = new int[5];
		int max = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("양수 5개를 입력하세요 : ");
		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
			if (nums[i] > max) {
				max = nums[i];
			}
		}
		System.out.println("가장 큰 수는 : " + max + "입니다.");
	}

	public void exercise5() {
		// 사용자에게 주민번호를 입력 받은 후
		// 성별 자리 이후부터 *로 저장되어 출력되도록 프로그램을 작성하시오.
		// 210618-1124399 -> 210618-1******

		Scanner sc = new Scanner(System.in);
		char[] origin = new char[14];
		System.out.print("주민등록번호 입력(-포함) : ");
		String memberNum = sc.next();
		// String으로 입력받은 값을 하나씩 잘라서 origin 문자배열에 넣기
		for (int i = 0; i < origin.length; i++) {
			origin[i] = memberNum.charAt(i);
//			System.out.print(origin[i]);
		}

		// char[] copy = origin; // 얕은 복사 -> 의도한 대로 나오지 않음
		char[] copy = new char[14]; // 깊은 복사의 시작! 새롭게 할당해줘야함
		for (int i = 0; i < origin.length; i++) {
			if (i < 8) {
				copy[i] = origin[i];
			} else {
				copy[i] = '*';

			}
			System.out.print(copy[i]);
		}
		System.out.println();
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i]); // 원본출력
		}

	}

}
