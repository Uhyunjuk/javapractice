package com.kh.day04.exercise;

public class Exercise_For2 {

	public static void main(String[] args) {
		// 1부터 10까지의 덧셈을 표시하고 합도 구하시오
		// 1+2+3+4+5+6+7+8+9+10=55
		
		int sum = 0;
		
		for (int i = 1; i <= 10; i++) { // 1~10까지 반복
			sum += i;
			System.out.print(i); // 더하는 수 출력
			
			if(i<=9) { // 1~9까지는 +출력
				System.out.print("+");
			} else { 
				System.out.print("="); // 10부터는 = 출력하고
				System.out.print(sum); // 덧셈결과출력
			}
		}
	}
}
