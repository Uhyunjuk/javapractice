package com.kh.day04.loop;
//중첩for문으로 구구단 출력하기 

public class Exam_ForDouble {
	public static void main(String[] args) {
		for(int i = 1; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
		}
	}

}

/* 
 * for(int j = 2; i < 10; i++) {
	for(int i = 1; i < 10; i++)
	System.out.println(j + " * " + i + " = " + j*i);
}
*/