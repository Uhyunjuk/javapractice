package com.kh.day10.wrapperex;

public class Exam_Wrapper {
	public static void main(String [] args) {
		// Wrapper 객체로부터 기본 타입 값 알아내기
		Integer i = Integer.valueOf(1234); // 객체를 만들어서 사용하다가
		int e = i.intValue(); // 기본형으로도 변환가능
		Integer f = null;
		// int m = null;
		
		Character c = Character.valueOf('c');
		char che = c.charValue();
		
		Double d = Double.valueOf(3.14);
		double dd = d.doubleValue();
		
		// 문자열을 기본 데이터 타입(int, boolean, double)으로 변환
//		int num = "123";
		int num = Integer.parseInt("123");
		System.out.println("변환된 값 : " + num);
		
//		boolean b = "true";
		boolean b = Boolean.parseBoolean("true");
		System.out.println("변환된 값 : " + b);
		
//		double f = "3.14";
		double fNum = Double.parseDouble("3.14");
		System.out.println("변환된 값 : " + fNum);
		
		// 기본 데이터타입(int, double, char)을 문자열로 변환
		String data1 = Integer.toString(123);
		String data2 = Integer.toHexString(123); // 16진수로 변환
		String data3 = Double.toString(3.14);
		String data4 = Character.toString('a');
		String data5 = Boolean.toString(true);
		
		System.out.println(data2);
	}
}
