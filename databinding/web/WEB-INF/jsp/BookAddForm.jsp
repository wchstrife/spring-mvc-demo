<%--
  Created by IntelliJ IDEA.
  User: wangchenghao
  Date: 2017/7/23
  Time: 17:03
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css"> @import url("<c:url value="/css/main.css"/> "); </style>
</head>
<body>

<div id="global">
    <form:form commandName="book" action="book_save" method="post">
        <fieldset>
            <legend>Add a book</legend>
            <p>
                <label for="category">Category: </label>
                <form:select path="category.id" id="category" items="${categories}" itemLabel="name" itemValue="id"></form:select>
            </p>
            <p>
                <label for="title">Title: </label>
                <form:input path="title" id="title"></form:input>
            </p>
            <p>
                <label for="author">Author: </label>
                <form:input path="author" id="author"></form:input>
            </p>
            <p>
                <label for="isbn">ISBN: </label>
                <form:input path="isbn" id="isbn"></form:input>
            </p>
            <p id="buttons">
                <input id="reset" type="reset" tabindex="4">
                <input id="sumbit" type="submit" tabindex="5" value="Add Book">
            </p>
        </fieldset>
    </form:form>
</div>
</body>
</html>
