<%--
  Created by IntelliJ IDEA.
  User: lewis
  Date: 4/20/16
  Time: 7:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.*, edu.acc.java.ServletBean1" contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<? ob_start("ob_gzhandler"); ?>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:if test="${bean.host == 'localhost:8080'}">   <p>${bean.host} is host</p>
</c:if>


</body>
</html>
