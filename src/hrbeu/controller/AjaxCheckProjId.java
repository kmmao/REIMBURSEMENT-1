package hrbeu.controller;

import hrbeu.dao.YaoPinDaoImpl;
import hrbeu.dao.ZhenLiaoDaoImpl;
import hrbeu.entity.YaoPin;
import hrbeu.entity.ZhenLiao;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AjaxCheckProjId
 */
@WebServlet("/AjaxCheckProjId")
public class AjaxCheckProjId extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjaxCheckProjId() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String projId = request.getParameter("projId");
		//System.out.println(mediId);
		ZhenLiaoDaoImpl zldi = new ZhenLiaoDaoImpl();
		List<ZhenLiao> list = zldi.query(projId, null);
		PrintWriter out = response.getWriter();
		//System.out.println(list.size());
		int l = projId.length();
		boolean p = false;
		for(int i = 0; i < l; ++i)
		{
			if(projId.charAt(i) < '0' || projId.charAt(i) > '9')
			{
				p = true;
				break;
			}
		}
		if(l < 4 || l > 8) p = true;
		if(p)
			out.write("empty");
		else
		if(list.size() == 0)
			out.write("yes");
		else
			out.write("no");
		out.flush();
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
