package com.parthik.usecase;



import org.hibernate.Session;

import com.parthik.beans.Department;
import com.parthik.beans.Employee;
import com.parthik.util.SessionUtil;

public class Main {

	
	public static void main(String[] args) {
		
		Session ses = SessionUtil.getSession();
		
		Department d = ses.get(Department.class, 1);
		System.out.println(d.getEmp().getName());
		
		//===============================================
		//for storing
		
//		Department d1 = new Department();
//		d1.setDname("CE");
//		d1.setLocation("Gandhinagar");
//		
//		Employee emp1 = new Employee();
//		emp1.setName("Parthik");
//		emp1.setSalary(18000);
//		
//		d1.setEmp(emp1);
//		
//		ses.getTransaction().begin();
//		
//		ses.save(d1);
//		 
//		
//		ses.getTransaction().commit();
		
		System.out.println("done");
	}
	
}
