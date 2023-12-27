<%@page import="com.winter.app.departments.DepartmentDAO"%>
<%@page import="com.winter.app.departments.DepartmentDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    DepartmentDTO departmentDTO = new DepartmentDTO();
    DepartmentDAO departmentDAO = new DepartmentDAO();
    String n = request.getParameter("department_id");
    int num = Integer.parseInt(n);
    departmentDTO.setDepartment_id(num);
    departmentDTO = departmentDAO.getDetail(departmentDTO);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Department</h1>
<h3><%= departmentDTO.getDepartment_name() %></h3>
<a href="./update.jsp?department_id=<%=departmentDTO.getDepartment_id()%>"><button>수정</button></a>
</body>
</html>