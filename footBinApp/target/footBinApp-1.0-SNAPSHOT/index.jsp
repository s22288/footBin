<%--<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>--%>
<%--<!DOCTYPE html>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <title>JSP - Hello World</title>--%>
<%--</head>--%>
<%--<body>--%>
<%--<h1><%= "Hello World!" %>--%>
<%--</h1>--%>
<%--<br/>--%>
<%--<a href="hello-servlet">Hello Servlet</a>--%>
<%--</body>--%>
<%--</html>--%>
<%--
  Created by IntelliJ IDEA.
  User: Michał
  Date: 12.05.2022
  Time: 17:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Footbin App</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <style>

        #image
        {
            width: 100%;
        }

        a {
            color: firebrick;
            font-size: 15px;

            font-family: "Arial Black";
            text-decoration: none;
        }


        .circle {
background-image: url("https://www.innerdrive.co.uk/wp-content/uploads/2019/01/Football-sport-psych-hero.png");
            width: 70px;
            height: 70px;
            line-height: 70px;
            border-radius: 50%;
            font-size: 50px;
            text-align: center;


        }
    </style>
</head>
<body >
<div>

    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <a class="navbar-brand" href="#">FootBin App</a>
        <img src="http://cdn.onlinewebfonts.com/svg/img_571584.png" width="30" height="30" alt="">


        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

    </nav>
</div>




<%-- tlo dla aplikacji o piłce noznej--%>





<div class="container-fluid" style="color:black ;background-color: black" >

    <div class="row">
        <div class="col">
            <div class="circle"><a class="fa fa-soccer-ball-o" href="/footBinApp_war_exploded/about">About</a></div>
        </div>
        <div class="col">
            <div class="circle"><a  class="fa fa-soccer-ball-o" href="/footBinApp_war_exploded/players">Players</a></div>
        </div>
        <div class="col">

            <div class="circle"><a class="fa fa-soccer-ball-o" href="/footBinApp_war_exploded/build-team">Build</a></div>
        </div>

    </div>


</div>



<img style="width:100%;" id="image" src="https://wallpaperaccess.com/full/3278874.jpg">








<%--        <div class="circle"> <a href="/naive"> Top List </a> </div>--%>



<%--dolna czesc strony--%>


<!-- Jumbotron -->

<footer class="bg-light text-center text-lg-start">
    <!-- Copyright -->
    <div class="text-center p-3" style="background-color: rgba(0, 0, 0, 0.2);">
        © 2020 Copyright:
        <a class="text-dark" href="https://mdbootstrap.com/">Football Clubs</a>
    </div>
    <!-- Copyright -->
</footer>


<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js"
        integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"
        integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13"
        crossorigin="anonymous"></script>
</body>
</html>
