package com.javalec.base;

import java.util.Scanner;

public class Main_Ex02 {

	public static void main(String[] args) {
		
		// 출력할 단 : 
		// 곱해지는 수(출발) : 
		// 곱해지는 수(끝) :
		
		
		System.out.println("-------구구단--------");
		int end=1;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("출력할 단 : ");
		int inputDan = scanner.nextInt();
		System.out.print("곱해지는 수(출발) : ");
		int inputStart = scanner.nextInt();
		System.out.print("곱해지는 수(출발) : ");
		int inputEnd = scanner.nextInt();
		
		
		Dan dan = new Dan();
		dan.calc2(inputDan, inputStart, inputEnd);
		 
				
		
		
		
		
		
	}	
		
		// 입력받은 숫자로 구구단 출력하는 프로그램을 객체지향 형식으로 작성
		// (단, 짝수의 곱인 경우에는 *로 표시)
		
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("구구단을 출력할 숫자를 입력하세요!");
//		
//		int dan = scanner.nextInt();
//		scanner.close();
//		
//		
//		Dan dan2 = new Dan();
//		dan2.calc(dan);
//	
//		
//		// main class에서 사용할 경우    *비권장*
//		Main_Ex02 main_Ex02  = new Main_Ex02();
//		main_Ex02.calc(dan);
//	
//	}
	
//	// main에서 method 사용하는 경우
//	public void calc(int i) {
//		for (int j = 1; j <= 9; j++) {
//			System.out.println(i + " x " + j + " = " + (i*j));
//		}
//	}

}
