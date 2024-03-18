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
    <form action="update" method="post">

        <input type ="hidden"  name="id" value="${foodOrderDTO.id}"> <br>

        <label for="foodName">Food Name:</label>
        <input type="text"  name="foodName" value ="${foodOrderDTO.foodName}"> <br> <br>

        <label for="quantity">Quantity:</label>
        <input type="text"  name="quantity" value ="${foodOrderDTO.quantity}">  <br> <br>

        <label for="price">Price:</label>
        <input type="text"  name="price" value ="${foodOrderDTO.price}"> <br> <br>

        <label for="address">Address:</label>
        <input type="text"  name="address" value ="${foodOrderDTO.address}"> <br> <br>

        <label for="customerName">Customer Name:</label>
        <input type="text"  name="customerName" value ="${foodOrderDTO.customerName}"> <br> <br>

        <label for="contactNumber">Contact Number:</label>
        <input type="text"  name="contactNumber" value ="${foodOrderDTO.contactNumber}">  <br> <br>

        <button type="submit">Submit</button>
    </form>
</body>
</html>
