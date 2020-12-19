package com.jsplec.bbs.homecontroller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.bbs.command.OBCommand;
import com.jsplec.bbs.command.OBDeleteCommand;
import com.jsplec.bbs.command.OBListCommand;
import com.jsplec.bbs.command.OBWriteCommand;

/**
 * Servlet implementation class OBFrontController
 */
@WebServlet("*.do")
public class OBFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OBFrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		actionDo(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		actionDo(request, response);

	}

	//---------------------
	private void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String com = uri.substring(conPath.length());
		
		OBCommand command = null;
		String viewPage =  null;
		
		switch(com) {
		case ("/list.do"):
			command = new OBListCommand();
			command.execute(request, response);
			viewPage = "list.jsp";
			break;
		
		case ("/write_view.do"): // 입력화면
			viewPage = "write_view.jsp";
		break;
			
		case ("/write.do"):
			command = new OBWriteCommand();
			command.execute(request, response);
			
			viewPage = "list.do";
			break;
			
		case ("/delete.do"):
			command = new OBDeleteCommand();
			command.execute(request, response);
			viewPage = "list.do";
			break;
			
		default :
			viewPage = "list.do";
			break;
		
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
		
	}
	
}
