package com.kh.day04.loop;

import java.util.Scanner;

public class Exam_DoWhile { // do-while은 실행먼저!

	public static void main(String[] args) {
		// 입력한 수가 -1이 될때까지 ~~~ 하시오.
		Scanner sc = new Scanner(System.in);
		int num = 0;
		do {
			System.out.print("정수 입력 : ");
			num = sc.nextInt();
		} while(num != -1);
	}

}
