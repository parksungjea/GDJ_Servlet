<%@page import="com.winter.app.departments.DepartmentDAO"%>
<%@page import="com.winter.app.departments.DepartmentDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    DepartmentDTO departmentDTO = new DepartmentDTO();
    DepartmentDAO departmentDAO = new DepartmentDAO();
   	String id = request.getParameter("department_id");
   	String name = request.getParameter("department_name");
   	String mid = request.getParameter("manager_id");
   	String lid = request.getParameter("location_id");
   	departmentDTO.setDepartment_id(Integer.parseInt(id));
   	departmentDTO.setDepartment_name(name);
   	departmentDTO.setManager_id(Integer.parseInt(mid));
   	departmentDTO.setLocation_id(Integer.parseInt(lid));
    
   	int b = departmentDAO.update(departmentDTO);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>나는 업데이트의 업글버전인 슈퍼 디데일 업데이트다</h1>
<script type="text/javascript">
let b=<%=b%>;

if(b>0){1
	alert("성공");
}else{
	alert("실패다이놈아");
}
location.href="list.jsp";
</script>
</body>
</html>