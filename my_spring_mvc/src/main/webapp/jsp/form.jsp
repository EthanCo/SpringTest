<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/10/29 0029
  Time: 14:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/quick14" method="post">
    <%--表明是第几个User对象的username、age--%>
    <input type="text" name="userList[0].username"><br/>
    <input type="text" name="userList[0].age"><br/>
    <input type="text" name="userList[1].username"><br/>
    <input type="text" name="userList[1].age"><br/>
    <input type="text" name="userList[2].username"><br/>
    <input type="text" name="userList[2].age"><br/>
    <input type="submit" value="提交">
</form>
</body>
</html>
