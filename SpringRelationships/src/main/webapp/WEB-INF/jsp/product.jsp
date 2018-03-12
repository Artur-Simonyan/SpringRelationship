<!DOCTYPE html>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
    <title>product</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
<div>
<button type="button"  class="btn btn-default">
<a href="addProduct">Add New Product</a></button>
<button type="button"  class="btn btn-default">
<a href="/" >Home Page</a></button></div>

<div style="width: 300px;">
<table class="table">
    <thead  class="thead-dark">
    <tr>
        <th>Product Name</th>
        <th>Department</th>
        <th>Edit</th>
        <th>Delete</th>
    </tr></thead>
    <tbody>
    <c:forEach items="${productinfo}" var="index">
        <tr>
            <td>${index.productName}</td>
            <td>${index.departmantForProduct}</td>
            <td><a href="/edit/${index.productId}">Edit</a> </td>
            <td><a href="/delete/${index.productId}">Delete</a> </td>
        </tr>
    </c:forEach>
    </tbody>
</table></div>
</body>
</html>