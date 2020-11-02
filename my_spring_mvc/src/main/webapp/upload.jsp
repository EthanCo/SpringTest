<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/11/2 0002
  Time: 17:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>上传</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/quick22" method="post" enctype="multipart/form-data">
        名称:<input type="text" name="username"><br/>
        文件:<input type="file" name="uploadFile"><br/>
        <input type="submit" value="提交">
    </form>
</body>
</html>
