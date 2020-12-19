package com.jsplec.bbs.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.bbs.dao.OBDao;

public class OBDeleteCommand implements OBCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String bNo = request.getParameter("bNo");
		
		OBDao dao = new OBDao();
		dao.delete(bNo);
			
	}

}
