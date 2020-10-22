package com.javalec.base;

import java.util.Scanner;

public class MainClass_Ex03 {

	public static void main(String[] args) {
		// 입력한 한자릿수 정수의 합을 출력하는 프로그램을 객체지향 형식으로작성
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an integer(0~9) : ");
		int inputValue = ßscanner.nextInt();

		
		Total total = new Total(); // instance 선언
		total.valueTotal(inputValue); //
		

	}

}
