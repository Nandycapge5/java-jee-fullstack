package com.cap.service;

import com.cap.bean.Employee;

public interface EmployeeService {


void insertEmployee(Employee employee);
//Employee retrieveEmployee(Integer eid);

Employee retrieveEmployee(int eid);


}
