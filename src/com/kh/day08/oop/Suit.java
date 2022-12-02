package com.kh.day08.oop;

public class Suit {
	private int size;
	private String brand;
	private int price;

	public Suit(int size) {
		this(size, "Hazzys");
		System.out.println("Suit(int) ȣ��!1"); //1
	}

	public Suit(int size, String brand) {
		this(size, brand, 100000);
		System.out.println("Suit(int, String) ȣ��!2"); //2
	}

	public Suit(int size, String brand, int price) {
		this.size = size;
		this.brand = brand;
		this.price = price;
		System.out.println("Suit(int, String, int) ȣ��!3"); //3
	}
}
// ����
// 8-> 9-> 13 -> 16-> 20(3��)-> 13�� ���� -> 14(2��) -> 9�� ����-> 10(1��)
// ���� 14���� ���ٸ� 15����µǰ� 10�� ��µ�