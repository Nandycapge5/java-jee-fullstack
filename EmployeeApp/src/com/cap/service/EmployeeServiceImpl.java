package com.cap.service;

import com.cap.bean.Employee;
import com.cap.dao.EmployeeDao;
import com.cap.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {
EmployeeDao dao=new EmployeeDaoImpl();

@Override
public void insertEmployee(Employee employee) {
	// TODO Auto-generated method stub
	dao.insertEmployee(employee);
}






@Override
public Employee retrieveEmployee(int eid) {
	// TODO Auto-generated method stub
	return dao.retrieveEmployee(eid);
}





	

}
