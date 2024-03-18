<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Netflix Content Form</title>
</head>


<body>
    <h1>${message}</h1>
    <h2>Add New Netflix Content</h2>

    <form action="saveNetflix" method="post">

        <label for="title">Title:</label>
        <input type="text" name="title" required> <br> <br>

        <label for="actor">Actor:</label>
        <input type="text" name="actor" required> <br> <br>

        <label for="releaseYear">Release Year:</label>
        <input type="number" name="releaseYear" required> <br> <br>

        <label for="genre">Genre:</label>
        <input type="text" name="genre" required> <br> <br>

        <label for="available">Available:</label>
        <input type="checkbox" name="available"> <br> <br>

        <button type="submit">Add Content</button>
    </form>

</body>
</html>
