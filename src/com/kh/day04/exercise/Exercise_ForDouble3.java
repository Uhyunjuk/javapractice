package com.kh.day04.exercise;

public class Exercise_ForDouble3 {

	public static void main(String[] args) {
//		*
//		**
//		***
//		****
//		*****
//		******
//		*******
//		********
//		*********

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j <= i; j++) { 	// �� j <= i ��
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
