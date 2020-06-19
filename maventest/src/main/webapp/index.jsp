<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>ssm-maven</title>
</head>
<body>
<h3>ssm-maven</h3>
<h4>查询所有</h4>
<a href="${pageContext.request.contextPath}/items/findAll">findAll</a>
<h4>插入items</h4>
<form action="${pageContext.request.contextPath}/items/insertItems" method="post">
    name:<input name="name" value="滴滴2"><br/>
    price:<input name="price" value="5555.5"><br/>
    pic:<input name="pic" value="444"><br/>
    createtime:<input name="createtime" value="2020-03-15 15:40:46"><br/>
    detail:<input name="detail" value="广西壮族自治区"><br/>
    <input type="submit" value="增加"><br/>
</form>
<h4>修改items</h4>
<form action="${pageContext.request.contextPath}/items/updateItems" method="post">
    id:<input name="id" value="10"><br/>
    name:<input name="name" value="滴滴3"><br/>
    price:<input name="price" value="8888.8"><br/>
    pic:<input name="pic" value="555"><br/>
    createtime:<input name="createtime" value="2020-03-15 15:40:46"><br/>
    detail:<input name="detail" value="广西壮族自治区"><br/>
    <input type="submit" value="修改"><br/>
</form>
<h4>根据ID删除</h4>
<a href="${pageContext.request.contextPath}/items/deleteItems?id=10">deleteItem</a>
</body>
</html>
