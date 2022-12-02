package com.kh.day08.oop;

public class Suit {
	private int size;
	private String brand;
	private int price;

	public Suit(int size) {
		this(size, "Hazzys");
		System.out.println("Suit(int) 호출!1"); //1
	}

	public Suit(int size, String brand) {
		this(size, brand, 100000);
		System.out.println("Suit(int, String) 호출!2"); //2
	}

	public Suit(int size, String brand, int price) {
		this.size = size;
		this.brand = brand;
		this.price = price;
		System.out.println("Suit(int, String, int) 호출!3"); //3
	}
}
// 순서
// 8-> 9-> 13 -> 16-> 20(3번)-> 13이 끝남 -> 14(2번) -> 9가 끝남-> 10(1번)
// 만약 14번이 없다면 15가출력되고 10이 출력됨