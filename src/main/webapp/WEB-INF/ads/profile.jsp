<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="../../partials/head.jsp">
        <jsp:param name="title" value="Your Profile"/>
    </jsp:include>
</head>
<body>
<div class="page-wrapper">

    <jsp:include page="../../partials/navbar.jsp"/>

    <div class="container">
        <div class="row">
            <div class="column">

                <h1>Welcome.</h1>
                <form method="POST" action="/logout">
                    <button id="logout">Logout</button>
                </form>
            </div>
        </div>
    </div>
</div>


</body>
</html>
