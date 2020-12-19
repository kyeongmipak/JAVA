package com.jsplec.bbs.homcontroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsplec.bbs.command.BCommand;
import com.jsplec.bbs.command.BContentCommand;
import com.jsplec.bbs.command.BDeleteCommand;
import com.jsplec.bbs.command.BListCommand;
import com.jsplec.bbs.command.BModifyCommand;
import com.jsplec.bbs.command.BWriteCommand;

/**
 * Servlet implementation class BFrontController
 */
@WebServlet("*.do") // do로 끝나는 것은 여기서 처리한다.
public class BFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BFrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    //-----------------------------
    //controller에 session정의 해줘야 한다. (현재는 request, response 만 잇다. 매개변수에 추가)
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doGet");
		// 내가 만든 method
		actionDo(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doPost");
		actionDo(request, response);
		
	}
	// -------------- 내가 만든 method -------------------
	private void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		System.out.println("actionDo");
		//매개변수와 동일하게 사용
		request.setCharacterEncoding("utf-8");
		
		String uri = request.getRequestURI();
		// System.out.println(uri); 
		// uri 아래와 같이 출력
		// /MVCBoard/aaa.do
		String conPath = request.getContextPath();
		// System.out.println(conPath);
		// conPath 가 아래와 같이 출력
		// /MVCBoard
		
		String com = uri.substring(conPath.length());
		// System.out.println(com);
		// /000.do 출력
		
		
		BCommand command = null;
		String viewPage = null; // jsp 파일 이름이 저장
		
		
		switch (com) {
		case ("/list.do"): // 게시판 전부 보이기
			command = new BListCommand();
			command.execute(request, response); // controller가 method execute를 구동시킨다
			viewPage = "list.jsp";
			
			break;
			
		case ("/write_view.do"): // 입력화면
				viewPage = "write_view.jsp";
			break;
			
		case ("/write.do"): // 입력 저장
				command = new BWriteCommand(); // 데이터 가져와서 저장하는 역할
				command.execute(request, response); // 데이터 command 로 보내기
				viewPage = "list.do"; // 입력 후 게시판 전체 보이는 페이지로 이동
			break;
		
		case ("/content_view.do"): // 내용보기
			command = new BContentCommand();
			command.execute(request, response, session);
			viewPage = "content_view.jsp";
			break;
			
		case ("/modify.do"): // 수정
			command = new BModifyCommand();
			command.execute(request, response, session);
			viewPage = "modify.jsp";
			break;
		
			
		case ("/delete.do"): // 삭제
			command = new BDeleteCommand();
			command.execute(request, response);
			viewPage = "list.do";
			break;
		
		default:
			viewPage = "list.do"; 
			break;
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
		
	}
	
	
}
