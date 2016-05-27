<%--
  Created by IntelliJ IDEA.
  User: a
  Date: 20-05-2016
  Time: 12:33
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>

<body>

<g:each status="i" in="${list}" var="account">
  <g:link controller="balance" action="index" params="[num:account.id]"> Account Number ${i+1} : ${account.number} <br> </g:link>
</g:each>

</body>
</html>