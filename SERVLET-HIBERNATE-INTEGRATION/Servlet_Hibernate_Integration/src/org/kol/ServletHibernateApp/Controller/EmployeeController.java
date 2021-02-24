package org.kol.ServletHibernateApp.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kol.ServletHibernateApp.Dto.Employee;
import org.kol.ServletHibernateApp.Service.EmployeeService;

public class EmployeeController extends HttpServlet{
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Employee emp=null;
		Employee retemp=null;
		
		System.out.println("Inside Employee Controller Class");
		
		if(!req.getParameter("fname").isEmpty() &&
				!req.getParameter("lname").isEmpty()
				&& !req.getParameter("em").isEmpty()
				&& !req.getParameter("psw").isEmpty()
				)
		{
			emp=new Employee();
			emp.setFirstname(req.getParameter("fname"));
			emp.setLastname(req.getParameter("lname"));
			emp.setEmailId(req.getParameter("em"));
			emp.setPassword(req.getParameter("psw"));
			System.out.println("Data Send From Controller to Service Class ");
			
			EmployeeService service=new EmployeeService();
			retemp=service.empService(emp);
			
			System.out.println("Return Employee Object from Employee Service to Employee Controller");
			
			
		}
		
		else
		{
			emp=null;
			System.out.println("Invalid Data !!!");
		}
		
		//UI PART OR VIEW PART
		
		RequestDispatcher dispatcher=null;
		
		if(retemp!=null)
		{
			req.setAttribute("username", retemp.getFirstname()+ retemp.getLastname());
			dispatcher=req.getRequestDispatcher("Sucess.jsp");
		}
		
		else
		{
			dispatcher=req.getRequestDispatcher("Error.jsp");
		}
		
		dispatcher.forward(req, resp);
		
	}
	
}
