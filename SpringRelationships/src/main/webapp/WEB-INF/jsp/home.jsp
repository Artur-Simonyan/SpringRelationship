<!DOCTYPE html>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
    <style>
        .nav navbar-nav {
            display: flex;
            justify-content: center;
            flex-wrap: wrap;
        }
    </style>
    <title>Home</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body style="background-color: #E0E0E0">

<nav class="navbar navbar-default">
    <div class="container-fluid">
        <div>
        <ul class="nav navbar-nav" style="position: absolute;left: 50%;transform: translatex(-50%);">
            <li class="btn btn-link"><a href="product">Product</a></li>
            <li class="btn btn-link"><a href="info">Product Information</a></li>
            <li class="btn btn-link"><a href="staff">Staff</a></li>
            <li class="btn btn-link"><a href="staffSalary">Salary</a></li>
        </ul>
        </div>
    </div>
</nav>

</body>
</html>