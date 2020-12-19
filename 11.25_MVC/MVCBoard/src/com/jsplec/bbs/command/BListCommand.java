package com.jsplec.bbs.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsplec.bbs.dao.BDao;
import com.jsplec.bbs.dto.BDto;

public class BListCommand implements BCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// Table에서 전체 검색을 하여 ArrayList에 넣기
		// 1) Dao (SQL Statement 쉽게 말해 dbAction 부분)
		// 2) DTO (java Beean)
		
		BDao dao = new BDao();
		ArrayList<BDto> dtos = dao.list();
		
		request.setAttribute("list", dtos);
		
	}

	public void execute(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
	
	}
}
