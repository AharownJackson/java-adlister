<%--
  Created by IntelliJ IDEA.
  User: aharownjackson
  Date: 3/10/23
  Time: 9:08 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    String method = request.getMethod();

    if (method.equals("POST")) {
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    if (username.equals("admin") && password.equals("password")) {
        response.sendRedirect("/profile.jsp");
    } else {
        response.sendRedirect("/login.jsp");
    }

    }

%>

<html>
<head>
    <title>Login Page</title>
</head>
<body>

    <h1>Login Form</h1>

    <form method="post" action="/login.jsp">
        <label for="username">Username</label>
        <input type="text" id="username" name="username">
        <label for="password">password</label>
        <input type="text" id="password" name="password">
        <button>Login</button>
    </form>


</body>
</html>
