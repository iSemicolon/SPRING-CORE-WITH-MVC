package org.kol.ServletHibernateApp.Service;

import java.util.Random;

import org.kol.ServletHibernateApp.Dao.EmployeeDao;
import org.kol.ServletHibernateApp.Dto.Employee;

public class EmployeeService {
	
	
	Employee retDao=null;
	public Employee empService( Employee emp) {
		
		System.out.println("Inside Employee Service Class");
		if(emp!=null)
		{
		Random rd=new Random();
		int n=rd.nextInt();
		String eId="JSPIDER-"+n;
		
		emp.setEmp_Id(eId);
		}
		
		
		System.out.println("Passing Employee Object from Employee Service to Employee Dao Class");
		EmployeeDao dao=new EmployeeDao();
		Employee retService=dao.saveEmployee(emp);
		System.out.println("Return Employee Object from Service to Controleer Class");
		
		return retService;
		
		
		
	}

}
