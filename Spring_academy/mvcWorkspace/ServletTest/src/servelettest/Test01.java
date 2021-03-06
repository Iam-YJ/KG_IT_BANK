package servelettest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test011
 */
//url 맵핑 시킨부분이다
//이거를 주석처리하면 url 맵핑 자체가 되지 않아서 페이지 오류가 뜬다
@WebServlet("/Test01") 
public class Test01 extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Test01() {
        super();
        // TODO Auto-generated constructor stub
    }


    
	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init() 실행");
	} //서버 처음 시작할 때 실행

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy() 실행");
	} //서버 끝날 때 실행 

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("doGet() 실행");//새로고침 할 때마다 새로 실행 
		
		response.setContentType("text/html; charset=UTF-8");//response 객체를 기준으로 출력을 해야한다.
		PrintWriter out = response.getWriter();//response 객체에서 out 객체 받기 ..
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Servelet Test</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Servelet Test01</h1>");
		out.println("Hi Servelet<br>");
		out.println("<body>");
		out.println("</body>");
		out.println("</html>");

	
	} 

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
