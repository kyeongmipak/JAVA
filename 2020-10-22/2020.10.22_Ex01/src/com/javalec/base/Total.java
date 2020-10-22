package com.javalec.base;

public class Total {
	//field
	
	//constructor
	public Total() {
		
	}
		
	//method
	public void valueTotal(int i) {
		int total = 0;
		
		while(i != 0) { // 몫이 1이 아니면 반복
			total += i%10;
			i = i/10;
		}
		System.out.println("Sum of digits = " + total);
	}
	
	
}
