<%@page import="java.util.Arrays"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.winter.app.departments.DepartmentDTO"%>
<%@page import="java.util.List"%>
<%@page import="com.winter.app.departments.DepartmentDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%DepartmentDAO departmentDAO = new DepartmentDAO();
    List<DepartmentDTO> ar = departmentDAO.getList();
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>departments</h1>
<table>
	<thead>
	<tr>	`
	<th>DEPARTMENT_ID</th>
	<th>DEPARTMENT_NAME</th>
	<th>MANAGER_ID</th>
	<th>LOCATION_ID</th>
	</tr>
	</thead>
	<tbody>
		<% for(DepartmentDTO departmentDTO:ar){%>
		<tr>
		<td><%= departmentDTO.getDepartment_id() %></td>
		<td><a href="./Detail.jsp?department_id=<%= departmentDTO.getDepartment_id()%>"><%= departmentDTO.getDepartment_name() %></a></td>
		<td><%= departmentDTO.getManager_id() %></td>
		<td><%= departmentDTO.getLocation_id() %></td>
		</tr>
		<%} %> 
	</tbody>
</table>
	<a href="./add.jsp">추가</a>
</body>
</html>