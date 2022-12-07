package com.kh.day11.iostream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_Read {

	public static void main(String[] args) {
		InputStream is = null; // 추상클래스는 객체생성할수 x, 그냥 초기화

		// FileInputStream -> Checked Exception
		// -> 반드시 try~catch 해줘야 하는 Exception
		try {
			is = new FileInputStream("src/iostream/inputStream.txt");
			int readByte;
			while (true) {
				readByte = is.read();
				// 없으면 그만 읽어야 하는 코드 적어주기
				if(readByte == -1) break;
				// Unreachable code
				System.out.print((char)readByte);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 예외처리 surround with try/catch누르면 자동완성됨

	}

}
