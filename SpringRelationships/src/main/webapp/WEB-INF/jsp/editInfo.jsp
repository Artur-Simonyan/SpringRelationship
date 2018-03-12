<!DOCTYPE html>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <title>Edit Info</title>
</head>
<body>
<h1>Edit Product Information</h1>
<form method="post" action="/editInfo">
    <input type="hidden" name="infoId" value="${infoModel.infoId}"/>
    <div class="form-group" style="width: 300px;">
        Product Price:<br>
        <input type="text" name="price" value="${infoModel.price}" class="form-control"/>
    </div>
  <div class="form-group" style="width: 300px;">
      Product Quantity:<br>
      <input type="text" name="quanity" value="${infoModel.quanity}" class="form-control"/>
  </div>
   <div class="form-group" style="width: 300px;">
       Date:<br>
       <input type="text" name="date" value="${addInfo.date}" class="form-control"/>
   </div>
    <input type="submit" value="Submit" class="btn btn-primary">
</form>

</body>
</html>