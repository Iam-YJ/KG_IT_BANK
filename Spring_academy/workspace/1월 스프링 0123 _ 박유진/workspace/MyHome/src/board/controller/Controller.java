package board.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.action.CheckWriteAction;
import board.action.ListAction;
import util.Action;
import util.ActionForward;

@WebServlet("*.brd")
public class Controller extends HttpServlet {

	Action action;
	ActionForward actionForward;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		doGet(req, resp);
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		action = null;
		actionForward = null;
		
		String requestURL = request.getRequestURL().toString();
		
		System.out.println(requestURL);
		System.out.println(request.getRemoteHost());
		
		int lastIndex = requestURL.lastIndexOf("/");
		int lastIndex2 = requestURL.lastIndexOf(".brd");
		
		String path = requestURL.substring(lastIndex + 1,lastIndex2);
		
		System.out.println(path);
		
		switch(path) {
		case "BoardList":
			action = new ListAction();
			actionForward = new ActionForward("/Board/BoardList.jsp", false);
			break;
		case "WriteForm":
			actionForward = new ActionForward("/MyHome/Board/WriteForm.jsp", true);
			break;
		case "CheckWrite":
			action = new CheckWriteAction();
			actionForward = new ActionForward("/Board/Result.jsp", false);
			break;
		case "BoardIn":
			action = new CheckWriteAction();
			actionForward = new ActionForward("/Board/BoardIn.jsp",false);
			break;
		}
		
		if(action != null) {
			action.execute(request, response);
		}
		
		if(actionForward.isRedirect()) {
			response.sendRedirect(actionForward.getNextPath());
		}else {
			request.getRequestDispatcher(actionForward.getNextPath()).forward(request, response);
		}
	}
	
}
