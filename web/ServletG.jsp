<%--
  Created by IntelliJ IDEA.
  User: lewis
  Date: 4/20/16
  Time: 6:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
    <h2>Bordered Table</h2>
    <p>The .table-bordered class adds borders to a table:</p>
    <table class="table table-bordered">
        <thead>
        <tr>
            <th>Accept</th>
            <th>Host</th>
            <th>User-Agent</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>${bean.accept}</td>
            <td>${bean.host}</td>
            <td>${bean.useragent}</td>
        </tr>
        </tbody>
    </table>
</div>

</body>
</html>
