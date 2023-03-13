<%--
  Created by IntelliJ IDEA.
  User: aharownjackson
  Date: 3/13/23
  Time: 9:07 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
  <title>guess</title>
</head>
<body>
<div class="page-wrapper">
  <div class="container">
    <div class="row">
      <div class="column">
        <h1>Guessing Game</h1>
        <form method="POST" action="">
          <label for="guess">Choose a number between 1 and 3:</label>
          <input type="text" id="guess" name="guess">
          <button>Submit</button>
        </form>
      </div>
    </div>
  </div>
</div>
</body>
</html>
