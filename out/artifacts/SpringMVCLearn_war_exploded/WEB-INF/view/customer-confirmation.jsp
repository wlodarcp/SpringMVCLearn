<%--
  Created by IntelliJ IDEA.
  User: Paweł
  Date: 22.06.2018
  Time: 16:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer Confirmation Page</title>
</head>
<body>
    First name: ${customer.firstName}
    Last name: ${customer.lastName}

    <br><br>

    Free passes: ${customer.freePasses}

    <br><br>

    Postal code: ${customer.postalCode}
</body>
</html>
