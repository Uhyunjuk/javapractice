package com.kh.day02.operator;

public class Exam_Logical {
	public static void main(String [] args) {
		System.out.println("논리연산자 예제");
		// 남자이면서 평균평점 4.3이상인 사람 - 둘다만족 -> AND(&&)
		// 컴퓨터공학과 또는 경영학과인 사람 - 둘중하나만족 -> OR(||)
		
		int num1 = 50;
		int num2 = 30;
		boolean result1, result2, result3, result4; // 변수의 선언
		
		// num1과 num2가 다르면서 num2가 num1보다 클때
		result1 = (num1 != num2) && (num1 < num2); // false
		System.out.println("result1의 결과값 : " + result1);
		
		result2 = (num1 < num2) || (num1 == num2);
		result3 = (num1 > num2) && (num1 != num2);
		result4 = (num1 > num2) || (num1 == num2);

		System.out.println("result2의 결과값 : " + result2);
		System.out.println("result3의 결과값 : " + result3);
		System.out.println("result4의 결과값 : " + result4);
		System.out.println();
		
		System.out.println("논리연산자 예제2");
		int aNum = 70;
		int bNum = 55;
		result1 = (aNum == bNum) || (aNum++ < 100); 
		result2 = (aNum < bNum) && (--bNum < 55); 
		result3 = (aNum != bNum) && (bNum-- < aNum++); 
		result4 = (aNum++ != bNum) || (bNum++ >= 85); 
		
		System.out.println("result1의 결과값 : " + result1);
		System.out.println("result2의 결과값 : " + result2);
		System.out.println("result3의 결과값 : " + result3);
		System.out.println("result4의 결과값 : " + result4);
		System.out.println("aNum의 값: " + aNum);
		System.out.println("bNum의 값: " + bNum);
		
		// OR(||)은 앞에 false여도 뒤에 true 있으면 값이 true 나옴. (뒤를 확인한다)
		// AND(&&)는 앞에 false면 바로 값을 false로 냄. (뒤에 true여도 확인하지 않음)
		// 그래서 and쓸땐 확실한값들은 앞부분에다가 써줘서 효율을 높여야함
		
		





		
		
		




		
		
	}
}
