package com.itstep.htmltip.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.itstep.htmltip.dao.AdminDao;
import com.itstep.htmltip.entity.Admin;

/**
 * Servlet implementation class RegisterController
 */
@WebServlet("/register")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("register.jsp").forward(req, resp);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		int status = AdminDao.save(new Admin(username, password));
		
		if (status > 0) {
			HttpSession session = request.getSession();
			session.setAttribute("username", username);
			session.setAttribute("password", password);
			

			response.sendRedirect(request.getContextPath() + "/");
			
		}else {
			request.setAttribute("NOTIFICATION", "Admin Registered Failed!");
			request.getRequestDispatcher("register.jsp").forward(request, response);	
		}
		
		
		

	}

}
