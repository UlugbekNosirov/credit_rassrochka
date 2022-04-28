<%--
  Created by IntelliJ IDEA.
  User: Ulug'bek
  Date: 4/27/2022
  Time: 5:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form  method="post">
    <label for="productCount">Enter product Count:</label>
    <input type="number" id="productCount" name="productCount"><br><br>
    <label for="priceOfOne">Price of one:</label>
    <input type="number" id="priceOfOne" name="priceOfOne"><br><br>
    <label for="totallyPrice">Totally Price:</label>
    <input type="number" value="${productCount*priceOfOne}" id="totallyPrice" name="totallyPrice"><br><br>
    <label for="privilegePeriod">Privilege Period:</label>
    <input type="number" id="privilegePeriod" name="privilegePeriod"><br><br>
    <label for="entryDate">Entry date:</label>
    <input type="date" id="entryDate" name="entryDate"><br><br>
    <label for="returnDeadline">Return deadline(month):</label>
    <input type="number" id="returnDeadline" name="returnDeadline"><br><br>
    <label for="returnPrice">Return price(monthly):</label>
    <input type="number" id="returnPrice" name="returnPrice"><br><br>


    <input type="submit" value="Submit">
</form>
</body>
</html>
