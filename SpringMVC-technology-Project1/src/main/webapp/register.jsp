<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Technology Form</title>
</head>
<body>
    <h2>Technology Form</h2>


      <c:forEach var="error" items="${errors}">
           <li>${error.defaultMessage}</li>
      </c:forEach>


    <form action="register" method="post">

        <label for="technologyName">Technology Name:</label>
        <input type="text" id="technologyName" name="technologyName" required>
        <br>

        <label for="ownedBy">Owned By:</label>
        <input type="text" id="ownedBy" name="ownedBy" required>
        <br>

        <label for="version">Version:</label>
        <input type="text" id="version" name="version" required>
        <br>


        <label for="yearOfRelease">Year of Release:</label>
        <input type="text" id="yearOfRelease" name="yearOfRelease" required>
        <br>

        <button type="submit">Submit</button>
    </form>
</body>
</html>
