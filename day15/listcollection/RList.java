package com.kh.day15.listcollection;

public class RList<T> {	// Generic 아무거나 다 들어갈 수 있다
	private Object [] Objects;
	private int size;
	
	public RList() {
		Objects = new Object[3];
		size = 0;
	}
	
	public void add(T input) {
		Objects[size] = input;
		size++;
	}
	// 리턴값이 있으면 리턴값의 자료형을
	// 메소드 반환형(void자리)에 적어준다
	public T get(int index) {
		return (T)Objects[index];	// nums[0] → 1
	}
	
	public int size() {
		return size;
	}

	public void clear() {
		Objects = new Object[3];
		size = 0;
	}
}
