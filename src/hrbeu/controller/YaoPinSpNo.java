package hrbeu.controller;

import hrbeu.dao.YaoPinSpDaoImpl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class YaoPinSpNo
 */
@WebServlet("/YaoPinSpNo")
public class YaoPinSpNo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String no = request.getParameter("no");
		YaoPinSpDaoImpl cur = new YaoPinSpDaoImpl();
		cur.no(Integer.parseInt(no));

		request.getRequestDispatcher("/page/yaopinsp.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
