<%--
  Created by IntelliJ IDEA.
  User: a
  Date: 24-05-2016
  Time: 15:01
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>SignIn</title>
</head>

<body>
<form action="${createLink(controller: 'login', action: 'welcome')}">
    USERNAME: <input type="text" name="username" value="${loginCO.username}"/><br>
    <g:fieldError bean="${loginCO}"  field="username"/>
    PASSWORD: <input type="password" name="password"/> <br>
    <g:fieldError bean="${loginCO}"  field="password"/>
    <button type="submit">SUBMIT</button> <br>

</form>

</body>
</html>