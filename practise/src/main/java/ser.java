

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ser
 */
@WebServlet("/ser")
@SuppressWarnings("unused")
public class ser extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     
    public ser() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	PrintWriter out = response.getWriter();
	
	response.sendRedirect("rr.jsp?un="+request.getParameter("un"));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Cookie c = new Cookie("un",request.getParameter("un"));
		response.addCookie(c);
		response.sendRedirect("rr.jsp");
		
		
		
		
		//PrintWriter out = response.getWriter();
		//HttpSession s = request.getSession();
		
		//s.setAttribute("un", request.getParameter("un"));
	    //response.sendRedirect("rr.jsp");
	    /*
	    if(request.getParameter("un")!="") {
		RequestDispatcher r = request.getRequestDispatcher("rr.jsp");
		r.forward(request, response);}
		else {
			RequestDispatcher r = request.getRequestDispatcher("NewFile1.html");
			r.include(request, response);}
		}
		//response.sendRedirect("rr.jsp?un="+request.getParameter("un"));
	*/

}}
