<%--
  Created by IntelliJ IDEA.
  User: 20190712133
  Date: 2019/8/6
  Time: 21:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>error</title>
</head>
<body>
<form action="<c:url value="/index.html" />" method="post">
    <table align="center" >
        <tr>
            <td>error</td>
        </tr>
        <tr>
            <td colspan="2",align="center">
                <input type="submit" value="返回" />
            </td>
        </tr>
    </table>
</form>
</body>
</html>