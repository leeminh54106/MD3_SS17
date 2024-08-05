<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 8/5/2024
  Time: 7:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Caculator</h1>
<form action="<%=request.getContextPath()%>/caculator" method="post">
    <input type="number" name="input1" placeholder="number">
    <input type="number" name="input2" placeholder="number">
    <br>
    <button type="submit" name="btnCal" value="add">Addition+</button>
    <button type="submit" name="btnCal" value="sub">Subtraction-</button>
    <button type="submit" name="btnCal" value="mul">Multiplication*</button>
    <button type="submit" name="btnCal" value="divi">Division/</button>
</form>
<h3>Result ${calName}: ${result}</h3>
</body>
</html>
