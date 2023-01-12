package com.kh.day13.iostream;

import java.io.File;
import java.io.IOException;

public class Exam_File {
	public static void main(String [] args) {
		File file = new File("D:\\Temp\\zzz.jpeg");
		String fileName = file.getName();
		String path = file.getPath();
		String parent = file.getParent();
		
		System.out.println("���� �̸� : " + fileName);
		System.out.println("���� ��� : " + path);
		System.out.println("�θ� ���� : " + parent);
		
		//File fOne = new File("C:\\windows\\system.ini");
		//System.out.println(fOne.getPath());
		
		try {
			File fileMake = new File("src/iostream/fileOne.txt");
			//fileMake.createNewFile();
			File forderMake = new File("src/file");
			//forderMake.mkdir();
			File fileMake2 = new File("src/file/file.txt");
			fileMake2.createNewFile();
			
			System.out.println("������ �����ϴ°�? : " + fileMake.exists());
			System.out.println("filOne.txt�� ������ �´°�? : " + fileMake.isFile());
			System.out.println("file������ ������ �´°�? : " + forderMake.isDirectory());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
