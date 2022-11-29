package com.kh.day05.array;

public class Exam_ArrraySort {

	public static void main(String[] args) {
		int num1 = 11;
		int num2 = 23;
		System.out.println("num1 : " + num1 + ", num2 : " + num2);

		// num1과 num2값 바꾸기
		int temp = num1; // temp = 11
		num1 = num2; // num1 = 22
		num2 = temp; // num2 = 11
		System.out.println("num1 : " + num1 + ", num2 : " + num2);

		// 1,2,3으로 바꾸기 (2랑 1만 바꾸면됨)
		int[] nums = {2, 1, 3};
		temp = nums[0]; // temp = 2
		nums[0] = nums[1]; // 2->1
		nums[1] = temp; // 1->2
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		
		// {1,2,3} 
		
		// 3,2,1로 바꾸기
		temp = nums[0]; // temp = 1
		nums[0] = nums[2]; // 1->3
		nums[2] = temp; // 3->1
		
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i] + " ");
		}

	}
}
