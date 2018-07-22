<%--
  Created by IntelliJ IDEA.
  User: 丶安沫轩
  Date: 2018/7/16
  Time: 12:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${findOne==null?'add':'update'}" method="post" enctype="multipart/form-data">
        <input type="hidden" value="${findOne.uid}" name="uid">
        用户：<input name="uname" value="${findOne.uname}"><br>
        年龄：<input  name="age" value="${findOne.age}"><br>
        汽车：<select name="carEntity.cid">
                    <c:forEach items="${Car}" var="temp">
                        <option
                                <c:if test="${findOne.carEntity.cid==temp.cid}">selected</c:if>
                                value="${temp.cid}">${temp.cname}</option>
                    </c:forEach>
              </select><br>
        图片：<input type="file" name="pic"><br>
        <input type="submit" value="${findOne==null?'提交':'修改'}">
    </form>
</body>
</html>
