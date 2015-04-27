<%--
  Created by IntelliJ IDEA.
  User: bakhtiar.galib
  Date: 3/9/15
  Time: 4:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title>Food Bar</title>

    <!-- Bootstrap core CSS -->
    <link rel="stylesheet" href="/FoodBar/resources/css/bootstrap.css" type="text/css">
    <link rel="stylesheet" href="/FoodBar/resources/css/font-awesome.css" type="text/css">

    <link rel="stylesheet" href="/FoodBar/resources/css/star-rating.css" type="text/css">
    <link rel="stylesheet" href="/FoodBar/resources/css/custom.css" type="text/css">
    <link rel="stylesheet" href="/FoodBar/resources/css/styles.css" type="text/css">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]>
    <script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <!--     <script src="../../assets/js/ie-emulation-modes-warning.js"></script> -->

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>

<nav class="navbar navbar-default navbar-fixed-top" role="navigation">

    <div class="container-fluid">

        <div class="navbar-header">

            <button type="button" class="navbar-toggle collapsed"
                    data-toggle="collapse" data-target="#navbar" aria-expanded="false"
                    aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span> <span
                    class="icon-bar"></span> <span class="icon-bar"></span> <span
                    class="icon-bar"></span>
            </button>

            <a class="navbar-brand" href="#"><img src="/FoodBar/resources/images/logo.png" heigh="90px"
                                                  width="90px"/></a>

        </div>

        <div id="navbar" class="collapse navbar-collapse mynavbar">

            <ul class="nav navbar-nav ">

                <li><a href="/FoodBar/">Home</a></li>
                <li><a href="/FoodBar/restaurants/">restuarants</a></li>
                <li><a href="/FoodBar/menuItems/browse">food Items</a></li>
                <li><a href="/FoodBar/about/">About Us</a></li>

            </ul>

            <span class="pull-right" style="margin-top: -80px;">
                <a href="/FoodBar/login" class="btn btn-default">login</a>
                <a href="/FoodBar/signup" class="btn btn-default">signUp</a>
            </span>


        </div>
        <!--/.nav-collapse -->

    </div>
</nav>
