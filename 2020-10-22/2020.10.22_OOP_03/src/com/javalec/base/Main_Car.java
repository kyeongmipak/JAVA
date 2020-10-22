package com.javalec.base;

import com.javalec.function.Car; // pkg 이름이 달라서 import된다.
import com.javalec.function.Korean;

public class Main_Car {

	public static void main(String[] args) {
		// instance 생성
		Car myCar = new Car();
		Car myCar2 = new Car(); // new 사용시 같은 클래스를 가져오지만 car, car2가 다르다고 판단
		
		// field값 읽기
		System.out.println("제작회사 : " + myCar.company); // 다른 클래스에 있는 field 사용
		System.out.println("모델명  : " + myCar.model);
		System.out.println("색깔    : " + myCar.color);
		System.out.println("최고속도 : " + myCar.maxSpeed);
		System.out.println("현재속도 : " + myCar.speed);
		myCar.speed = 60;
		System.out.println("수정속도 : " + myCar.speed);
		
		
		System.out.println("----------------------------->>");
		
		System.out.println("제작회사 : " + myCar2.company); 
		System.out.println("모델명  : " + myCar2.model);
		System.out.println("색깔    : " + myCar2.color);
		System.out.println("최고속도 : " + myCar2.maxSpeed);
		System.out.println("현재속도 : " + myCar2.speed);
		myCar2.speed = 100;
		System.out.println("수정속도 : " + myCar2.speed);
		
		System.out.println("----------------------------->>");

		
		Korean korean = new Korean("홍길동", "010-1234-5678");
		
		
		// field 이용하여 가져오기
		System.out.println("nation : " + korean.nation); 
		System.out.println("name : " + korean.name);
		System.out.println("phone : " + korean.phone);
		
		System.out.println(korean.name());  // method이용하여 가져오기
		
	}

}
