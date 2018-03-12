<!DOCTYPE html>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <title>Edit Product</title>
</head>
<body>
<h1>Edit Product</h1>
<form method="post" action="/edit">
    <input type="hidden" name="productId" value="${productModel.productId}"/>
    <div class="form-group" style="width: 300px;">
    Product Name:<br>
    <input type="text" name="productName" value="${productModel.productName}" class="form-control"/>
    </div>
    <div class="form-group" style="width: 300px;">
    Department Number(Insert Department Number):<br>
    <input type="text" name="departmantForProduct" value="${productModel.departmantForProduct}" class="form-control"/>
    </div>
    <input type="submit" value="Submit" class="btn btn-primary">
</form>
<br>
<p>1-'Sweet Department'</p>
<p>2-'Bread Department'</p>
<p>3-'Meat Department'</p>
<p>4-'Drinks Department'</p>
<p>5-'Fish Department'</p>

</body>
</html>