<%--
  Created by IntelliJ IDEA.
  User: lewis
  Date: 4/20/16
  Time: 6:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.*, edu.acc.java.ServletBean1" contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="bean" class="edu.acc.java.ServletBean1" scope="request" />
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="header.html" />




    <h2>Properties multiple times</h2>
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
        <tr>
            <td><jsp:getProperty name="bean" property="accept"></jsp:getProperty></td>
            <td><jsp:getProperty name="bean" property="host"></jsp:getProperty></td>
            <td><jsp:getProperty name="bean" property="useragent"></jsp:getProperty></td>
        </tr>
        <%
            String host = request.getHeader("host");
            String accept = request.getHeader("accept");
            String useragent = request.getHeader("user-agent");
            ServletBean1 beans = new ServletBean1(host,accept,useragent);
            String hosts = (String) beans.getHost();
            String accepts = (String) beans.getAccept();
            String  useragents = (String) beans.getUseragent();
           %>
        <tr>
            <td><%= accepts%></td>
            <td><%= hosts%></td>
            <td><%= useragents%></td>
        </tr>
        </tbody>
    </table>
</div>

<c:import url="footer.jsp" />
