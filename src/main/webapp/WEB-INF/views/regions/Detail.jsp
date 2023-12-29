<%@page import="com.winter.app.regions.RegionDTO"%>
<%@page import="com.winter.app.regions.RegionDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
/*     	RegionDAO regionDAO = new RegionDAO();
    	RegionDTO regionDTO = new RegionDTO();
    	String n = request.getParameter("region_id");
    	int num = Integer.parseInt(n);
    	regionDTO.setRegion_id(num);
   		regionDTO = regionDAO.getDetail(regionDTO); */
   		//RegionDTO regionDTO = (RegionDTO)request.getAttribute("dto");
   		
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Region Detail</h1>
	<h3>${requestScope.dto.region_id}</h3>
	<h3>${requestScope.dto.region_name}</h3>
	<input id="rId" type="hidden" value="${requestScope.dto.region_id}">
	<button id="btn">수정</button>
	<script type="text/javascript">
		let btn = document.getElementById('btn');
	let v = document.getElementById('rId')
		btn.addEventListener("click", function(){
			location.href="./update.jsp?region_id="+v.value;
		});
	
	</script>
</body>
</html>