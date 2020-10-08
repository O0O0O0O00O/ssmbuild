<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: IR1S
  Date: 2020/10/8
  Time: 13:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>书籍显示</title>
  <%--bootstrap美化界面--%>
  <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">


</head>
<body>
<div class="container">
  <div class="row clearfix">
    <div class="color-md-12 column">
      <div class="page-header">
        <h1>
          <small>新增书籍</small>
        </h1>
      </div>
    </div>

    <form action="${pageContext.request.contextPath}/book/addBook" method="post">
      <div class="form-group">
        <label>书籍名称：</label>
        <input type="text" class="form-control" name="bookName" required>
      </div>
      <div class="form-group">
        <label>书籍数量：</label>
        <input type="text" class="form-control" name="bookCounts" required>
      </div>
      <div class="form-group">
        <label>书籍描述：</label>
        <input type="text" class="form-control" name="detail" required>
      </div>
      <div class="form-group">
        <input type="submit" class="form-control" value="提交">
      </div>

    </form>





</div>


</div>
</body>
</html>
