<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<title>Trang chủ</title>
</head>
<body>
	<div class="container-fluid">
		<!-- phần Header : 3 cột   -->
		<div class="row text-center">
			<div class="col-1">Logo</div>
			<div class="col-10 p-3 bg-info">
				<h1>Header</h1>
			</div>
			<div class="col-1">${user.fullname}</div>
		</div>
		
		<!-- nav -->
		<div class="row bg-warning text-center" style="height:40px">
			<div class="col-12 pt-2">
				<a href="/Java3_asm/post">Department</a>&nbsp;
				<a href="/lab7/employee/show">Employees</a>&nbsp;
			</div>
		</div>
		
		<!-- phần nội dung -->
		<div class="row my-3" style="min-height:600px;height:auto">
			
			<div class="container col-8 p-3 border">
				<jsp:include page="${papeContext.request.contextPath}/views/${page}" />
			</div>
			
			
		</div>

		<!-- footer -->
		<div class="row p-3 bg-info text-center" ><h1>Footer</h1></div>
	</div>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>