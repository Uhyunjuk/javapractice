package com.kh.day07.student;

import java.util.Scanner;

public class StudentRun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentFunction sFunc = new StudentFunction();
		End: while (true) {
			int input = sFunc.printMenu();
			switch (input) {
			case 1:
				sFunc.printMenu();
				break;
			case 2:
				sFunc.printScore();
				break;
			case 3:
				sFunc.goodByeMsg();
				break End;
			default:
				sFunc.exceptionMsg();
				break;
			}
		}
	}

}
