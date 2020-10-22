package com.javalec.base;

public class Total {
	//field
	
	//constructor
	}
		
	//method
	public void valueTotal(int i) {
		int total = 0;
		
			total += i%10;
			i = i/10;
		}
		System.out.println("Sum of digits = " + total);
	}
	
	
}
