package com.kh.day09.upcasting;

public class UpcastingEx {
	public static void main(String[] args) {
		Person p;
		Student s = new Student("�Ͽ���");
		p = s; // ��ĳ����
		
		System.out.println(p.name);
		
//		System.out.println(p.grade);
//		System.out.println(p.department);
		// �ڽ��� ������ �ִ°͵��� ������ ����
	
		// �ٿ�ĳ����
		System.out.println(((Student)p).grade);
		System.out.println(((Student)p).department);
		// ��������ȯó�� �տ��ٰ� ��

	
	
	
	
	
	
	
	
	
	}
	
}
