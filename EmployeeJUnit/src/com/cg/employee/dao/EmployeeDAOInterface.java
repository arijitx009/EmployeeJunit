package com.cg.employee.dao;

import java.util.List;

import com.cg.employee.pojo.Employee;

public interface EmployeeDAOInterface {

	List<Employee> getAllNames();

	Employee getEmployee(int id);

	void addEmployee(Employee emp);

	void deleteEmployee(int id);

	void updateEmployee(int id, Employee emp);

}