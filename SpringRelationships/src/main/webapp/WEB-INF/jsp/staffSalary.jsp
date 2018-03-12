<!DOCTYPE html>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
    <title>Salary</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
<div>
    <button type="button"  class="btn btn-default"><a href="/">Home Page</a></button>
</div>
<div style="width: 300px;">
<table class="table">
    <thead class="thead-dark">
    <tr>
        <th>Staff</th>
        <th>Salary</th>
    </tr>
    </thead>
  <tbody>
    <c:forEach items="${salaryinfo}" var="index">
        <tr>
            <td>${index.staffName}</td>
            <td>${index.salaryModelSet}</td>
        </tr>
    </c:forEach></tbody>
</table>
</div>

</body>
</html>