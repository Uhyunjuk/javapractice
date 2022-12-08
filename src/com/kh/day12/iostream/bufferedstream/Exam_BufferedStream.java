package com.kh.day12.iostream.bufferedstream;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exam_BufferedStream {

	public static void main(String[] args) {
		// 버퍼 크기를 5로 하고 표준 출력스트림과 연결한
		// 버퍼출력 스트림을 생성하라
		// C:\Temp/kh.txt 파일을 저장된 영문 텍스트를 읽어
		// 버퍼 출력 스트림을 통해 출력하라 !

		FileReader fir = null;
		int readChar;
		int c;
		try {
			fir = new FileReader("C:\\Temp\\kh.txt");
			// 콘솔 출력용
			BufferedOutputStream out = new BufferedOutputStream(System.out, 5);
			while ((readChar = fir.read()) != -1) {
				out.write(readChar);
			}
			new Scanner(System.in).nextLine(); // 5개씩 읽어줌 , 엔터를 쳐줘야 알파벳 z가 보임
			out.flush(); // 5개중에 z, 한개가 차있는상태니까 flush를 하고 z를 출력
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fir.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
