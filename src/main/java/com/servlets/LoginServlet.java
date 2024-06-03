package com.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		request.getRequestDispatcher("LoginForm.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		      String un =  request.getParameter("username");
		      String psw = request.getParameter("password");
		      
		      if(un.equals("hari") && psw.equals("123")) {
		    	  
		    	  request.setAttribute("uname", un);
		    	  request.getRequestDispatcher("Home.jsp").forward(request, response);
		      }else {
		    	  
		    	  request.setAttribute("message", "user not found");
		    	  request.getRequestDispatcher("LoginForm.jsp").forward(request, response);
		      }
		      
		      //Profile.jsp
		
	}

}
