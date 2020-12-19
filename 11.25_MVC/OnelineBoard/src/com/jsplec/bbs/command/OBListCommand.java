package com.jsplec.bbs.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.bbs.dao.OBDao;
import com.jsplec.bbs.dto.OBDto;

public class OBListCommand implements OBCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		OBDao dao = new OBDao();
		ArrayList<OBDto> dtos = dao.list();
		
		request.setAttribute("list", dtos);
		
	}

}
