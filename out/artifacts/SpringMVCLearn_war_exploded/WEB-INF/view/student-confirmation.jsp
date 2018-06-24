<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: Paweł
  Date: 21.06.2018
  Time: 20:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Confirmation </title>
</head>
<body>
The student is confirmed: ${student.firstName} ${student.lastName}

<br><br>
Favorite Language: ${student.favoriteLanguage}
<br><br>

Operating systems:

<ul>
    <c:forEach var="temp" items="${student.operatingSystems}">
        <li> ${temp} </li>
    </c:forEach>

</ul>

<br><br>
Country: ${student.country}

</body>
</html>
