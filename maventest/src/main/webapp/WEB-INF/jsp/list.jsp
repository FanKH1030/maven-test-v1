<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<html>
<head>
    <title>Items List</title>
</head>
<body>
    <h3>查询所有</h3>
    <table style="border:1px" >
        <c:forEach items="${list}" var="items">
            <tr>
                <td>商品id</td>
                <td>商品名称</td>
                <td>商品价格</td>
                <td>商品pic</td>
                <td>生成日期</td>
                <td>商品简介</td>
            </tr>
            <tr>
                <td>${items.id}</td>
                <td>${items.name}</td>
                <td>${items.price}</td>
                <td>${items.pic}</td>
                <td><fmt:formatDate value="${items.createtime}" pattern="yyyy-MM-dd HH:mm:SS"/></td>
                <td>${items.detail}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
