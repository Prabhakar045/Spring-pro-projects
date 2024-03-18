<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Update Technology</title>
    <link rel="stylesheet" href="styles.css"> <!-- Link to your external CSS file (styles.css) -->
    <style>
        body {
            font-family: 'Arial', sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
            display: flex;
            align-items: center;
            justify-content: center;
            height: 100vh;
        }

        form {
            background-color: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            max-width: 400px;
            width: 100%;
            box-sizing: border-box;
        }

        h2 {
            text-align: center;
            color: #333;
        }

        label {
            display: block;
            margin-bottom: 8px;
            color: #555;
        }

        input {
            width: 100%;
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #ddd;
            border-radius: 4px;
            box-sizing: border-box;
        }

        input[type="submit"] {
            background-color: #4caf50;
            color: white;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>

<form action="updateTechnology" method="post">
    <h2>Update Technology</h2>

    <input type="hidden" name="id" value="${technology.id}">

    <label for="technologyName">Technology Name:</label>
    <input type="text" name="technologyName" value="${technology.technologyName}">

    <label for="version">Version:</label>
    <input type="text" name="version" value="${technology.version}">

    <label for="yearOfRelease">Year of Release:</label>
    <input type="text" name="yearOfRelease" value="${technology.yearOfRelease}">

    <input type="submit" value="Update">
</form>

</body>
</html>
