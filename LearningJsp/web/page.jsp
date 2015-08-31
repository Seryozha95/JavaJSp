<%-- 
    Document   : page
    Created on : 29.08.2015, 9:35:25
    Author     : Seryozha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String login = request.getParameter("login");
            String enter = request.getParameter("enter");
            String reg = request.getParameter("register");
        %>
         <p><font color="blue">LOGIN <%= login%></font></p>
         <p><font color="green">ENTER <%= enter%></font></p>
         <p><font color="green">REGISTER <%= reg%></font></p>
    </body>
</html>
