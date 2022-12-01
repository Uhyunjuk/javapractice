package com.kh.day07.oop;

class StaticSample {
	public int num;
	public void sampleMethod() {
		input = 20;
	}
	public void goodMethod() {
		input = 30;
	}
	public static int input; // 밑에 선언했어도 static써줘서 위에도 input 쓸수있다
	public static void originMethod() {
		input = 5;
	}
}
public class Exam_Static {
	public static void main(String[] args) {
		//new StaticSample().num = 10; // num은 static 없어서 new쓰고 사용해줘야함
		StaticSample.input = 10; // input은 사용가능
		
		StaticSample s1;
		s1 = new StaticSample();
		System.out.println(s1.input);
		s1.originMethod();
		System.out.println(s1.input);
		
		int value = Math.abs(-5);
		System.out.println("값 : " + value);
	}	
}
