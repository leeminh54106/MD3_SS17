<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 8/5/2024
  Time: 7:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/add" method="post">
    <input type="checkbox" name="vegetables" value="lettuce">
    <label>Lettuce</label>
    <input type="checkbox" name="vegetables" value="tomato">
    <label>Tomato</label>
    <input type="checkbox" name="vegetables" value="mustard">
    <label>Mustard</label>
    <input type="checkbox" name="vegetables" value="sprouts">
    <label>Sprouts</label>
    <button type="submit">Save</button>
</form>
<c:if test="${not empty selectedVegetables}">
    <p>You selected: ${selectedVegetables}</p>
</c:if>
</body>
</html>
