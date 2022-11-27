package com.kh.day03.exscanner;

import java.util.Scanner;

public class TestScanner {
	public static void main(String[] args) {
		// indent 정리 : ctrl + shift + f
		Scanner sc = new Scanner(System.in);

		System.out.print("이름을 입력해주세요.");
		String name = sc.next(); 

		System.out.print("태어난 월을 입력해주세요.");
		int month = sc.nextInt();

		System.out.print("키를 입력해주세요.");
		double height = sc.nextDouble();

		System.out.print("성별을 입력해주세요.");
		char gender = sc.next().charAt(0);

		System.out.print("주소를 입력해주세요.");
		sc.nextLine(); // 엔터 제거!!
		String address = sc.nextLine(); // 주소같이 긴건 nextLine사용
			// 성별 입력하고 엔터누르면 넥스트라인이 같이 먹음
			// 넥스트라인 위에다가 한번더 써줘야함

		System.out.println("이름은 " + name + "입니다.");
		System.out.println("태어난 월은 " + month + "월 입니다.");
		System.out.println("키는 " + height + "cm 입니다.");
		System.out.println("성별은 " + gender + "자 입니다.");
		System.out.println("주소는 " + address + "입니다.");

		sc.close(); // 스캐너닫기

//		이름을 입력해주세요. // next()
//		민봉식
//		태어난 월을 입력해주세요.
//		9
//		키를 입력해주세요.
//		180
//		성별을 입력해주세요.
//		남
//		주소를 입력해주세요. // nextLine()
//		서울시 종로구

//		이름은 민봉식입니다.
//		태어난 월은 9입니다.
//		키는 180.0입니다.
//		성별은남입니다.
//		주소는 서울시 종로구입니다.

	}
}
