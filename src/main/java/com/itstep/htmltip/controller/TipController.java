package com.itstep.htmltip.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itstep.htmltip.dao.TipDao;
import com.itstep.htmltip.entity.Tip;

/**
 * Servlet implementation class TipController
 */
@WebServlet("/tip")
public class TipController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String target = request.getParameter("target");
		
		switch(target) {
			case "creation":
				request.getRequestDispatcher("tipCreation.jsp").forward(request, response);
			break;
			
			case "details":
				int tipId = Integer.parseInt(request.getParameter("id"));
				Tip tip = TipDao.getTip(tipId);
				request.setAttribute("tip", tip);
				request.getRequestDispatcher("tipDetails.jsp").forward(request, response);
			break;
			
			default:
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String title = request.getParameter("title");
		String des = request.getParameter("description");
		String html = request.getParameter("exampleHtmlEscape");
		
		Tip tip = new Tip(title, des, html);
		
		int status = TipDao.save(tip);
		if (status > 0) {
			request.setAttribute("NOTIFICATION", "TIP created successfully!");
		} else {
			request.setAttribute("NOTIFICATION", "TIP create unsuccessful");
		}
		
		request.getRequestDispatcher("tipCreation.jsp").forward(request, response);
	}

}
