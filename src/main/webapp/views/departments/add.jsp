<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>내가 에이디디다</h1>
<form action="./addProcess.jsp">
<div>
	DEPARTMENT_ID: <input type="text" name="department_id">
</div>
<div>
	DEPARTMENT_NAME: <input type="text" name="department_name">
</div>
<div>
	MANAGER_ID: <input type="text" name="manager_id">
</div>
<div>
	LOCATION_ID: <input type="text" name="location_id">
</div>
<button>추가</button>
</form>
</body>
</html>