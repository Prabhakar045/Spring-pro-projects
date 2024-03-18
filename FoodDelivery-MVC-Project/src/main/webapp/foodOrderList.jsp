<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Technology List</title>

</head>

 <h1> ${message} </h1>
<body>

    <h2>Food List</h2>

    <table>
             <tr>
                <th>  Food Id </th>
                <th> Food Name </th>
                <th> Quantity </th>
                <th> Food Price </th>
                <th> Delivery Address </th>
                <th> Customer Name </th>
                <th> Contact Number </th>
             </tr>

             <c:forEach items= "${orderDetails}" var="order">
                <tr>
                    <td> ${order.getId()}  </td>
                    <td> ${order.getFoodName()} </td>
                    <td> ${order.getQuantity()} </td>
                    <td> ${order.getPrice()} </td>
                    <td> ${order.getAddress()} </td>
                    <td> ${order.getCustomerName()} </td>
                    <td> ${order.getContactNumber()} </td>

                    <td>
                        <a href="edit?id=${order.id}"> Update </a>

                        &nbsp &nbsp
                         <a href="delete?id=${order.id}"> Delete </a>
                    </td>
                </tr>
             </c:forEach>

    </table>


</body>
</html>
