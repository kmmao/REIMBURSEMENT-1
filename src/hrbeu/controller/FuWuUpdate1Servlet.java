package hrbeu.controller;

import hrbeu.dao.FuWuDaoImpl;
import hrbeu.dao.ZhenLiaoDaoImpl;
import hrbeu.entity.FuWu;
import hrbeu.entity.ZhenLiao;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FuWuUpdate1Servlet
 */
@WebServlet("/FuWuUpdate1Servlet")
public class FuWuUpdate1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FuWuUpdate1Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String servId = request.getParameter("servId");
		FuWuDaoImpl fwdi = new FuWuDaoImpl();
		List<FuWu> list = fwdi.query(servId, null);
		request.setAttribute("service", list.get(0));
		request.getRequestDispatcher("/page/fuwuupdate.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
