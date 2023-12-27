<%@page import="com.winter.app.regions.RegionDTO"%>
<%@page import="com.winter.app.regions.RegionDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    RegionDAO regionDAO = new RegionDAO();
    RegionDTO regionDTO = new RegionDTO();
    String id = request.getParameter("region_id");
    regionDTO.setRegion_id(Integer.parseInt(id));
    regionDTO = regionDAO.getDetail(regionDTO);
    
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>나는 업데이트</h1>
<form action="./updateProcess.jsp">
<div>
	대륙ID<input type="text" name="region_id" readonly="readonly" value="<%= regionDTO.getRegion_id() %>">
</div>
<div>
	대륙명<input type="text" name="region_name" value="<%= regionDTO.getRegion_name() %>">
</div>
<button>추가</button>
</form>

</body>
</html>