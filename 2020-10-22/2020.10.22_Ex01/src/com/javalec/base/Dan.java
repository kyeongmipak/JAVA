package com.javalec.base;

public class Dan {

	// field
	
	// constructor
	public Dan() {
		
	}
	
	
	// method
	public void calc2(int a, int b, int c) {
		
		System.out.println();
		for (int i = b; i <= c; i++) {
				System.out.println(a + " x " + i + " = " + (a*i));
			
		}
	}
	
	
	
	
	
	public void calc(int i) {
//		for (int j = 1; j <= 9; j++) {
//			if(j%2==1) {
//				System.out.println(i + " x " + j + " = " + (i*j));
//			} else {
//				System.out.println(i + " x " + "* = " + (i*j));
//				
//			}
//		}
		
		// 출력 1개로 숫자, 문자 출력 
		String danNum = "";
		
		for (int j = 1; j <= 9; j++) {
			
			if(j%2==1) { // 홀수일 때
				danNum = Integer.toString(j); // 숫자를 문자열로 형변환

			} else { // 짝수일 때
				danNum = "*";
				
			}
			System.out.println(i + " x " + ((j%2==1) ? j : "*" )+ " = " + (i*j));
		}
		
	}
}
