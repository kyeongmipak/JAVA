package com.jsplec.bbs.command;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsplec.bbs.dao.BDao;
import com.jsplec.bbs.dto.BDto;

public class BContentCommand implements BCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
	}

	public void execute(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
	
		String bId = request.getParameter("bId");

		BDao dao = new BDao();
		BDto dto = dao.contentView(bId);
		
		request.setAttribute("content_view", dto);
		
		session.setAttribute("BID", dto.getbId());
		session.setAttribute("BNAME", dto.getbName());
		session.setAttribute("BTITLE", dto.getbTitle());
		session.setAttribute("BCONTENT", dto.getbContent());
		
	}
}

