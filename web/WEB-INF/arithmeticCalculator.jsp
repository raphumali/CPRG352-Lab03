<%-- 
    Document   : arithmeticCalculator
    Created on : May 26, 2021, 3:46:51 PM
    Author     : 786097
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
         <h1>Arithmetic Calculator</h1>
        <form method = "post" action = "arithmetic">
            <label>First: </label>
            <input type="text" name="first_number"  placeholder="1" value="${firstNumber}">
            <br>
            <label>Second: </label>
            <input type="text" name="second_number"  placeholder="2" value="${secondNumber}">
            <br>
            <input type="submit" value="+" name="pressed">
            <input type="submit" value="-" name="pressed">
            <input type="submit" value="*" name="pressed">
            <input type="submit" value="%" name="pressed">
            <p>Result: ${placeholder}${answer}${message}</p>
            <a href="age">Age Calculator</a>
                   
        </form>
    </body>
</html>
