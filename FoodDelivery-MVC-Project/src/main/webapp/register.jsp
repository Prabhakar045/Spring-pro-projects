<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title></title>
</head>
<body>
    <h1>${message}</h1>
    <form action="register" method="post">

        <label for="foodName">Food Name:</label>
        <input type="text"  name="foodName"> <br> <br>

        <label for="quantity">Quantity:</label>
        <input type="text"  name="quantity">  <br> <br>

        <label for="price">Price:</label>
        <input type="text"  name="price"> <br> <br>

        <label for="address">Address:</label>
        <input type="text"  name="address"> <br> <br>

        <label for="customerName">Customer Name:</label>
        <input type="text"  name="customerName"> <br> <br>

        <label for="contactNumber">Contact Number:</label>
        <input type="text"  name="contactNumber">  <br> <br>

        <button type="submit">Submit</button>
    </form>
</body>
</html>
