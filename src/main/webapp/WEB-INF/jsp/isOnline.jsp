<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/4/27
  Time: 17:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    session = request.getSession();
    session.setAttribute("username",request.getParameter("uName"));
    response.sendRedirect("showOnline.jsp");
%>

<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
