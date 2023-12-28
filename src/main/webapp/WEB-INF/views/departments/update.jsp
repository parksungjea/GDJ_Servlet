<%@page import="java.util.List"%>
<%@page import="com.winter.app.departments.DepartmentDAO"%>
<%@page import="com.winter.app.departments.DepartmentDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    DepartmentDTO departmentDTO = new DepartmentDTO();
    DepartmentDAO departmentDAO = new DepartmentDAO();
    String id = request.getParameter("department_id");
    departmentDTO.setDepartment_id(Integer.parseInt(id));
    departmentDTO = departmentDAO.getDetail(departmentDTO);
    
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>나는 업데이트다</h1>
<form action="./updateDetail.jsp">
	<div>
	DEPARTMENT_ID: <input type="text" name="department_id" readonly="readonly" value="<%= departmentDTO.getDepartment_id() %>" >
	</div>
	
	<div>
	DEPARTMENT_NAME: <input type="text" name="department_name" value="<%= departmentDTO.getDepartment_name()%>">
	</div>
	
	<div>
	MANAGER_ID: <input type="text" name="manager_id" value="<%= departmentDTO.getManager_id()%>">
	</div>
	
	<div>
	LOCATION_ID: <input type="text" name="location_id" value="<%=departmentDTO.getLocation_id() %>">
	</div>
	<button>수정</button>
	
</form>
</body>
</html>