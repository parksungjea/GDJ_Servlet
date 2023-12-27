package com.winter.app.test;

import java.util.List;
import java.util.Map;

import com.winter.app.departments.DepartmentDAO;
import com.winter.app.employeeDAO.EmployeeDAO;
import com.winter.app.regions.RegionDAO;
import com.winter.app.regions.RegionDTO;


public class AppMain {

public static void main(String[] args) {
	EmployeeDAO employeeDAO = new EmployeeDAO();
	
	try {
		Map<String, Integer> map = employeeDAO.getSalary();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
	
}