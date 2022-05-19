<%@ page import="com.example.footBinApp.entities.Player" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%List<Player> players = (List<Player>) request.getAttribute("listOfPlay");%>
<html>
<head>
    <title>Players List</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"/>

<style>
    img {
        border-radius: 50%;
    }

</style>
</head>
<body>

<!-- As a link -->
<nav class="navbar navbar-light bg-light">
    <h2 class="navbar-brand" style="font-family: monospace;size: 20px">Search for Players</h2>
    <a style="color: black ;text-decoration: none" class="ui-button" href="/footBinApp_war_exploded">Main Page</a>

</nav>
<form>

<div class="row">
    <div class="col">
        <input name="fname" type="text" class="form-control" placeholder="First name" aria-label="First name">
    </div>
    <div class="col">
        <input name="lname" type="text" class="form-control" placeholder="Last name" aria-label="Last name">
    </div>
</div>

<div class="row">
    <div class="col">
        <input name="lmax" type="text" class="form-control" placeholder="Max Price" aria-label="First name">
    </div>
    <div class="col">
        <input name="lmin" type="text" class="form-control" placeholder="Min Price" aria-label="Last name">
    </div>
</div>
<div class="row">
    <div class="col">
        <input name="lpos" type="text" class="form-control" placeholder="Position" aria-label="First name">
    </div>
    <div class="col">
        <input name="lcou" type="text" class="form-control" placeholder="Country" aria-label="First name">
    </div>
</div>

    <input type="submit" value="Szukaj">

</form>
<%-- formularz--%>

<%--    formularz --%>
<%--    <div>--%>


<%--        <form action="/footBinApp_war_exploded/players">--%>
<%--            <label for="fname">First name:</label><br>--%>
<%--            <input type="text" id="fname" name="fname" value=""><br>--%>
<%--            <label for="lname">Last name:</label><br>--%>
<%--            <input type="text" id="lname" name="lname" value=""><br><br>--%>
<%--            <label for="lname">Minimum Price:</label><br>--%>
<%--            <input type="text" id="lmin" name="lmin" value=""><br><br>--%>
<%--            <label for="lname">Maximum Price:</label><br>--%>
<%--            <input type="text" id="lmax" name="lmax" value=""><br><br>--%>
<%--            <label for="lname">Position:</label><br>--%>
<%--            <input type="text" id="lpos" name="lpos" value=""><br><br>--%>
<%--            <label for="lname">Age:</label><br>--%>
<%--            <input type="text" id="lage" name="lage" value=""><br><br>--%>
<%--            <label for="lname">Country:</label><br>--%>
<%--            <input type="text" id="lcou" name="lcou" value=""><br><br>--%>
<%--            <label for="lname">Height:</label><br>--%>
<%--            <input type="text" id="lhig" name="lhig" value=""><br><br>--%>
<%--            <label for="lname">Number:</label><br>--%>
<%--            <input type="text" id="lnum" name="lnum" value=""><br><br>--%>
<%--            <input type="submit" value="Submit">--%>

<%--        </form>--%>

<%--</div>--%>
<table class="table table-dark">
    <thead>
    <tr>
        <th>FirstName</th>
        <th>LastName</th>
        <th>Price</th>
        <th>Position</th>
        <th>Age</th>
        <th>Country</th>
        <th>Height</th>
        <th>Number</th>
        <th>Photo</th>
    </tr>
    </thead>
    <tbody>
    <% for (int i = 0; i < players.size(); i++) {%>
    <tr>
        <% Player player = (Player) players.get(i);%>
        <td>
            <%=
            player.getFirstName()
            %>
        </td>
        <td>
            <%=
            player.getLastName()
            %>
        </td>
        <td>
            <%=
            player.getPrice() + " MLN"
            %>
        </td>
        <td>
            <%=
            player.getPosition()
            %>
        </td>
        <td>
            <%=
            player.getAge()
            %>
        </td>
        <td>
            <%=
            player.getCountry()
            %>
        </td>
        <td>
            <%=
            player.getHeight() + " CM"
            %>
        </td>
        <td>
            <%=
            player.getNumber()
            %>
        </td>
        <td>

            <img src="<%=
        player.getPhoto()
        %>" alt="Girl in a jacket" style="height: 100px ;width: 100px">


        </td>
    </tr>

    <%}%>
    </tbody>


</table>


<%--<table class="table table-striped">--%>
<%--    <thead>--%>
<%--    <tr>--%>
<%--        <th scope="col">#</th>--%>
<%--        <th scope="col">First</th>--%>
<%--        <th scope="col">Last</th>--%>
<%--        <th scope="col">Handle</th>--%>
<%--    </tr>--%>
<%--    </thead>--%>
<%--    <tbody>--%>
<%--    <tr>--%>
<%--        <th scope="row">1</th>--%>
<%--        <td>Mark</td>--%>
<%--        <td>Otto</td>--%>
<%--        <td>@mdo</td>--%>
<%--    </tr>--%>
<%--    <tr>--%>
<%--        <th scope="row">2</th>--%>
<%--        <td>Jacob</td>--%>
<%--        <td>Thornton</td>--%>
<%--        <td>@fat</td>--%>
<%--    </tr>--%>
<%--    <tr>--%>
<%--        <th scope="row">3</th>--%>
<%--        <td>Larry</td>--%>
<%--        <td>the Bird</td>--%>
<%--        <td>@twitter</td>--%>
<%--    </tr>--%>
<%--    </tbody>--%>
<%--</table>--%>


<div class="card bg-dark text-white">
    <img class="card-img" src="https://wallpaperaccess.com/full/1637813.jpg" alt="Card image">
    <div class="card-img-overlay">
    </div>
</div>


<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js"
        integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"
        integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13"
        crossorigin="anonymous"></script>
</body>
</html>
