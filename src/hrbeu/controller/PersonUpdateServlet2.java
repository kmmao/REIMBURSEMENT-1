package hrbeu.controller;

import hrbeu.dao.PersonDaoImpl;
import hrbeu.entity.Person;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PersonUpdateServlet2
 */
@WebServlet("/PersonUpdateServlet2")
public class PersonUpdateServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("bug in Person Update S 2");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("link to person Update SEVRLET2");
		String pID = request.getParameter("personID");
		String cID = request.getParameter("cID");
		String type = request.getParameter("type");
		String name = request.getParameter("name");
		String sex = request.getParameter("sex");
		String birthday = request.getParameter("birthday");
		String patID = request.getParameter("patID");
		String InsID = request.getParameter("InsID");
		String compID = request.getParameter("compID");
		///
		Person curins = new Person();
		curins.setPersonID(Integer.parseInt(pID));
		curins.setCertifiType(type);
		curins.setPersonName(name);
		curins.setCertifiID(cID);
		curins.setBirthday(birthday);
		curins.setPatID(patID);
		curins.setInsID(Integer.parseInt(InsID));
		curins.setPersonSex(sex);
		curins.setCompID(compID);
		///
		PersonDaoImpl cur = new PersonDaoImpl();
		cur.updatePerson(curins);
		
		request.getRequestDispatcher("/page/basical_people.jsp").forward(request, response);
	}

}
