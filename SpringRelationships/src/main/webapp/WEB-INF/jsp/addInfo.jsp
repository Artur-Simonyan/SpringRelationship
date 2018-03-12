<!DOCTYPE html>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
    <title>Add Information</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
<h1>Add New Product Information</h1>
<form method="post" action="/addInfo">
    <div class="form-group" style="width: 300px;">
        Price:<br>
        <input type="text" name="price" value="${addInfo.price}" />
    </div>
 <div class="form-group" style="width: 300px;">
     Quantity:<br>
     <input type="text" name="quanity" value="${addInfo.quanity}" />
 </div>
   <div class="form-group" style="width: 300px;">
       Date:<br>
       <input type="text" name="date" value="${addInfo.date}" />
   </div>
    <input type="submit" value="Submit" class="btn btn-primary">
</form>

</body>
</html>