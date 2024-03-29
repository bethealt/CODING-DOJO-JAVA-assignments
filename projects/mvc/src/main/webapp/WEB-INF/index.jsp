<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Read Share</title>
</head>
<body>
    <h1>All Books</h1>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Title</th>
                <th>Language</th>
                <th>Number of Pages</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="book" items="${books}">
                <tr>
                    <td><c:out value="${book.id}"></c:out></td>
                    <td><a href="/books/${book.id}"><c:out value="${book.title}"></c:out></a></td>
                    <td><c:out value="${book.language}"></c:out></td>
                    <td><c:out value="${book.numberOfPages}"></c:out></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>