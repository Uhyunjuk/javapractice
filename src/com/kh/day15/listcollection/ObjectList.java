package com.kh.day15.listcollection;

public class ObjectList {
	private Object [] Objects;
	private int size;
	
	public ObjectList() {
		Objects = new Object[3];
		size = 0;
	}
	
	public void add(Object input) {
		Objects[size] = input;
		size++;
	}
	// 리턴값이 있으면 리턴값의 자료형을
	// 메소드 반환형(void자리)에 적어준다
	public Object get(int index) {
		return Objects[index];	// nums[0] → 1
	}
	
	public int size() {
		return size;
	}

	public void clear() {
		Objects = new Object[3];
		size = 0;
	}
}
