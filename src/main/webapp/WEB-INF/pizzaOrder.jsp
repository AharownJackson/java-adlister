<%--
  Created by IntelliJ IDEA.
  User: aharownjackson
  Date: 3/10/23
  Time: 3:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <jsp:include page="../partials/head.jsp">
        <jsp:param name="title" value="Pizza Order"/>
    </jsp:include>
</head>
<body>
<div class="page-wrapper">
    <div class="container d-flex">
        <div class="row d-flex flex-grow-1">
            <div class="col">
                <h1>Order a Pizza!</h1>
                <br>
                <h2>Build your pizza</h2>
                <form method="POST" action="">
                    <label for="crust">Choose your crust:</label>
                    <select name="crust" id="crust">
                        <option value="pan">Pan</option>
                        <option value="hand-tossed">Hand Tossed</option>
                        <option value="thin">Thin</option>
                    </select><br>
                    <label for="sauce">Choose your sauce:</label>
                    <select name="sauce" id="sauce">
                        <option value="classic">Classic Marinara</option>
                        <option value="spice">Spicy Marinara</option>
                    </select>
                    <br>
                    <h3>Choose your toppings:</h3>
                    <h4>Meats</h4>
                    <input type="checkbox" id="pepperoni" name="toppings" value="pepperoni">
                    <label for="pepperoni">Pepperoni</label><br>
                    <input type="checkbox" id="ham" name="toppings" value="ham">
                    <label for="ham">Ham</label><br>
                    <input type="checkbox" id="bacon" name="toppings" value="bacon">
                    <label for="bacon">Bacon</label><br>
                    <input type="checkbox" id="sausage" name="toppings" value="sausage">
                    <label for="sausage">Sausage</label><br>
                    <h4>Non Meats</h4>
                    <input type="checkbox" id="pineapple" name="toppings" value="pineapple">
                    <label for="pineapple">Pineapple</label><br>
                    <input type="checkbox" id="bell-pepper" name="toppings" value="bell-pepper">
                    <label for="bell-pepper">Bell Pepper</label><br>
                    <input type="checkbox" id="onion" name="toppings" value="onion">
                    <label for="onion">Onion</label><br>
                    <input type="checkbox" id="olives" name="toppings" value="olives">
                    <label for="olives">Olives</label><br>
                    <br>
                    <h3>Enter the delivery address:</h3>
                    <label for="address"></label>
                    <textarea id="address" name="address"></textarea>
                    <br>
                    <button>Submit</button>
                </form>
            </div>
        </div>
    </div>
</div>


</body>
</html>
