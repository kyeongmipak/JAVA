package com.jsplec.bbs.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public interface BCommand {
	// method 이름을 정할 때 interface 사용
	
	// method 정의
	public void execute(HttpServletRequest request, HttpServletResponse response);
	
	public void execute(HttpServletRequest request, HttpServletResponse response, HttpSession session);
	
}
