<%--
  Created by IntelliJ IDEA.
  User: wangchenghao
  Date: 2017/7/20
  Time: 15:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div id="global">
    <form action="product_save" method="post">
        <fieldset>
            <legend>Add a product</legend>
            <p>
                <label for="name">Product Name:</label>
                <input type="text" id="name" name="name" value="" tabindex="1">
            </p>
            <p>
                <label for="description">description: </label>
                <input type="text" id="description" name="description" value="" tabindex="2">
            </p>
            <p>
                <label for="price">price: </label>
                <input type="text" id="price" name="price" value="" tabindex="3">
            </p>
            <p id="buttons">
                <input id="reset" type="reset" tabindex="4">
                <input id="sumbit" type="submit" tabindex="5" value="Add Product">
            </p>
        </fieldset>
    </form>
</div>
</body>
</html>
