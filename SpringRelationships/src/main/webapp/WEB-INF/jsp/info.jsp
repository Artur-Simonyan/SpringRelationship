<!DOCTYPE html>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
    <title>info</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
<div>
    <button type="button"  class="btn btn-default">
        <a href="addProduct" >Add New Product</a>
    </button>
    <button type="button"  class="btn btn-default">
        <a href="/" >Home Page</a>
    </button>
    <button type="button"  class="btn btn-default">
        <a href="product" >Products Page</a>
    </button>
</div>
<div style="width: 50%">
<table class="table">
    <thead class="thead-dark">
    <tr>
        <th>Product</th>
        <th>Price</th>
        <th>Quantity</th>
        <th>Date</th>
        <th>Edit</th>
        <th>Delete</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${inf}" var="index">
        <tr>
            <td>${index.productModel}</td>
            <td>${index.price}</td>
            <td>${index.quanity}</td>
            <td>${index.date}</td>
            <td><a href="/editInfo/${index.infoId}">Edit</a> </td>
            <td><a href="/deleteInfo/${index.infoId}">Delete</a> </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</div>

</body>
</html>