package com.cap.dao;

import com.cap.bean.Employee;


public interface EmployeeDao {
	

	void insertEmployee(Employee employee);
	Employee retrieveEmployee(Integer eid);
}
