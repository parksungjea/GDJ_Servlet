package com.winter.app.departments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.winter.app.util.DBConnector;

public class DepartmentDAO {
	
	//getDetail, 부서번호로 부서정보 조회
	
	public void getDetail() throws Exception{
		Connection con = DBConnector.getConnector();
		DepartmentDTO dt = new DepartmentDTO();
		String sql = "SELECT DEPARTMENT_ID FROM DEPARTMENTS WHERE DEPARTMENT_ID=?";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setInt(1, dt.getDepartment_id());
		
		ResultSet rs = st.executeQuery();
		
		if(rs.next()) {
			
		}
		
	}
	
	public List<DepartmentDTO> getList() throws Exception {
		//DB접속 후 부서테이블의모든 정보를 출력
		List<DepartmentDTO> ar = new ArrayList<DepartmentDTO>();
		Connection con = DBConnector.getConnector();
		
		String sql ="SELECT * FROM DEPARTMENTS";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			DepartmentDTO departmentDTO = new DepartmentDTO();
			departmentDTO.setDepartment_id(rs.getInt("DEPARTMENT_ID"));
			departmentDTO.setDepartment_name(rs.getString("DEPARTMENT_NAME"));
			departmentDTO.setLocation_id(rs.getInt("LOCATION_ID"));
			departmentDTO.setManager_id(rs.getInt("MANAGER_ID"));
			
			ar.add(departmentDTO);
		}
		
		DBConnector.disConnect(rs, st, con);
		return ar;
	}

}
