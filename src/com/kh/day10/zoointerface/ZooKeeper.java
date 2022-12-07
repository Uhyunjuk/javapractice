package com.kh.day10.zoointerface;

public class ZooKeeper {
	public void feed() {
		System.out.println("feed meat");
	}
	
	public void feed(Predator predator) {
		System.out.println("feed " + predator.animalFood());
	}
	
	
//	public void feed(Tiger tiger) {
//		System.out.println("특식을 줍니다.");
//	}
//	public void feed(Lion lion) {
//		System.out.println("가젤고기를 줍니다.");
//	}
//	public void feed(Bear bear) {
//		System.out.println("연어를 줍니다.");
//	}
}
