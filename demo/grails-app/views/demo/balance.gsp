<%--
  Created by IntelliJ IDEA.
  User: a
  Date: 25-05-2016
  Time: 17:25
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>
You have Rs. ${result.getBalance().savingsBalance} in Account number ${result.getNumber()} <br>
<g:link controller="balance" action="withdraw">WITHDRAW</g:link> <br>
<g:link controller="balance" action="transfer">TRANSFER</g:link>
<body>

</body>
</html>