package com.cg.employee.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.cg.employee.pojo.Employee;

import junit.framework.Assert;

class EmployeeDAOTest {

	@Test
	public void testGetAllNames() {
		EmployeeDAOInterface dao=new EmployeeDAO();
		Assert.assertEquals(dao.getAllNames().size(),3);
				
	}

	@Test
	void testGetEmployee() {
		EmployeeDAOInterface dao=new EmployeeDAO();
		Assert.assertEquals(dao.getEmployee(2).getName(),"Rohit");
	}

	@Test
	void testAddEmployee() {
		EmployeeDAOInterface dao=new EmployeeDAO();
		dao.addEmployee(new Employee(4,"Rohan"));
		
		Assert.assertEquals(4,dao.getAllNames().size());
		
	}

	@Test
	void testDeleteEmployee() {
		EmployeeDAOInterface dao=new EmployeeDAO();
		dao.deleteEmployee(3);
		int flag=0;
		try {
		Employee emp=dao.getEmployee(3);
		}catch(Exception e) {
			flag++;
		}
		Assert.assertEquals(1, flag);
		
	}

	@Test
	void testUpdateEmployee() {
		fail("Not yet implemented");
	}

}
