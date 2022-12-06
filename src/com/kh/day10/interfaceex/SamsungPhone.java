package com.kh.day10.interfaceex;

public class SamsungPhone implements PhoneInterface { // 인터페이스 구현
// interface에 만든 추상메소드들을 여기다가 모두 구현

	@Override
	public void sendCall() {
		System.out.println("띠리리리링");
	}

	@Override
	public void receiveCall() {
		System.out.println("여보세요");
	}

	@Override
	public void printLogo() {
		System.out.println("===== Apple =====");
	}

	@Override
	public void displayNumber() {
		System.out.println("내 휴대전화 정보 : 123-456-789");
	} 
	
	// 추가메소드작성
	public void flash() {
		System.out.println("반짝반짝 플래시가 켜졌습니다.");
	}
	
}
