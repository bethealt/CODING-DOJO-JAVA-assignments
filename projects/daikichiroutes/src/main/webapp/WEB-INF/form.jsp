<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Omikuji Form</title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- for application CSS and JS-->
        <link rel="stylesheet" type="text/css" href="/css/styles.css">
        <script type="text/javascript" src=""></script>
        <!-- for Bootstrap CSS -->
        <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
        <!-- For Bootstrap that uses JS or jQuery-->
        <script src="/webjars/jquery/jquery.min.js"></script>
        <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    </head>
    <body>
        <h1>Send an Omikuji!</h1>
        <div class="container">
            <form action="/send" method="POST">
                <div class=""mb-3">
                    <label for="random" class="form-label">Pick a number from 5 to 25</label>
                    <input type="number" class="form-control" id="random" min="5" max="25">
                </div>
                <div class="mb-3">
                    <label for="city" class="form-label">Enter the name of any city</label>
                    <input type="email" class="form-control" id="city" placeholder="Nairobi">
                </div>
                <div class="mb-3">
                    <label for="name" class="form-label">Enter the name of any real person</label>
                    <input type="text" class="form-control" id="name" placeholder="Bob Dylan">
                </div>
                <div class="mb-3">
                    <label for="hobby" class="form-label">Enter professional endeavor or hobby:</label>
                    <input type="text" class="form-control" id="hobby" placeholder="selling origamis">
                </div>
                <div class="mb-3">
                    <label for="living" class="form-label">Enter any type of living thing</label>
                    <input type="text" class="form-control" id="living" placeholder="ferret">
                </div>
                <div class="mb-3">
                    <label for="nice" class="form-label">Say something nice to someone</label>
                    <textarea class="form-control" id="nice" rows="4" placeholder="You do not realize how happy you make others."></textarea>
                </div>
                <div class="mb-3">
                    <label for="send" class="form-label"><i>Send and show a friend</i></label>
                    <input type="submit" class="form-control" id="send" value="Send">
                </div>
            </form>
        </div>
    </body>
</html>