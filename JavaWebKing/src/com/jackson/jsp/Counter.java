package com.jackson.jsp;

public class Counter {
	private int count;
	
	//每访问一次，计数器就+1
	public int getCount() {
		return ++count;
	}
	
	public void setCount() {
		this.count = count;
	}
}
