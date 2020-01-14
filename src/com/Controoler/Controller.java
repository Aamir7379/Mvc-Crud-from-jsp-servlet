package com.Controoler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Bean.User;
import com.Dao.Student;


@WebServlet("/Controller")
public class Controller extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	//int	id=Integer.parseInt(request.getParameter("id"));
	String	name=request.getParameter("name");
	String	Address=request.getParameter("address");
	String	Dob=request.getParameter("dob");
	String	course=request.getParameter("course");
	String	joing=request.getParameter("joing");
	
	User user=new User();
	//user.setId(id);
	user.setName(name);
	user.setAddress(Address);
	user.setDob(Dob);
	user.setCourse(course);
	user.setJoing(joing);
	Student st=new Student();
	st.Insert(user);
	}
}
