<%--
  Created by IntelliJ IDEA.
  User: TQ
  Date: 2019/11/24
  Time: 18:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index</title>
</head>
<body>
<h3><a href="account/findAll">测试查询</a></h3>

<h3>测试增加</h3>

<form action="account/save" method="post">
    姓名：<input type="text" name="name" /><br/>
    金额：<input type="text" name="money" /><br/>
    <input type="submit" value="保存"/><br/>
</form>
</body>
</html>
