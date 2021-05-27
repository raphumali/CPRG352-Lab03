<%-- 
    Document   : ageCalculator
    Created on : May 26, 2021, 3:46:32 PM
    Author     : 786097
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method = "post" action = "age">
            <label>Enter Your Current Age: </label>
            <input type="number" name="user_age"  placeholder="21" min="0" max="150" value="${age}">
             <p>${message}</p>
            <input type="submit" value="Age Next Year">
             <p>${answer}</p>
            <a href="arithmetic">Arithmetic Calculator</a>
                   
        </form>
    </body>
</html>
