package kh.web.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kh.web.beans.PersonDAO;
import kh.web.beans.PersonDTO;

@WebServlet("*.do")
public class FrontController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String requestURI = request.getRequestURI();
			String contextPath = request.getContextPath();
			String command = requestURI.substring(contextPath.length());
			int id = Integer.parseInt((String)request.getSession().getAttribute("loginId"));


			response.setCharacterEncoding("utf8");
			PrintWriter out = response.getWriter();

			if(command.equals("output.do")) {
				PersonDAO dao = new PersonDAO();
				List<PersonDTO> dto = dao.selectData();
			}else if(command.equals("input.do")) {
				String name = request.getParameter("email");
				String email = request.getParameter("email");
				PersonDAO dao = new PersonDAO();
				int result = dao.insertNewMember(name, email);
				request.setAttribute("result", result);
			}

			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
