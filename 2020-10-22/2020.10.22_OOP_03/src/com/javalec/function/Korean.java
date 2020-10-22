package com.javalec.function;

public class Korean {

	// field
	public String nation = "대한민국";
	public String name;
	public String phone;
	
	
	// constructor
	public Korean(String n, String p) {
		name = n;
		phone = p;
	}
	
	// method
	public String name() {
		System.out.println("================");
		 return name; // name이 출력되는 경우는 main method에서 변수에 저장하거나syso에 적을때
		 			 // string a = Korean.name(); 인 경우 출력
		// return (name + phone); // 이름과 전화번호 같이 출력
	}
	
}
