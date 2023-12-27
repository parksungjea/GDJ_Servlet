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
    int a = departmentDAO.add(departmentDTO);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>내가 에이디디프로세스다</h1>
<script type="text/javascript">
let a = <%= a%>;
if(a>0){
	alert("등록 성공")
}else{
	alert("등록 실패")
}
</script>
window.location.href="./list.jsp";


</body>
</html>