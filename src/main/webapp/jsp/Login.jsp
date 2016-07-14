<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/4/27
  Time: 17:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    session=request.getSession(false);
    if(session!=null){
        session.invalidate();
    }
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="isOnline.jsp" method="post">
    username:<input type="text" name="uName"/>
    <input type="submit" value="上线">
</form>

</body>
</html>
