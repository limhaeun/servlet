<%@ page import="hello.servlet.domain.member.Member" %>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>

<html>
<head>
  <meta charset="UTF-8">
</head>
<body>
성공
<ul>
  <%--이렇게 해도 되지만,,,--%>
  <%--    <li>id=<%=((Member)request.getAttribute("member")).getId()%></li>--%>
  <%--    <li>username=<%=((Member)request.getAttribute("member")).getUsername()%></li>--%>
  <%--    <li>age=<%=((Member)request.getAttribute("member")).getAge()%></li>--%>
  <%--JSP가 주는표현식 있음--%>
  <li>id=${member.id}</li>
  <li>username=${member.username}</li>
  <li>age=${member.age}</li>
</ul>
<a href="/index.html">메인</a>
</body>
</html>