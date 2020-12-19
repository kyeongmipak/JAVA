package com.jsplec.bbs.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsplec.bbs.dao.BDao;

public class BModifyCommand implements BCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
	}
		

	public void execute(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		String bId = request.getParameter("bId");
		String bName = request.getParameter("bName");
		String bTitle = request.getParameter("bTitle");
		String bContent = request.getParameter("bContent");
		request.setAttribute("BID", bId);
		
		BDao dao = new BDao();
		int check = dao.modify(bId, bName, bTitle, bContent);
		session.setAttribute("CHECK", check);
		
	}
}
