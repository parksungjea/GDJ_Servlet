package com.winter.app.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBCConnector {

	
	//1.IP:PORT
	//2.ID, PW
	public void getConnector() {
		String user="user01";
		String password="user01";
		String url ="jdbc:oracle:thin:@3.35.52.200:1521:xe";
		String driver="oracle.jdbc.driver.OracleDriver";
		
		//1. driver를 메모리에 로딩(객체 생성)
		try {
			Class.forName(driver);
			//2.DB연결
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println(con);
			
			//3. sql문 생성
			String sql ="SELECT * FROM REGIONS";
			
			//4.SQL문을 미리 전송
			PreparedStatement st = con.prepareStatement(sql);
			
			//5.
			
			
			//6. 최종 전송 및 결과 처리
			ResultSet rs = st.executeQuery();
			
			while(rs.next()) {
				//1, Europe
				int n = rs.getInt(1);
				String name = rs.getString(2);
					System.out.println(n+" : "+name);
					System.out.println("=================");
				
				
				
			}
			
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
