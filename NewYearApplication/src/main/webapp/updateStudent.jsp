<%@ page language="java" contentType="text/html; charset=US-ASCII"
pageEncoding="US-ASCII"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Student Registration Form</title>
</head>
<body>

    <h2>Update page</h2>

    <form action="updateStudent" method="post">
        <h2>Update Student</h2>

        <input type="hidden" name="studentId" value="${student.getStudentId()}">

        <label for="studentName">Student Name:</label>
        <input type="text" name="studentName" value="${student.getStudentName()}">

        <label for="email">Email:</label>
        <input type="text" name="email" value="${student.getEmail()}">

        <label for="college">College:</label>
        <input type="text" name="college" value="${student.getCollege()}">

        <label for="branch">Branch:</label>
        <input type="text" name="branch" value="${student.getBranch()}">

        <input type="submit" value="Update">
    </form>
</body>
</html>
