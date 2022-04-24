<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Reading Books</title>
</head>
<body>
    <h1><c:out value="${book.title}"></c:out></h1>
    <p>Description: <c:out value="${book.description}"></c:out></p>
    <p>Language: <c:out value="${book.language}"></c:out></p>
    <p>Number of Pages: <c:out value="${book.numberOfPages}"></c:out></p>
</body>
</html>