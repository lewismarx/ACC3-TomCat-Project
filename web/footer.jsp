<%--
  Created by IntelliJ IDEA.
  User: lewis
  Date: 4/20/16
  Time: 9:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import= "java.util.GregorianCalendar, java.util.Calendar" %><html>
</P>
 <%
    GregorianCalendar currentDate = new GregorianCalendar();
     int currentYear = currentDate.get(Calendar.YEAR);
%> <p>&copy; Copyright <%= currentYear %> Lewis Marx</p> </body> </html>
