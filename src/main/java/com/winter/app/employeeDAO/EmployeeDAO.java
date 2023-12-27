package com.winter.app.employeeDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

import com.winter.app.util.DBConnector;

public class EmployeeDAO {

	
	
		public Map<String, Integer> getSalary() throws Exception{
			Map<String, Integer> map = new HashMap<String, Integer>();
			
			Connection con = DBConnector.getConnector();
			
			String sql = "SELECT SUM(SALARY) AS S, COUNT(EMPLOYEE_ID) FROM EMPLOYEES";
			
			PreparedStatement st = con.prepareStatement(sql);
			
			ResultSet rs = st.executeQuery();
			
			rs.next();
			
			int sum= rs.getInt("s");
			int count = rs.getInt(2);
			map.put("count", count);
			map.put("sum", sum);
			DBConnector.disConnect(rs, st, con);
			return map;
			
			
		}
		}
