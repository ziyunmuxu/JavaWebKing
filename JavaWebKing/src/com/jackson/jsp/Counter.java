package com.jackson.jsp;

public class Counter {
	private int count;
	
	//ÿ����һ�Σ���������+1
	public int getCount() {
		return ++count;
	}
	
	public void setCount() {
		this.count = count;
	}
}
