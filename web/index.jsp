<%--
  Created by IntelliJ IDEA.
  User: 丶安沫轩
  Date: 2018/7/11
  Time: 18:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>$Title$</title>
    <style>
      tr{
        text-align: center;
      }
    </style>
  </head>
  <body>
    <h1><a href="/findCar">增加</a></h1>
      <table border="1" cellspacing="0" width="100%">
        <tr>
          <td>编号</td>
          <td>用户</td>
          <td>年龄</td>
          <td>汽车</td>
          <td>图片</td>
          <td>编辑</td>
        </tr>
        <c:forEach items="${list }" var="temp">
          <tr>
            <td>${temp.uid}</td>
            <td>${temp.uname}</td>
            <td>${temp.age}</td>
            <td>${temp.carEntity.cname}</td>
            <td><img src="/imgs/${temp.img}" width="50px"></td>
            <td>
              <a href="/delete?uid=${temp.uid}">删除</a>|<a href="/findOne?uid=${temp.uid}">修改</a>
            </td>
          </tr>
        </c:forEach>
      </table>
  </body>
</html>
