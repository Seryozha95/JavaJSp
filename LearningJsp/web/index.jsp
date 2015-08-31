<%-- 
    Document   : index
    Created on : 27.08.2015, 12:00:12
    Author     : Seryozha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.lang.String" session="false" info="TODO INFO" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%! int c = 0;%>
        <%
            int a = 10;
            int b = 10;
            int res = a / b;
            c++;
        %>
        Result a+b = <font color="red"><%= res%> </font>
        <br>
        <font color="blue"><%= c%> </font>
        <form action="myServlet" method="GET">
            Login    <input type="text" name="login"/>
            Pass    <input type="password" name="password"/>
            <input type="submit" name="enter" value="Log In"/>
            <input type="submit" name="register" value="Register"/>
        </form>
        <a href="myServlet">MY SERVLET</a>
    </body>
</html>
