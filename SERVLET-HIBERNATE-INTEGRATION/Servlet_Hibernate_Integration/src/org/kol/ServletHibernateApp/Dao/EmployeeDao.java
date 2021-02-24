package org.kol.ServletHibernateApp.Dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.kol.ServletHibernateApp.Dto.Employee;

public class EmployeeDao {
	
	public Employee saveEmployee(Employee emp) {
		
		System.out.println("Inside Emloyee Dao Class");
		int primarykey=0;
		Transaction trns=null;
	
		try {
			Configuration config=new Configuration();
			config.configure();
			SessionFactory sef=config.buildSessionFactory();
			Session ses=sef.openSession();
			 trns=ses.beginTransaction();
			
			primarykey=(int) ses.save(emp);
			
			trns.commit();
			ses.close();
				
		}
		
		catch (HibernateException e) {
			trns.rollback();
			System.out.println("Operations Rolled Back");
			return null;
		}
		
		if(primarykey!=0)
		{
			System.out.println("Return Employee Object From DataBase");
		return emp;
		}
		else
		{
			return null;
		}
		
	}

}
