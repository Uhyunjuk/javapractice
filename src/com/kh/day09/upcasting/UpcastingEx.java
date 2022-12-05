package com.kh.day09.upcasting;

public class UpcastingEx {
	public static void main(String[] args) {
		Person p;
		Student s = new Student("일용자");
		p = s; // 업캐스팅
		
		System.out.println(p.name);
		
//		System.out.println(p.grade);
//		System.out.println(p.department);
		// 자식이 가지고 있는것들은 오류가 난다
	
		// 다운캐스팅
		System.out.println(((Student)p).grade);
		System.out.println(((Student)p).department);
		// 강제형변환처럼 앞에다가 써

	
	
	
	
	
	
	
	
	
	}
	
}
