<%--
  Created by IntelliJ IDEA.
  User: lewis
  Date: 4/25/16
  Time: 8:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>${storage1.cookiename} ${storage1.cookiecontent} </title>
</head>
<body>
<h3>${storage1.cookiename}'s value is ${storage1.cookiecontent} </h3>
<h2>${storage1.maxage} is the Maximum Age of the stored cookie</h2>
<h1>cookie name list <a>${cookienamelist}</a></h1>
<h1>cookie vals list <a>${cookievallist}</a> </h1>
</body>
</html>
