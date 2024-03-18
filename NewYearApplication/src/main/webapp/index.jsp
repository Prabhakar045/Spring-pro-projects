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

    <h2>Student Registration Form</h2>

    <form action="register" method="post">

        <label for="studentId">Student ID:</label>
        <input type="text" id="studentId" name="studentId" required><br><br>

        <label for="studentName">Student Name:</label>
        <input type="text" id="studentName" name="studentName" required><br><br>

        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required><br><br>

        <label for="college">College:</label>
        <input type="text" id="college" name="college" required><br><br>

        <label for="branch">Branch:</label>
        <input type="text" id="branch" name="branch" required><br><br>

        <input type="submit" value="Register">

    </form>

</body>
</html>
