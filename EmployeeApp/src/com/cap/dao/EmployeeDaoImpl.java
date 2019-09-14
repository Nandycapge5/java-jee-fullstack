package com.cap.dao;

import java.util.HashMap;
import java.util.Map;

import com.cap.bean.Employee;

public class EmployeeDaoImpl implements EmployeeDao{

	
	 Map<Integer,Employee> employees=new HashMap<Integer,Employee>();

	@Override
	public void insertEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employees.put(employee.getEmpId(),employee);
	}
	

	@Override
	public Employee retrieveEmployee(Integer eid) {
		// TODO Auto-generated method stub
		return employees.get(eid);
	}
	
	 

	

}
