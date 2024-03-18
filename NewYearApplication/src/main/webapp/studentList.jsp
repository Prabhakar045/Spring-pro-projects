<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Student List</title>
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

<h2>Student List</h2>


    <table>
        <tr>
            <th>Student ID</th>
            <th>Student Name</th>
            <th>Email</th>
            <th>College</th>
            <th>Branch</th>
            <th>Action</th>
        </tr>

        <c:forEach var="student" items="${students}">
            <tr>
                <td>${student.getStudentId()}</td>
                <td>${student.getStudentName()}</td>
                <td>${student.getEmail()}</td>
                <td>${student.getCollege()}</td>
                <td>${student.getBranch()}</td>
                <td>
                    <a href="updateStudent?studentId=${student.getStudentId()}">Update</a>
                    &nbsp; &nbsp; &nbsp;
                    <a href="delete?studentId=${student.getStudentId()}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>



</body>
</html>
