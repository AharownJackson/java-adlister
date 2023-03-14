<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="../../partials/head.jsp">
        <jsp:param name="title" value="Welcome to my site!"/>
    </jsp:include>
</head>
<body>
<div class="page-wrapper">

    <%--    nav bar--%>
    <jsp:include page="../../partials/navbar.jsp"/>

    <div class="container">
        <div class="row">
            <div class="column">
                <%--                header--%>
                <h1>Welcome to the Adlister!</h1>
            </div>
            <div class="column">
                <%--                ads --%>
                <c:forEach var="ad" items="${ads}">
                    <div>
                        <h2>${ad.title}</h2>
                        <p>${ad.description}</p>
                    </div>
                </c:forEach>
            </div>
        </div>
    </div>


    <%--loop through all the ads and display each one.--%>

</div>
</body>
</html>
