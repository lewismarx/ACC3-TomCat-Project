<%--
  Created by IntelliJ IDEA.
  User: lewis
  Date: 4/13/16
  Time: 7:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>${first} ${last}</title>
    <link rel="stylesheet" href="css/bootstrap.min.css" type="text/css"/>
</head>
<body>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
    <h2>Tables for Class</h2>
    <table class="table table-hover">
        <thead>
        <tr>
            <th>Name</th>
            <th>Headers</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>First and Last Name</td>
            <td>${first} ${last}</td>
        </tr>
        <tr>
            <td> User-Agent </td>
            <td>${useragent}</td>
        </tr>
        <tr>
            <td> Host </td>
            <td>${host}</td>
        </tr>
        <tr>
            <td> Accept </td>
            <td>${accept}</td>
        </tr>
        </tbody>
    </table>
</div>


</body>
</html>
