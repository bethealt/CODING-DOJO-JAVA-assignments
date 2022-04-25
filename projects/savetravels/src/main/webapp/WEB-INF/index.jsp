<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Save Travels</title>
</head>
<body>
    <div>
        <h1>Save Travels</h1>
        <table>
            <thead>
                <tr>
                    <th>Expense Name</th>
                    <th>Vendor Name</th>
                    <th>Amount</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="expense" items="${expenses}">
                    <tr>
                        <td><c:out value="${expense.name}"></c:out></td>
                        <td><c:out value="${expense.vendor}"></c:out></td>
                        <td><c:out value="${expense.amount}"></c:out></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
    <div>
        <h1>Add an expense:</h1>
        <form:form action="/expenses" method="POST" modelAttribute="expense">
            <p>
                <form:label path="name">Expense Name</form:label>
                <form:errors path="name"></form:errors>
                <form:input path="name"></form:input>
            </p>
            <p>
                <form:label path="vendor">Vendor Name</form:label>
                <form:errors path="vendor"></form:errors>
                <form:input path="vendor"></form:input>
            </p>
            <p>
                <form:label path="amount">Amount</form:label>
                <form:errors path="amount"></form:errors>
                <form:input path="amount"></form:input>
            </p>
            <p>
                <form:label path="description">Description</form:label>
                <form:errors path="description"></form:errors>
                <form:input path="description"></form:input>
            </p>
            <input type="submit" value="Submit"/>
        </form:form>
    </div>
    
</body>
</html>