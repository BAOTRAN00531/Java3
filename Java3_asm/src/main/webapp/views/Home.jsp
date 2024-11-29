<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>main</title>
</head>
<body>
	<table border="1" style="width: 50%">
		<thead>
			<tr>
				<th>No.</th>
				<th>Id</th>
				<th>Name</th>
				<th>Description</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="d" items="${list}" varStatus="vs">
				<tr>
					<td>${vs.count}</td>
					<td>${d.id}</td>
					<td>${d.title}</td>
					<td>${d.content}</td>
					<td><img src="/Java3_asm/images/${d.image}" style="width:300px;height:350px;" /><br></td>
				</tr>
			</c:forEach>
		</tbody>
	</table><br>
</body>
</html>