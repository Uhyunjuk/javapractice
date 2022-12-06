package com.kh.day10.musicinterface;

public class Musician { // 뮤지션과 악기들을 instrument(인터페이스)가 연결한다
	public void playInstrument(Instrument instrument) {
		instrument.play();
	}
	
	// 밑에꺼 안써줘도됨
	
//	public void playInstrument(Piano piano) { 
//		piano.play();
//	}
//	// 자기자신복사 하고 매개변수만바꿔주는거 오버로딩
//	public void playInstrument(Guitar guitar) {
//		guitar.play();
//	}
//
//	public void playInstrument(Drum drum) {
//		drum.play();
//	}
}
