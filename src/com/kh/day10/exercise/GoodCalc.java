package com.kh.day10.exercise;

public class GoodCalc extends Calculator {

	public static void main(String[] args) {
		GoodCalc c = new GoodCalc();
//		int[] a = { 4, 5, 6 };
		System.out.println("Че : " + c.add(1, 2));
		System.out.println("Тї : " + c.substract(3, 2));
		System.out.println("ЦђБе : " + c.average(new int [] {3,4,5}));

	}

	@Override
	public int add(int a, int b) {
		return a + b;

	}

	@Override
	public int substract(int a, int b) {
		return a - b;
	}

	@Override
	public double average(int[] a) {
		double sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum/a.length;
//		double avg = sum / (double) 3;
	}
}
