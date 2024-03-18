<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Technology List</title>
    <style>
        table {
            font-family: Arial, sans-serif;
            border-collapse: collapse;
            width: 80%;
            margin: 20px auto;
        }

        th, td {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>

    <h2>Technology List</h2>

    <table>

        <tr>
            <th>Technology ID</th>
            <th>Technology Name</th>
            <th>Version</th>
            <th>Year of Release</th>
            <th>Action</th>
        </tr>

        <c:forEach items="${technologies}" var="technology">
            <tr>
                <td>${technology.id}</td>
                <td>${technology.technologyName}</td>
                <td>${technology.version}</td>
                <td>${technology.yearOfRelease}</td>
                <td>
                    <a href="edit?id=${technology.id}">Edit</a>
                    &nbsp; &nbsp; &nbsp;
                    <a href="delete?id=${technology.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>

    </table>

</body>
</html>
